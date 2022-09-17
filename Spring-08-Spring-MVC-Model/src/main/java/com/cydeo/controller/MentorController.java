package com.cydeo.controller;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.util.ArrayList;
import com.cydeo.enums.Gender;
import java.util.List;

@Controller
public class MentorController {

    @RequestMapping("/mentor")
    public String mentorCreation(Model model){

        List<Mentor> mentorList = new ArrayList<>();

        mentorList.add(new Mentor("Mike","Smith",45, Gender.MALE));
        mentorList.add(new Mentor("Tom","Hanks",65, Gender.FEMALE));
        mentorList.add(new Mentor("Ammy","Bryan",45, Gender.MALE));

        model.addAttribute("mentors",mentorList);

        return "i/mentors/mentor";
    }
}
