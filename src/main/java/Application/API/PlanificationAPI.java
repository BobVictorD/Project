package Application.API;

import Application.Model.Planification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/planification")
public class PlanificationAPI extends APIController<Planification>{
}
