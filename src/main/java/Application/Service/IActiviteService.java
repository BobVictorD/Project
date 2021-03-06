package Application.Service;

import Application.Model.Activite;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IActiviteService extends IService<Activite> {

    @Query(value = "select f.activite from Faire f where f.user.login = ?1")
    List<Activite> findByUser(String login);
}
