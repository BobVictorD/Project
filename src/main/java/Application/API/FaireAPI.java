package Application.API;

import Application.Model.Faire;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.impl.DefaultClaims;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/faire")
public class FaireAPI extends APIController<Faire>{

    @RequestMapping(method = RequestMethod.POST)
    public Faire create(@RequestBody Faire obj, HttpServletRequest request){
        String userLogin = ((DefaultClaims) request.getAttribute("claims")).getSubject();
        obj.setUser(serv.getAuthUser(userLogin));
        return  serv.saveAndFlush(obj);
    }
}
