package com.sda.construction.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class IndexController {

    //asta vrem sa o gasim la localhost:8080/welcome
    @GetMapping(path = "welcome")
    public String welcome() {
        return "Welcome to home page";
    }

    //asta vrem sa o gasim la localhost:8080/bye
    @GetMapping(path="bye")
    public String byeBye() {
        return "Goodbye";
    }
}
