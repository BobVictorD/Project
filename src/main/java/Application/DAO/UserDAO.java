package Application.DAO;

import Application.Model.User;

/*public class UserDAO extends DAO<User> {

    final TypedQuery<User> findUsersQueryString = getManager().createQuery("Select a From User a",User.class);
    final TypedQuery<User> findUserQueryString = getManager().createQuery("Select a From User a where a.id=:id",User.class);

    public UserDAO() {
        super();
    }

    public void create(User user) {
        getManager().persist(user);
    }

    public void delete(int id) {}

    public void update(User user) {
        User upUser = this.findUserQueryString.setParameter("id",user.getId()).getSingleResult();
        upUser=user;
    }

    public List<User> find() {
        return this.findUsersQueryString.getResultList();
    }

    public User find(int id) {
        return this.findUserQueryString.setParameter("id",id).getSingleResult();
    }
}*/
