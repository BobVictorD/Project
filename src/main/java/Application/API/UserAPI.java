package Application.API;

import Application.Model.Activite;
import Application.Model.User;
import Application.Service.IActiviteService;
import Application.Service.IUserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.DefaultClaims;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserAPI extends APIController<User> {

    private IUserService getService(){
        return (IUserService) this.serv;
    }

    @RequestMapping("/me")
    public User getByUser(HttpServletRequest request) throws ServletException {
        String userLogin = ((DefaultClaims) request.getAttribute("claims")).getSubject();
        return getService().findByLogin(userLogin).get(0);
    }
}
