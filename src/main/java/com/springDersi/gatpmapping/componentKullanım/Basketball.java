package com.springDersi.gatpmapping.componentKullanım;

import org.springframework.stereotype.Component;

@Component
public class Basketball implements ICoach{

    @Override
    public String getDailyWorkout() {
        return "Hey time to plsay basketball";
    }

}
