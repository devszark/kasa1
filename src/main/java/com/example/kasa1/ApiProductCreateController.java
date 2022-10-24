package com.example.kasa1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiProductCreateController {
    /**
     * This controller responds to GET with parameters in URI
     * for example: http://localhost:8080/api/productCreate?name=sugar&price=20
     * as results it creates a new Product(name=sugar, price=20.0)
     * @return new Product(name=sugar, price=20.0)
     */
    @GetMapping("/api/productCreate")
    public Produkt processApiProductCreate(@RequestParam(value="name") String name,
                                           @RequestParam(value="price") Double price){
        System.out.println("Moj message z processApiProductCreate (/api/productCreate)");
        Produkt newprod = new Produkt(name,price);
        System.out.println("Nowy produkt: "+newprod);
        // This is place to store the new product (newprod) somewhere (file/db).
        return newprod;
    }
}
