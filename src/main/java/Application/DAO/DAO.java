package Application.DAO;

//import Application.utils.EntityManagerHelper;
import javax.persistence.EntityManager;
import java.util.List;

/// la gestion des transactions est faite par le service associé afin qu'il n'y est qu'une seul transaction par requéte REST

/*public abstract class DAO<T> {

    public abstract void create(T obj);
    public abstract void delete(int id);
    public abstract void update(T obj);
    public abstract List<T> find();
    public abstract T find(int id);

    protected EntityManager getManager(){
        return EntityManagerHelper.getEntityManager();
    }

    public void begin(){
        EntityManagerHelper.beginTransaction();
    }

    public void commit() { EntityManagerHelper.commit(); }

}*/
