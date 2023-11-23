package com.example.spring_boot_message;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@CrossOrigin
public class testing {



    @RequestMapping(method = RequestMethod.GET)
    public String getAllProduit() {
        //r//eturn produitService.getAllProduit();
        return  "I love u Baby <3 <3 <3 ";
    }

    @GetMapping("/hello")
    public String hello() {
        return "  ❤ ❤\uFE0F ❤\uFE0F ❤\uFE0F ❤ ❤ yassmina ❤ ❤\uFE0F ❤\uFE0F ❤\uFE0F ❤ ❤ ";
    }


}
