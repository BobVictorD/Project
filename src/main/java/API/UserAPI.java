package API;

import Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class UserAPI  extends APIController<User>{


}
