package com.gebarowski.tutorial.noxml;

import com.gebarowski.tutorial.annotations.coach.TennisCoach;
import com.gebarowski.tutorial.legacy.coach.Coach;
import com.gebarowski.tutorial.legacy.service.FortuneService;
import com.gebarowski.tutorial.noxml.coach.SwimCoach;
import com.gebarowski.tutorial.noxml.service.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("legacy/sport.properties")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach tennisCoach() {
        return new TennisCoach(sadFortuneService());
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

}
