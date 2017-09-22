package Application.API;

import Application.Service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class APIController<T> {

    @Autowired
    protected IService<T> serv;


    @RequestMapping(method = RequestMethod.GET)
    public List<T> get(){
        return serv.findAll();
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public T get(@PathVariable("id") long id){
        return serv.findOne(id);
    }


    @RequestMapping(method = RequestMethod.PUT)
    public T create(@RequestBody T obj){
        return  serv.save(obj);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public T update(@RequestBody T obj, @PathVariable("id") int id){
        return serv.save(obj);
    }

}
