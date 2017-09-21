package Application.DAO;

import Application.Model.Activite;
import Application.Model.User;

/*public class ActiviteDAO extends DAO<Activite> {

    final TypedQuery<Activite> findsActQueryString = getManager().createQuery("Select a From Activite a", Activite.class);
    final TypedQuery<Activite> findActQueryString = getManager().createQuery("Select a From Activite a where a.id=:id",Activite.class);

    public void create(Activite act) {
        getManager().persist(act);
    }

    public void delete(int id) {

    }

    public void update(Activite act) {
        Activite upAct = this.findActQueryString.setParameter("id",act.getId()).getSingleResult();
        upAct=act;
    }

    public List<Activite> find() {
        return this.findsActQueryString.getResultList();
    }

    public Activite find(int id) {
        return this.findActQueryString.setParameter("id",id).getSingleResult();
    }
}*/
