package Application.API;

import Application.Model.Condition;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/condition")
public class ConditionAPI extends APIController<Condition> {
}
