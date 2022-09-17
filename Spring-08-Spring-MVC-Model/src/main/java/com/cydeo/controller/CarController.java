package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping("/car")
public class CarController {

    @RequestMapping("/info")
    public String carInfo(@RequestParam String make,@RequestParam Integer year, Model model){

        //http://localhost:8080/car/info?make=Honda&year=2015
        model.addAttribute("make", make);
        model.addAttribute("year", year);
        System.out.println(make);
        return "i/car/car_info";
    }

    @RequestMapping("/info2")
    public String carInfo2(@RequestParam(value = "make", required = false, defaultValue = "Tesla") String make, Model model){

        //http://localhost:8080/car/info?make=Honda&year=2015
        model.addAttribute("make", make);
        System.out.println(make);
        return "i/car/car_info";
    }

    @RequestMapping("info/{make}/{year}")          //http://localhost:8080/car/info/honda
    public String getCarInfo(@PathVariable String make,@PathVariable Integer year, Model model){
        model.addAttribute("make", make);
        model.addAttribute("year", year);
        return "i/car/car_info";

    }


}
