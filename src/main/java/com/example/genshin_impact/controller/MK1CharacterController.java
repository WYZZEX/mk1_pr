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
    @GetMapping("/characters/kung_lao")
    public String showLiuKangDetails(Model model) {
        MK1Character liuKang = mk1CharacterService.getKungLaoDetails();
        model.addAttribute("mk1Character", liuKang);
        return "kung-lao-details"; // Имя вашего HTML-шаблона для Scorpion
    }
    @GetMapping("/characters/ashrah")
    public String showAshrahDetails(Model model) {
        MK1Character ashrah = mk1CharacterService.getAshrahDetails();
        model.addAttribute("mk1Character", ashrah);
        return "ashrah-details"; // Имя вашего HTML-шаблона для Scorpion
    }
    @GetMapping("/characters/rain")
    public String showRainDetails(Model model) {
        MK1Character rain = mk1CharacterService.getRainDetails();
        model.addAttribute("mk1Character", rain);
        return "rain-details"; // Имя вашего HTML-шаблона для Scorpion
    }
    @GetMapping("/characters/smoke")
    public String showSmokeDetails(Model model) {
        MK1Character smoke = mk1CharacterService.getSmokeDetails();
        model.addAttribute("mk1Character", smoke);
        return "smoke-details"; // Имя вашего HTML-шаблона для Scorpion
    }
    @GetMapping("/characters/kitana")
    public String showKitanaDetails(Model model) {
        MK1Character kitana = mk1CharacterService.getKitanaDetails();
        model.addAttribute("mk1Character", kitana);
        return "kitana-details"; // Имя вашего HTML-шаблона для Scorpion
    }
    @GetMapping("/characters/mileena")
    public String showMileenaDetails(Model model) {
        MK1Character mileena = mk1CharacterService.getMileenaDetails();
        model.addAttribute("mk1Character", mileena);
        return "mileena-details"; // Имя вашего HTML-шаблона для Scorpion
    }
    @GetMapping("/characters/raiden")
    public String showRaidenDetails(Model model) {
        MK1Character raiden = mk1CharacterService.getRaidenDetails();
        model.addAttribute("mk1Character", raiden);
        return "raiden-details"; // Имя вашего HTML-шаблона для Scorpion
    }
    @GetMapping("/characters/geras")
    public String showGerasDetails(Model model) {
        MK1Character geras = mk1CharacterService.getGerasDetails();
        model.addAttribute("mk1Character", geras);
        return "geras-details"; // Имя вашего HTML-шаблона для Scorpion
    }
    @GetMapping("/characters/li_mei")
    public String showLiMeiDetails(Model model) {
        MK1Character limei = mk1CharacterService.getLiMeiDetails();
        model.addAttribute("mk1Character", limei);
        return "li-mei-details"; // Имя вашего HTML-шаблона для Scorpion
    }
    @GetMapping("/characters/baraka")
    public String showBarakaDetails(Model model) {
        MK1Character baraka = mk1CharacterService.getBarakaDetails();
        model.addAttribute("mk1Character", baraka);
        return "baraka-details"; // Имя вашего HTML-шаблона для Scorpion
    }
    @GetMapping("/characters/tanya")
    public String showTanyaDetails(Model model) {
        MK1Character tanya = mk1CharacterService.getTanyaDetails();
        model.addAttribute("mk1Character", tanya);
        return "tanya-details"; // Имя вашего HTML-шаблона для Scorpion
    }
    @GetMapping("/characters/reptile")
    public String showReptileDetails(Model model) {
        MK1Character reptile = mk1CharacterService.getReptileDetails();
        model.addAttribute("mk1Character", reptile);
        return "reptile-details"; // Имя вашего HTML-шаблона для Scorpion
    }
    @GetMapping("/characters/sindel")
    public String showSindelDetails(Model model) {
        MK1Character sindel = mk1CharacterService.getSindelDetails();
        model.addAttribute("mk1Character", sindel);
        return "sindel-details"; // Имя вашего HTML-шаблона для Scorpion
    }
    @GetMapping("/characters/nitara")
    public String showNitaraDetails(Model model) {
        MK1Character nitara = mk1CharacterService.getNitaraDetails();
        model.addAttribute("mk1Character", nitara);
        return "nitara-details"; // Имя вашего HTML-шаблона для Scorpion
    }
    @GetMapping("/characters/shang_qung")
    public String showShangQungDetails(Model model) {
        MK1Character shangQung = mk1CharacterService.getShangQungDetails();
        model.addAttribute("mk1Character", shangQung);
        return "shang-qung-details"; // Имя вашего HTML-шаблона для Scorpion
    }
    @GetMapping("/characters/reiko")
    public String showReikoDetails(Model model) {
        MK1Character reiko = mk1CharacterService.getReikoDetails();
        model.addAttribute("mk1Character", reiko);
        return "reiko-details"; // Имя вашего HTML-шаблона для Scorpion
    }
    @GetMapping("/characters/kenshi")
    public String showKenshiDetails(Model model) {
        MK1Character kenshi = mk1CharacterService.getKenshiDetails();
        model.addAttribute("mk1Character", kenshi);
        return "kenshi-details"; // Имя вашего HTML-шаблона для Scorpion
    }
}
