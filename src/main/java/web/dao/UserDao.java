package web.dao;

import web.entity.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUser();

    void saveUser(User user);

    User getUserById(int id);

    void deleteUser(int id);
}
