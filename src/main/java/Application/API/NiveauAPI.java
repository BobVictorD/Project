package Application.API;

import Application.Model.Niveau;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/niveau")
public class NiveauAPI extends APIController<Niveau> {
}
