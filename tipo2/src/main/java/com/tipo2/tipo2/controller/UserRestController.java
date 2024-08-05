package com.tipo2.tipo2.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

import com.tipo2.tipo2.model.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class UserRestController {
    @GetMapping("/details")
    public Map<String, Object> details() {
        User user = new User("Johlver", "Pardo");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Desarrollando con Spring boot CreativeCode");
        body.put("user", user);
        return body;
    }
}
