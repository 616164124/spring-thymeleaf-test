package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class thymeleafController {

    @GetMapping("/firstth")
    public String firstth(Model model){
        model.addAttribute("info","/user/list");
        return "firstth";
    }

    @GetMapping("/user")
    public String user(Model model){
        model.addAttribute("user",new User("sfs",12));
        System.out.println("2222");
        return "user";
    }
    @GetMapping("/user/list")
    public String list(Model model){
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(0,new User("l4",12));
        objects.add(1,new User("v4",34));
        model.addAttribute("userList",objects);
        return "list";
    }

}

class User{
    private String name;
    private  int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
