package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.entity.User;
import web.service.UserService;

import java.util.List;

@Controller
public class MyController {

    private final UserService userService;

    public MyController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public String showUsers(ModelMap model) {
        List<User> userList = userService.getAllUser();
        model.addAttribute("all_user", userList);
        return "all-users";
    }
}
