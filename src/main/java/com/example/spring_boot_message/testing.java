package com.example.spring_boot_message;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@CrossOrigin
public class testing {



    @RequestMapping(method = RequestMethod.GET)
    public String getAllProduit() {
        //r//eturn produitService.getAllProduit();
        return  "I love u Baby <3 <3 <3 ";
    }



}
