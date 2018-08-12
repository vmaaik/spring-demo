package com.gebarowski.tutorial.annotations.service;

import com.gebarowski.tutorial.legacy.service.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "RandomFortuneService";
    }
}
