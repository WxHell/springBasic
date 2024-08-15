package com.springDersi.gatpmapping.componentKullanım;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

public class DemoController {
    private ICoach coach;

    @Autowired
    public DemoController(ICoach myCoach){
            coach= myCoach;
    }

    @GetMapping("/basketball")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }
}
