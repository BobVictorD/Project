package Application.Service;

import Application.Model.Spot;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ISpotService extends IService<Spot>{
}
