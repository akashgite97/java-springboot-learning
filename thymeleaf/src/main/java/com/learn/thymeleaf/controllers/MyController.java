package com.learn.thymeleaf.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    @RequestMapping(value="/about",method = RequestMethod.GET)
    public String about(Model model){
        model.addAttribute("name", "akash gite");
        model.addAttribute("currentDate", new Date().toLocaleString());

        return "about";
        //about.html
    }

    @GetMapping("/loop")
    public String iterationHandler(Model model){
        List<String> names = List.of("ak","AG","PG");
        model.addAttribute("namesList", names);
        return "iterate";
    }

    @GetMapping("/condition")
    public String conditionalHandler(Model model){
        model.addAttribute("isActive", false);
        model.addAttribute("gender", "F");
        List<Integer> list = List.of(235,78,65);
        model.addAttribute("myList", list);
        return "condition";
    }

    @GetMapping("/service")
    public String fragmentHandler(Model model){
        model.addAttribute("title"," Service data from controller");
        model.addAttribute("currentDate",new Date().toLocaleString());
        return "service";
    }

    //inheriting concept
    @GetMapping("/aboutNew")
    public String inheritHandler(Model model){
        return "aboutNew";
    }
    
}
