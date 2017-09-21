package Application.DAO;

import Application.Model.Faire;
import Application.Model.User;

/*public class FaireDAO extends DAO<Faire> {

    final TypedQuery<Faire> findFaireQueryString = getManager().createQuery("Select a From Faire a",Faire.class);
    final TypedQuery<Faire> findsFaireQueryString = getManager().createQuery("Select a From Faire a where a.id=:id",Faire.class);
    final TypedQuery<Faire> findsFairebyUserQueryString = getManager().createQuery("Select a From Faire a where a.user.id=:userId",Faire.class);


    public void create(Faire obj) {

    }

    public void delete(int id) {

    }

    public void update(Faire obj) {

    }

    public List<Faire> find() {
        return this.findsFaireQueryString.getResultList();
    }

    public Faire find(int id) {
        return this.findFaireQueryString.setParameter("id", id).getSingleResult();
    }

    public List<Faire> findbyUser(int userId) {
        return this.findsFairebyUserQueryString.setParameter("userId",userId).getResultList();
    }
}*/
