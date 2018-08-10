package com.gebarowski.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping("/processFormUpper")
    public String changeToUppercase(HttpServletRequest request, Model model) {
        var name = request.getParameter("studentName");
        var result = name.toUpperCase() + "" + "!";
        model.addAttribute("message", result);
        return "hello";
    }

}