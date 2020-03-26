package kpi.iasa.introductorycampaign.controller;

import kpi.iasa.introductorycampaign.domain.Student;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author Anton Korol
 *
 * created on 16/03/2020
 *
 */


@Controller
@RequestMapping("/student")
@PreAuthorize("hasAuthority('STUDENT')")
public class StudentController {

    @GetMapping
    public String main()
    {
        return "student";
    }


    @PostMapping()
    public String editStudentInfo(Student student, Model model)
    {



        return "student";
    }



}
