package com.toy.springBoot1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @GetMapping("/page")
    public String welcomeMessage() {
        return "Congrats!!!";
    }
}
