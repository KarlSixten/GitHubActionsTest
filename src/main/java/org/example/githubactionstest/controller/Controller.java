package org.example.githubactionstest.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("")
    public String getWelcome() {
        return "welcome";
    }

    @GetMapping("hello")
    public String getHello() {
        return "hello";
    }
}
