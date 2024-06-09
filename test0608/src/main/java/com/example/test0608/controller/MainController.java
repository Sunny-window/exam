package com.example.test0608.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    
    @RequestMapping("/")
    public String root(){
        return "index";
    }

    @RequestMapping("/enroll")
    public String enroll(){
        return "enroll";
    }

    @RequestMapping("/subjectview")
    public String subjectView(){
        return "subjectview";
    }
}
