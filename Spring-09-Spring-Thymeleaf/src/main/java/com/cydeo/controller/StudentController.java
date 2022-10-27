package com.cydeo.controller;

import com.cydeo.boostrap.DataGenarator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student")
public class StudentController {

//    @RequestMapping(value = "/register", method = RequestMethod.GET)
    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("students", DataGenarator.createStudent());


        return "s/student/register";
    }

    @RequestMapping("/welcome")
    public String info(){

        return "s/student/welcome";

    }
}
