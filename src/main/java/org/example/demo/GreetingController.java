package org.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/form")
    public String GetForm( ) {
        return "list";
    }
    @PostMapping("/money")
    public ModelAndView Money(@RequestParam double money) {
        ModelAndView modelAndView=new ModelAndView("list");
        double vnd = money * 2500;
        modelAndView.addObject("vnd", vnd);
        return modelAndView;
    }
}