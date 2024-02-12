package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.dao.UserDao;
import web.entity.User;

import java.util.List;

@Controller
public class MyController {

    private final UserDao userDao;

    public MyController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/users")
    public String showUsers(ModelMap model) {
        List<User> userList = userDao.getAllUser();
        model.addAttribute("all_user", userList);
        return "users";
    }
}
