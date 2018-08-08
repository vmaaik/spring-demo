package com.gebarowski.annotations;

import com.gebarowski.legacy.service.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class BadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your bad day!";
    }
}
