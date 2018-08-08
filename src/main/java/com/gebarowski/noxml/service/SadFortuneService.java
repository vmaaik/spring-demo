package com.gebarowski.noxml.service;

import com.gebarowski.legacy.service.FortuneService;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is a sad day";
    }
}
