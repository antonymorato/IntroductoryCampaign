package kpi.iasa.introductorycampaign.controller;

import kpi.iasa.introductorycampaign.domain.Student;
import kpi.iasa.introductorycampaign.domain.User;
import kpi.iasa.introductorycampaign.service.StudentService;
import kpi.iasa.introductorycampaign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.Map;
import java.util.Optional;


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

    @Autowired
    UserService userService;

    @Autowired
    StudentService studentService;


    @GetMapping
    public String main(Principal principal, Map<String,Object> model)
    {
        User user=(User)userService.loadUserByUsername(principal.getName());
        model.put("user",user);
        Optional<Student> student=studentService.findById(user.getId());
        if (student.isPresent())
        {
            model.put("rating",student.get().getRating());
        }
        return "student";
    }

    @GetMapping("{userId}")
    public String studentInfo(@PathVariable Long userId,Map<String,Object> model){
        model.put("userId",userId);

        return "studentEdit";
    }

    @PostMapping("{userId}")
    public String editStudentInfo(@PathVariable Long userId,Student student, Model model)
    {


        System.out.println("firstname:"+student.getFirstName()+" lstname:"+student.getLastName());

     //   studentService.saveStudent(student);
        return "redirect:/student";
    }



}
