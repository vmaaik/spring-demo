package com.gebarowski.annotations;

import com.gebarowski.legacy.coach.Coach;
import com.gebarowski.legacy.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {
    private FortuneService fortuneService;

    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside setter");
        this.fortuneService = fortuneService;
    }

    public HockeyCoach() {
        System.out.println("Inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Work hard!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
