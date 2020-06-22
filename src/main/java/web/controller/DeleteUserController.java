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

@Controller
@ComponentScan("web")
public class DeleteUserController {
    @Autowired
    private UserServiceImp userService;

    @RequestMapping(
            value = "delete",
            params = {"id", "firstName", "lastName", "email"},
            method = RequestMethod.POST)
    public String editPagePost(ModelMap modelMap, @ModelAttribute User user) {
        userService.deleteUser(user);
        return "redirect:/admin";
    }
}
