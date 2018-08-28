package com.gebarowski.probook.ch4.profiles.kindergarten;

import com.gebarowski.probook.ch4.profiles.FoodProviderService;
import com.gebarowski.probook.ch4.profiles.kindergarten.FoodProviderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("kindergarten")
public class KindergartenConfig {

    @Bean
    public FoodProviderService foodProviderService() {
        return new FoodProviderServiceImpl();
    }
}
