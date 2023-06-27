package com.wildcodeschool.myProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DoctorController {

    @GetMapping("/doctor/{id}")
    @ResponseBody
    public String index(@PathVariable int id) {
        switch (id) {
            case 1:
                return "<h1>William Hartnell</h1>";
            case 10:
                return "<h1>David Tennant</h1>";
            case 13:
                return "<h1>Jodie Whittaker</h1>";
            default:
                return "<h1>Choix incorrect</h1>";
        }
    }
}

