package com.gebarowski.tutorial.noxml.service;

import com.gebarowski.tutorial.legacy.service.FortuneService;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is a sad day";
    }
}
