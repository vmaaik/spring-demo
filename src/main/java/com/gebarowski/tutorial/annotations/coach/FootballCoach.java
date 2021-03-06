package com.gebarowski.tutorial.annotations.coach;

import com.gebarowski.tutorial.legacy.coach.Coach;
import com.gebarowski.tutorial.legacy.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FootballCoach implements Coach {

    @Autowired
    @Qualifier("databaseFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Run faster!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
