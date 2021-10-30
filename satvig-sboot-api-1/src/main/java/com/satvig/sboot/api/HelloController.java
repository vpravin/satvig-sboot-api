package com.satvig.sboot.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/api")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}