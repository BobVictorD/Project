package Application.Service;

import Application.Model.Activite;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IActiviteService extends IService<Activite> {
}
