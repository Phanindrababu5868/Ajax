package com.example.Ajax.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Contoller {
    @GetMapping("/call")
    public String call(){
        return "call fro AJex()";
    }
}
