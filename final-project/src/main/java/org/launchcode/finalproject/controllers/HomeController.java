package org.launchcode.finalproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("title", "$$ Financial Lessons for Beginners $$");
        return "index";
    }

    @GetMapping ("index")
    public String index1(Model model) {
        model.addAttribute("title", "$$ Financial Lessons for Beginners $$");
        return "index";
    }

    @GetMapping ("startPage")
    public String  displayStartPage(Model model) {
        model.addAttribute("title", "$$ Financial Lessons for Beginners $$");
        return "startPage";
    }

    @GetMapping ("/lessons/Economy")
    public String  displayEconomy(Model model) {
        model.addAttribute("title", "The U.S. Economy");
        return "/lessons/Economy";
    }

    @GetMapping ("/lessons/debtStrategies")
    public String  displayDebtStrategies(Model model) {
        model.addAttribute("title", "Debt Strategies");
        return "/lessons/debtStrategies";
    }

    @GetMapping ("/SpendingTracker")
    public String  displaySpendingTracker(Model model) {
        model.addAttribute("title", "Spending Tracker");
        return "/SpendingTracker";
    }
}
