package Application.API;

import Application.Model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserAPI extends APIController<User> {

}
