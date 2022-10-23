package com.example.kasa1;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    public String index() {
        System.out.println("Moj message z Kontrolera /");
        return "Pozdrowienia z Controller / !";
    }

}