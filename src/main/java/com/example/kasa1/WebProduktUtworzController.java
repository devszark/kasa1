package com.example.kasa1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web/produktUtworz")
public class WebProduktUtworzController {

    @GetMapping
    public String showProduktUtworz(Model model){
        return "produkt";
    }

    @PostMapping
    public String processWebUtworzProdukt(Produkt produkt){
        // Tu moge zapisac nowy produkt do bazy danych
        System.out.println("Moj message z processWebUtworzProdukt: "+produkt);
        return "produkt";
    }
}
