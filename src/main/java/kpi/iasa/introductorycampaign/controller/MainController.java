package kpi.iasa.introductorycampaign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
//
    @Autowired
    MessageSource messageSource;


    @GetMapping
    public String mainPage()

    {

        return "main";
    }

    @GetMapping("/accessDenied")
    public String getAccess()
    {return "accessDenied";}

}

