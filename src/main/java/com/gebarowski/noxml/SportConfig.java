package com.gebarowski.noxml;

import com.gebarowski.annotations.coach.TennisCoach;
import com.gebarowski.legacy.coach.Coach;
import com.gebarowski.legacy.service.FortuneService;
import com.gebarowski.noxml.coach.SwimCoach;
import com.gebarowski.noxml.service.SadFortuneService;
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
