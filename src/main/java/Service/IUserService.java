package Service;

import Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserService extends JpaRepository<User,Long> {

}
