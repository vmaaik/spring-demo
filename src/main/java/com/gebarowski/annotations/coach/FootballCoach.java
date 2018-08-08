package com.gebarowski.annotations.coach;

import com.gebarowski.legacy.coach.Coach;
import com.gebarowski.legacy.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
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
