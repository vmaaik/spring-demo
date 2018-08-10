package com.gebarowski.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping("/showForm")
    public String showForm() {
        return "name-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "hello";
    }

}