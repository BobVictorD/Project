package Application.API;

import Application.Model.Activite;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activite")
public class ActiviteAPI extends APIController<Activite> {
}
