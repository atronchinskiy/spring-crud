package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.User;
import web.service.UserServiceImp;

import java.util.List;

@Controller
@RequestMapping("/")
@ComponentScan("web")
public class AdminController {

    @Autowired
    private UserServiceImp userService;

    @RequestMapping(value = "admin", method = RequestMethod.GET)
    public String adminPageGet(ModelMap modelMap) {
        List<User> userList = userService.getUsers();
        modelMap.addAttribute("users", userList);
        return "admin";
    }

    @RequestMapping(
            value = "admin",
            params = {"firstName", "lastName", "email"},
            method = RequestMethod.POST)
    public String adminPagePost(ModelMap modelMap, @ModelAttribute User user) {
        userService.addUser(user);
        return "redirect:/admin";
    }


}
