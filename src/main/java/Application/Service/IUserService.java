package Application.Service;

import Application.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/*@Application.Service
public interface IUserService extends IService<User> {

}*/


@Transactional
public interface IUserService extends JpaRepository<User,Long> {

}