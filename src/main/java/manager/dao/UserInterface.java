package manager.dao;

import manager.model.User;

public interface UserInterface {
    void addUser(User user);

    User getUserById(int id);

    void updateUser(User user);

    void getUsersInfo();

    void getOneUserInfo();
}
