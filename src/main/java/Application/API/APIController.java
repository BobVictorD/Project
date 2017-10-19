package Application.API;

import Application.Service.IService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import io.jsonwebtoken.impl.DefaultClaims;
import javafx.beans.binding.BooleanExpression;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public abstract class APIController<T> {

    @Autowired
    protected IService<T> serv;


    @RequestMapping(method = RequestMethod.GET)
    public List<T> get(){

        return serv.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public T get(@PathVariable("id") long id, HttpServletRequest request){
        return serv.findOne(id);
    }


    @RequestMapping(method = RequestMethod.POST)
    public T create(@RequestBody T obj, HttpServletRequest request){
        return  serv.saveAndFlush(obj);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public T update(@RequestBody T obj, @PathVariable("id") int id, HttpServletRequest request){
        return serv.saveAndFlush(obj);
    }

    @RequestMapping(value= "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id){
        serv.delete(Long.decode(id));
    }
}
