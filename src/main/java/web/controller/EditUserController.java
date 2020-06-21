package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.User;
import web.service.UserServiceImp;

@Controller
@ComponentScan("web")
public class EditUserController {

    @Autowired
    private UserServiceImp userService;

    @RequestMapping(
            value = "edit",
            params = {"id", "firstName", "lastName", "email"},
            method = RequestMethod.GET)
    public String editPageGet(ModelMap modelMap,
                              @RequestParam("id") Long id,
                              @RequestParam("firstName") String firstName,
                              @RequestParam("lastName") String lastName,
                              @RequestParam("email") String email) {
        modelMap.addAttribute("id", id);
        modelMap.addAttribute("firstName", firstName);
        modelMap.addAttribute("lastName", lastName);
        modelMap.addAttribute("email", email);
        return "edit";
    }

    @RequestMapping(
            value = "edit",
            params = {"id", "firstName", "lastName", "email"},
            method = RequestMethod.POST)
    public String editPagePost(ModelMap modelMap,
                               @RequestParam("id") Long id,
                               @RequestParam("firstName") String firstName,
                               @RequestParam("lastName") String lastName,
                               @RequestParam("email") String email) {
        userService.editUser(new User(id, firstName, lastName, email));
        return "redirect:/admin";
    }
}