package web.service;

import web.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    void saveUser(User user);

    User getUserById(int id);

    void deleteUser(int id);
}
