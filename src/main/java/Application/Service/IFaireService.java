package Application.Service;

import Application.Model.Faire;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IFaireService extends IService<Faire> {
}
