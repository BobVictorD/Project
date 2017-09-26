package Application.API;


import Application.Model.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import java.util.Date;

@RestController
@RequestMapping("/auth")
public class AuthAPI {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody Login userparam) throws ServletException {

        String jwtToken = "";

        if (userparam.login == null || userparam.password == null) {
            throw new ServletException("Please fill in username and password");
        }

        String email = userparam.login;
        String password = userparam.password;

        User user = new User();
        user.setLogin("test");
        user.setPassword("test");

        if (user == null) {
            throw new ServletException("User email not found.");
        }

        String pwd = user.getPassword();

        if (!password.equals(pwd)) {
            throw new ServletException("Invalid login. Please check your name and password.");
        }

        jwtToken = Jwts.builder().setSubject(email).claim("roles", "user").setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "secretkey").compact();

        return jwtToken;
    }
}

class Login{
    public String login;
    public String password;
}
