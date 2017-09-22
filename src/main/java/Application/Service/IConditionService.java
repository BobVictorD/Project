package Application.Service;

import Application.Model.Condition;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IConditionService extends IService<Condition> {
}
