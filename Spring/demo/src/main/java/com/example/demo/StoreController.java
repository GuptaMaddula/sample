package com.example.demo; // Make sure this matches your project's package!

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to The Universal Store API! The server is up and running.";
    }
}
