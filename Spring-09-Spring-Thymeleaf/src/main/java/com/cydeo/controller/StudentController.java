package com.cydeo.controller;

import com.cydeo.boostrap.DataGenarator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/register")
    public String register(Model model){
        model.addAttribute("students", DataGenarator.createStudent());


        return "s/student/register";
    }

    @RequestMapping("/welcome")
    public String info(){

        return "s/student/welcome";

    }
}
