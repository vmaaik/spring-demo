package com.gebarowski.tutorial.annotations.coach;

import com.gebarowski.tutorial.legacy.coach.Coach;
import com.gebarowski.tutorial.legacy.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HockeyCoach implements Coach {
    private FortuneService fortuneService;

    @Autowired
    @Qualifier("badFortuneService")
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
