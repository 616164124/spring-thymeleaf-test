package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class firstController {


    @GetMapping("test1")
    public String test1 (){
        System.out.println("进入了test1");
        //int a =1/0;
        System.out.println(new Date().getTime());

        return "java";
    }



}
