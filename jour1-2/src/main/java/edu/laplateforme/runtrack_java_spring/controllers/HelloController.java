package edu.laplateforme.runtrack_java_spring.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Value("${greetings.message}")
    private String greeting;

    @GetMapping
    public String HelloMethod() {
        return greeting;
    }

}


