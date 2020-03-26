package kpi.iasa.introductorycampaign.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@Controller
@RequestMapping("/admin")
@PreAuthorize("hasAuthority('ADMIN')")
public class AdminController {


    @GetMapping
    public String main()
    {
        return "adminPage";
    }

    @GetMapping("{student}")
    public String userEditForm( Model model)
    {
        return "studentEdit";
    }

    @PostMapping
    public String userSave(
            @RequestParam String rating,
            @RequestParam Map<String,String> form)
    {






        return "redirect:/student";
    }



}
