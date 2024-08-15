package com.springDersi.gatpmapping.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {
    @Value("${car.name}")
    private String carName;

    @Value("${model.name}")
    private String modelName;

    @GetMapping("/carInfo")
    public String getCarInfo(){
        return "Car name: "+ carName + " Model name: " + modelName;
    }
    @Value("${coach.name}")
    private String getCoachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach Name: "+getCoachName + "Team Name: "+teamName;
    }
    @GetMapping("/")
    public String helloPage() {
        return "Hello Welcome To My Page";
    }
    @GetMapping("/home")
    public String bkPage(){
        return "Welcome To bk Page";
    }
    @GetMapping("/hand")
    public String handPage(){
        return "hi";
    }


    @Value("${team.name}")
    private String name;

    @Value("${coach.name}")
    private String coachName;
}
//@RestController: Bu annotation, bir sınıfın RESTful hizmetler sunan bir kontrolcü sınıf olduğunu belirtir. Herhangi
// bir HTTP isteğine yanıt verebilecek metotları içeren sınıflara uygulanır
// Java platformunda yer alan komutların derlenmesi sırasında kullanılan otomasyon ve inşa aracıdır.