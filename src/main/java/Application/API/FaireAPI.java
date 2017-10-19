package Application.API;

import Application.Model.Activite;
import Application.Model.Faire;
import Application.Service.IActiviteService;
import Application.Service.IFaireService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.impl.DefaultClaims;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/faire")
public class FaireAPI extends APIController<Faire>{

    private IFaireService getService(){  return (IFaireService) this.serv;}

    @RequestMapping(method = RequestMethod.POST)
    public Faire create(@RequestBody Faire obj, HttpServletRequest request){
        String userLogin = ((DefaultClaims) request.getAttribute("claims")).getSubject();
        obj.setUser(serv.getAuthUser(userLogin));
        System.out.println("FAIRE : update");
        return  serv.saveAndFlush(obj);
    }

    @RequestMapping("/user")
    public List<Faire> getByUser(HttpServletRequest request){
        String userLogin = ((DefaultClaims) request.getAttribute("claims")).getSubject();
        return getService().findByUser(userLogin);
    }
}
