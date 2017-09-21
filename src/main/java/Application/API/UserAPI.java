package Application.API;


import Application.Model.User;
import Application.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/*public class UserAPI  extends APIController<User>{

}*/



@RestController
@RequestMapping("/user")
public class UserAPI  {

    @Autowired
    private IUserService serv;


    @RequestMapping(method = RequestMethod.GET)
    public List<User> get(){
        return serv.findAll();
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String get(@PathVariable("id") long id){
        return "it's fine";
    }


    @RequestMapping(method = RequestMethod.PUT)
    public User create(@RequestBody User obj){
        return  serv.save(obj);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public User update(@RequestBody User obj, @PathVariable("id") int id){
        return serv.save(obj);
    }



}
