package com.gebarowski.tutorial.web.htmlform;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("spring")
public class HomeController {


    @RequestMapping("")
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

    @RequestMapping("/processFormUpper2")
    public String changeToUppercase2(@RequestParam("studentName") String name, Model model) {
        var result = name.toUpperCase() + "" + "...";
        model.addAttribute("message", result);
        return "hello";
    }

}