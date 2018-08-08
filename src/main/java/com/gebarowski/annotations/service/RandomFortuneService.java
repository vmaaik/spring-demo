package com.gebarowski.annotations.service;

import com.gebarowski.legacy.service.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "RandomFortuneService";
    }
}
