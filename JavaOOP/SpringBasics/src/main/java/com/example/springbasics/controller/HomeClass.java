package com.example.springbasics.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeClass {
    @RequestMapping("/")
    public String work(){
        return "My page is working";
    }
    @RequestMapping("/students")
    public  String students(){
        return "My students are learning Java";
    }

    @RequestMapping("/{name}/{stack}")
    public  String stack(@PathVariable String name,@PathVariable String stack){
        return String.format("Hi ,%s and welcome to %s stack.", name , stack);
    }

}
