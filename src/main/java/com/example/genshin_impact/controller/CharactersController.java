package com.example.genshin_impact.controller;

import com.example.genshin_impact.entity.MK1Character;
import com.example.genshin_impact.service.MK1CharacterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CharactersController {

    private final MK1CharacterService mk1CharacterService;

    public CharactersController(MK1CharacterService mk1CharacterService) {
        this.mk1CharacterService = mk1CharacterService;
    }

    @GetMapping("/characters")
    public String showCharactersPage(Model model) {
        List<MK1Character> characters = mk1CharacterService.getAllCharacters();
        model.addAttribute("characters", characters);
        return "characters-list";
    }
}