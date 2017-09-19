package Service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IService<T> extends JpaRepository<T,Long> {
}
