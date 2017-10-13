package Application.API;

import Application.Model.Activite;
import Application.Service.IActiviteService;
import io.jsonwebtoken.impl.DefaultClaims;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/activite")
public class ActiviteAPI extends APIController<Activite> {

    private IActiviteService getService(){
        return (IActiviteService) this.serv;
    }

    @RequestMapping("/user")
    public List<Activite> getByUser(HttpServletRequest request){
        String userLogin = ((DefaultClaims) request.getAttribute("claims")).getSubject();
        /*return getService().findByUser(userLogin);*/
        return getService().findAll();
    }
}
