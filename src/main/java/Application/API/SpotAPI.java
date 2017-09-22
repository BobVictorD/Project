package Application.API;

import Application.Model.Spot;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spot")
public class SpotAPI extends APIController<Spot> {
}
