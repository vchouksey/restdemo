package com.example.restdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class StudentController {

    public StudentController() {
    }

    @GetMapping("/")
    public String all() {
        return "HelloWorld";
    }
}
