package com.sirio.magazzini.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/magazzini")
public class DemoController {

    @GetMapping("demo")
    public String demo(){
        return "Hola desde DemoController ***;)";
    }
}
