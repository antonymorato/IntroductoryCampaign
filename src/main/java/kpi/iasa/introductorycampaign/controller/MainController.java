package kpi.iasa.introductorycampaign.controller;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateMethodModel;
import freemarker.template.TemplateModelException;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.context.MessageSource;
import org.springframework.orm.hibernate5.SpringSessionContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.function.ServerResponse;

import java.io.IOException;
import java.util.*;

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

    @GetMapping("/access")
    public String getAccess()
    {return "access";}

}

