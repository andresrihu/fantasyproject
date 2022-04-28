package com.fantasy.backend.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController implements ErrorController {

    @GetMapping(value = { "/" })
    public String index() {
        return "forward:/index.html";
    }

    @GetMapping("/error")
    public String errorMap() {
        return "redirect:/";
    }

}
