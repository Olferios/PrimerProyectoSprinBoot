package com.tipo2.tipo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.tipo2.tipo2.model.User;

@Controller

public class UserController {
    @GetMapping("/details")
public String details(Model model){
User user = new User("Johlver","Pardo");
model.addAttribute("title", "Desarrollando con Spring bootCreativeCode");
model.addAttribute("user", user);
return "details";
}
}
