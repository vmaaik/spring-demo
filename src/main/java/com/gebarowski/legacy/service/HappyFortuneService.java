package com.gebarowski.legacy.service;

public class HappyFortuneService implements FortuneService{


    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
