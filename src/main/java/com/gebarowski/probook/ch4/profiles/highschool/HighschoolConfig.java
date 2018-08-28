package com.gebarowski.probook.ch4.profiles.highschool;


import com.gebarowski.probook.ch4.profiles.FoodProviderService;
import com.gebarowski.probook.ch4.profiles.kindergarten.FoodProviderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("highschool")
public class HighschoolConfig {

    @Bean
    public FoodProviderService foodProviderService() {
        return new FoodProviderServiceImpl();
    }
}
