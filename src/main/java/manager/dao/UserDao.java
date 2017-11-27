package manager.dao;

import manager.model.User;
import manager.singleton.session.SingletonSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserDao implements UserInterface {

    Session session = SingletonSession.getSessionFactory().getCurrentSession();

    public void addUser(User user) {

    }

    public User getUserById(int id) {
        return null;
    }

    public void updateUser(User user) {

    }

    public void getUsersInfo() {

    }

    public void getOneUserInfo() {

    }
}
