package Application.Service;

import Application.Model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IUserService extends IService<User> {

    public List<User> findByLoginAndPassword(String login, String password);
}