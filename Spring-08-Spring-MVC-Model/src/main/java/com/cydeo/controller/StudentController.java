package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){
        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");

        String subject = "Collections";
        model.addAttribute("subject", subject);

       int studentId = new Random().nextInt();
       model.addAttribute("randomNumber", studentId);

       List<Integer> number = new ArrayList<>();
       number.add(4);
       number.add(5);
       number.add(7);
       number.add(10);
       model.addAttribute("numbers", number);

       Student student = new Student(1,"Mike","Smith");
       model.addAttribute(student);

        return "i/students/welcome";
    }

}
