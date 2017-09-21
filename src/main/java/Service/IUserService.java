package Service;

import Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/*@Service
public interface IUserService extends IService<User> {

}*/


@Service
public interface IUserService extends JpaRepository<User,Long> {

}