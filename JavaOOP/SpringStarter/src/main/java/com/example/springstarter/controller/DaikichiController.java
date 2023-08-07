package com.example.springstarter.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DaikichiController {
    @RequestMapping("/daikichi")
 public String daikichi(){
     return "Welcome";
 }
 @RequestMapping("/today")
public String daikichiToday(){
    return "Today you will find luck in all your endeavors";
}
@RequestMapping("/tomorrow")
public String daikichiTomorrow(){
    return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
}
@RequestMapping("/daikichi/travel/{country}")
    public String daikichiDestination(@PathVariable("country") String country ){
    return String.format("Congratulation ! You will soon travel to %s" , country) ;
}
@RequestMapping("/daikichi/lotto/{nr}")
    public String daikichiLotto(@PathVariable("nr") Integer nr){
        if(nr%2==0){
            return "You will take a grand journey in the near future, but be weary of tempting offers";
        }
        return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
}

}

