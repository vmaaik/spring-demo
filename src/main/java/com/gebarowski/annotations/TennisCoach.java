package com.gebarowski.annotations;

import com.gebarowski.legacy.coach.Coach;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
