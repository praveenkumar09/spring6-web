package com.praveen.web.spring6_web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class DemoController {

    @GetMapping("/date")
    public String getDate(Model model) {
        model.addAttribute("date", new Date());
        return "helloDate";
    }
}
