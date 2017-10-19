package Application.Service;

import Application.Model.Activite;
import Application.Model.Faire;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IFaireService extends IService<Faire> {

    @Query(value = "select f from Faire f where f.user.login = ?1")
    List<Faire> findByUser(String login);
}
