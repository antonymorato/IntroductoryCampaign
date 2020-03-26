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

import java.util.Collections;
import java.util.Map;

@Controller
public class RegistrationController {
    @Autowired
    UserService userService;



    @GetMapping("/registration")
    public String main(){
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user, Map<String,Object> model)
    {
      //  User userFromDB= (User) userService.loadUserByUsername(user.getUsername());
     //
        System.out.println("Username:"+user.getUsername()+" Pass:"+user.getPassword());
    if (user==null)
        System.out.println("wtf");
    else
        System.out.println("ok");
        user.setActive(true);
        user.setRoles(Collections.singleton(Role.ADMIN));
        userService.addUser(user);

        return "redirect:/login";


    }



}
