package com.mvc.educentr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mentor")
public class MentorController {
    @GetMapping("")
    public String mentormain(){
        return "indexmentor";
    }

    @GetMapping("/addCourse")
    public String addCourse(){
        return "addCourse";
    }

    @GetMapping("/journal")
    public String journal(){
        return "journal";
    }
}
