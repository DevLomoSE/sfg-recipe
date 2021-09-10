package com.devlomose.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController  {

    @GetMapping({"", "/", "/index"})
    public String getIndexPage(){
        System.out.println("restarting controller 123");
        return "index";
    }
}
