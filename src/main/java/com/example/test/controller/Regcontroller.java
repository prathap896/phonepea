package com.example.test.controller;


import com.example.test.entity.Regentity;
import com.example.test.service.Regservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Regcontroller {

    @Autowired
    private Regservice regservice;

    @PostMapping ("/reg")
    public String regcont(@ModelAttribute Regentity regentity , Model model){
                regservice.storereg(regentity);
                model.addAttribute(" message","register sucssfull");
                return "loginpage";



    }
}
