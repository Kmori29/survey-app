package com.example.survey_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SurveryAppController {
    
    @GetMapping("/")
    private String index(){
        return "index";
    }
}
