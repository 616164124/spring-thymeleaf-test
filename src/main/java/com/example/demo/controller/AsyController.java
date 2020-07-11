package com.example.demo.controller;

import com.example.demo.service.AsyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class AsyController {

    @Autowired
    public AsyService asyService;

    @GetMapping("/Asy")
    public String Asytest(){
        asyService.Asytest();
        return "suceess";
    }

}
