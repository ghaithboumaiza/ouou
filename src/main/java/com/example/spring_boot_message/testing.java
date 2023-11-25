package com.example.spring_boot_message;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@CrossOrigin
public class testing {



    @RequestMapping(method = RequestMethod.GET)
    public String getAllProduit() {
        //r//eturn produitService.getAllProduit();
        return  "I love u Baby  hh ";
    }

    @GetMapping("/hello")
    public String hello() {
        return "  ❤ ❤\uFE0F ❤\uFE0F  ❤\uFE0F ❤ ❤ yassmina ❤ ❤\uFE0F ❤\uFE0F ❤\uFE0F ❤ ❤ ";
    }   
    @GetMapping("/sou")
    public String siy() {
        return "  ❤ ❤\uFE0F ❤\uFE0F ❤\uFE0F ❤ ❤ bonjour ya a7la hob f hyety ❤ ❤\uFE0F ❤\uFE0F ❤\uFE0F ❤ ❤ ";
    }

}
