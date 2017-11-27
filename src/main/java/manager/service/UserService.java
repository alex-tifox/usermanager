package manager.service;

import manager.dao.UserDao;
import manager.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import javax.transaction.Transactional;

import java.util.List;

public class UserService implements ServiceInterface {

    @Autowired
    UserDao userDao;

    @Transactional
    public void addUser(User user) {
        this.userDao.addUser(user);
    }

    @Transactional
    public User getUserById(int id) {
        return this.userDao.getUserById(id);
    }

    @Transactional
    public void updateUser(User user) {
        this.userDao.updateUser(user);
    }

    @Transactional
    public List<User> getUsersInfo() {
        return this.userDao.getUsersInfo();
    }
}
