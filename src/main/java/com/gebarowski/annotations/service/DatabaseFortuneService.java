package com.gebarowski.annotations.service;

import com.gebarowski.legacy.service.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "DatabaseFortuneService";
    }
}
