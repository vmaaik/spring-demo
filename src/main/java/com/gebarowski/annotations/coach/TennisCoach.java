package com.gebarowski.annotations.coach;

import com.gebarowski.legacy.coach.Coach;
import com.gebarowski.legacy.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${email}")
    private String email;

    @Value("${team}")
    private String team;

    @Autowired
    public TennisCoach(@Qualifier("badFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
