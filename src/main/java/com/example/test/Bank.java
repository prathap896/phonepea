package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Bank {
    @GetMapping("/Bank")
    public String other(){

        return "Bank";

    }

}

