package com.example.kasa1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TitleController {
    @GetMapping("/title")
    public String title(){
        System.out.println("Moj message z Kontrolera /title");
        return "title";
    }
}
