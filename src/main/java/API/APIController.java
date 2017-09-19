package API;

import Service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class APIController<T> {

    @Autowired
    private IService<T> serv;


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<T> get(){
        return serv.findAll();
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public T get(@PathVariable("id") long id){
        return serv.findOne(id);
    }


    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public T create(@RequestBody T obj){
        return  serv.save(obj);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    @ResponseBody
    public T update(@RequestBody T obj, @PathVariable("id") int id){
        return serv.save(obj);
    }

}
