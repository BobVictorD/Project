package Application.API;


import Application.Model.Authentication;
import Application.Model.User;
import Application.Service.AuthService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import java.util.Date;

@RestController
@RequestMapping("/auth")
public class AuthAPI {

    @Autowired
    protected AuthService serv;


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody Authentication userparam) throws ServletException {

        String jwtToken = "";


        if (!serv.validate(userparam)) {
            throw new ServletException("Please fill in username and password");
        }

        try {
            serv.connect(userparam);
        }catch (NotFoundException ex){
            throw new ServletException(ex.getMessage());
        }


        jwtToken = Jwts.builder().setSubject(userparam.login).claim("roles", "user").setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "secretkey").compact();

        return jwtToken;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public User register(@RequestBody Authentication userparam) throws ServletException {

        if (!serv.validate(userparam)) {
            throw new ServletException("Please fill in username and password");
        }

        return serv.register(userparam);


    }
}