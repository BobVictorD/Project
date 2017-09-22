package Application.API;

import Application.Model.Faire;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/faire")
public class FaireAPI extends APIController<Faire>{
}
