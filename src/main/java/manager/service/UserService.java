package manager.service;

import manager.dao.UserDao;
import manager.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService implements ServiceInterface {

    @Autowired
    UserDao userDao;


    public void addUser(User user) {
        
    }

    public User getUserById(int id) {
        return null;
    }

    public void updateUser(User user) {

    }

    public List<User> getUsersInfo() {
        return null;
    }
}
