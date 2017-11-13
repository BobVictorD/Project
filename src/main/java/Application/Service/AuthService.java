package Application.Service;

import Application.Model.Authentication;
import Application.Model.User;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthService {

    @Autowired
    public IUserService userServ;

     public boolean validate(Authentication authObj){
         return authObj.login!=null && authObj.password!=null;
     }

     public boolean exist(String login){
         return userServ.findByLogin(login).size()>0;
     }

     public User register(Authentication authObj) throws Exception {
         if(exist(authObj.login)){
             throw new Exception("Ce login est déjà utilisé, veuillez en choisir un autre");
         }
         User user = new User();
         user.setLogin(authObj.login);
         user.setPassword(authObj.password);

         return userServ.save(user);
     }

     public void connect (Authentication authObj) throws NotFoundException {
         List<User> users = userServ.findByLoginAndPassword(authObj.login, authObj.password);

         if(users.size()==0){
             throw new NotFoundException("L'identifiant utilisateur ou le mot de passe sont incorrect.");
         }

     }
}
