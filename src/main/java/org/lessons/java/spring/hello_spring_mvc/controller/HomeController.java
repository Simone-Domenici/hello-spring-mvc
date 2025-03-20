package org.lessons.java.spring.hello_spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name", name);
        model.addAttribute("email", name + "@gmail.com");

        return "greeting";
    }

    
}