package Application.API;

import Application.Model.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserAPI extends APIController<User> {
}
