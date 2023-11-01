package com.example.genshin_impact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String common(Model model){
        model.addAttribute("tittle", "Main page");
        return "common";
    }
}
