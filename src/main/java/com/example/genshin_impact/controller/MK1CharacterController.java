package com.example.genshin_impact.controller;

import com.example.genshin_impact.entity.MK1Character;
import com.example.genshin_impact.service.MK1CharacterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MK1CharacterController {

    private final MK1CharacterService mk1CharacterService;

    public MK1CharacterController(MK1CharacterService mk1CharacterService) {
        this.mk1CharacterService = mk1CharacterService;
    }

    @GetMapping("/characters/scorpion")
    public String showScorpionDetails(Model model) {
        MK1Character scorpion = mk1CharacterService.getScorpionDetails();
        model.addAttribute("mk1Character", scorpion);
        return "scorpion-details"; // Имя вашего HTML-шаблона для Scorpion
    }

    @GetMapping("/characters/subzero")
    public String showSubZeroDetails(Model model) {
        MK1Character subZero = mk1CharacterService.getSubZeroDetails();
        model.addAttribute("mk1Character", subZero);
        return "subzero-details";
    }
    @GetMapping("/characters/johnny_cage")
    public String showJohnyCageDetails(Model model) {
        MK1Character johnnyCage = mk1CharacterService.getJohnnyCageDetails();
        model.addAttribute("mk1Character", johnnyCage);
        return "johnny-cage-details"; // Имя вашего HTML-шаблона для Scorpion
    }
}
