package Application.Service;

import Application.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface IService<T> extends JpaRepository<T,Long> {

    @Query(value = "select u from User u Where u.login=?1")
    User getAuthUser(String login);
}
