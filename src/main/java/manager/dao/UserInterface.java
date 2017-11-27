package manager.dao;

import manager.model.User;

import java.util.List;

public interface UserInterface {
    void addUser(User user);

    User getUserById(int id);

    void updateUser(User user);

    List<User> getUsersInfo();

}
