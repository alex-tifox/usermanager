package manager.dao;

import manager.model.User;
import manager.singleton.session.SingletonSession;
import org.hibernate.Session;

import java.util.List;

public class UserDao implements UserInterface {

    Session session = SingletonSession.getSessionFactory().getCurrentSession();

    public void addUser(User user) {
        session.persist(user);
    }

    public User getUserById(int id) {
        User user = (User) session.load(User.class, new Integer(id));
        return user;
    }

    public void updateUser(User user) {
        session.update(user);
    }

    public List<User> getUsersInfo() {
        List<User> bookList = session.createQuery("from User").list();

        return bookList;
    }

}
