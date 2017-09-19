
import Model.Faire;
import Model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;


public class JpaTest {

    private EntityManager manager;

    public JpaTest(EntityManager manager) {
        this.manager = manager;
    }
    /**
     * @param args
     */



    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("dev");
        EntityManager manager = factory.createEntityManager();
        JpaTest test = new JpaTest(manager);

        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        try {
            test.createUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
        tx.commit();

        test.listUsers();

        manager.close();
        System.out.println(".. done");
    }

    private void createUser() {
        int numOfEmployees = manager.createQuery("Select a From User a", User.class).getResultList().size();
        if (numOfEmployees == 0) {
            User user = new User();
            user.setNom("toto");
            manager.persist(user);

            manager.persist(new Faire());
            manager.persist(new Faire());

        }
    }

    private void listUsers() {
        List<User> resultList = manager.createQuery("Select a From User a", User.class).getResultList();
        System.out.println("num of User:" + resultList.size());
        for (User next : resultList) {
            System.out.println("next User: " + next);
        }
    }

}
