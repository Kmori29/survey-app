package com.example.survey_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.survey_app.entity.SurveryAppEntity;

@Controller
public class SurveryAppController {
    
    @GetMapping("/")
    private String index(){
        return "index";
    }

    @GetMapping("/survery")
    private String survery() {
        return "survery";
    }

    @PostMapping("/result")
    public String displayText(@RequestParam String name, String answer, Model model) {
        SurveryAppEntity sae = new SurveryAppEntity(name, answer);
        model.addAttribute("sae", sae);
        return "result";
    }
}
