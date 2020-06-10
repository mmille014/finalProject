package org.launchcode.finalproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping
    public String index(Model model) {
        model.addAttribute("title", "$$ Financial Lessons for Beginners $$");
        return "index";
    }

    @GetMapping ("startPage")
    public String  displayStartPage(Model model) {
        model.addAttribute("title", "$$ Financial Lessons for Beginners $$");
        return "startPage";
    }
}
