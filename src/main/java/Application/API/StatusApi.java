package Application.API;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusApi {

    @RequestMapping("/status")
    public String get(){
        return "OK";
    }

}
