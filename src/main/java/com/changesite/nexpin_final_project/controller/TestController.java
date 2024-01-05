package com.changesite.nexpin_final_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/require-auth")
    public String requireAuth(){
        return "SUCCESS";
    }

    @GetMapping("/not-require-auth")
    public String notRequireAuth(){
        return "SUCCESS";
    }
}
