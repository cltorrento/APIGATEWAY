package com.sirio.products.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class TestController {

    @GetMapping("list")
    public String list(){
        return "Hi from TestController / List Method ;)";
    }
}
