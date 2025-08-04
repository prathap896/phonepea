package com.example.test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//    http://localhost:8080/welcome
@Controller
public class Test {
    @GetMapping("/test")
    public String other(){

        return "test";

    }


}
