package com.example.hellohuman.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.StringWriter;

@RestController
public class HelloHuman {
    @RequestMapping("/")
    public String greeting(@RequestParam(value = "name", required = false) String name,
                           @RequestParam(required = false) String lastname,
                           @RequestParam(value = "times", required = false) Integer times) {
        if (times != null && times > 0) {
            String output = "";
            for (int i = 0; i < times; i++) {

                if (name != null) {
                    output += "Hello " + name + " ";

                } else {
                    output += "Hello Human ";
                }
            }
            return output;
        }
        return "Hello human ";
    }

    @RequestMapping("/m/{courseid}/{modulid}")
    public String course  (@PathVariable("courseid") String courseid, @PathVariable("modulid") String modulid){
        return "Course : " + courseid + "Modul : " + modulid ;
    }

}







