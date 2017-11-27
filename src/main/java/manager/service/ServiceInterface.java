package manager.service;

import manager.model.User;

import java.util.List;

public interface ServiceInterface {
    void addUser(User user);

    User getUserById(int id);

    void updateUser(User user);

    List<User> getUsersInfo();
}
