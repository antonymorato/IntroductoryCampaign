package kpi.iasa.introductorycampaign.controller;



import kpi.iasa.introductorycampaign.domain.Role;
import kpi.iasa.introductorycampaign.domain.User;
import kpi.iasa.introductorycampaign.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.Map;
import java.util.ResourceBundle;

@Controller
public class RegistrationController {
    @Autowired
    UserService userService;



    @GetMapping("/registration")
    public String main(){
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(@RequestParam("role") String role ,User user, Map<String,Object> model)
    {
        User userFromDB= (User) userService.loadUserByUsername(user.getUsername());
     //
        if (userFromDB!=null)
        {
            model.put("message","User exists");
            return "registration";
        }
        System.out.println("Username:"+user.getUsername()+" Pass:"+user.getPassword());

        if (role.equals(Role.ADMIN.toString()))
            user.setRoles(Collections.singleton(Role.ADMIN));
        if (role.equals(Role.STUDENT.toString()))
            user.setRoles(Collections.singleton(Role.STUDENT));
        user.setActive(true);


        userService.addUser(user);

        return "redirect:/login";


    }



}
