package com.gebarowski.probook.ch3.spel;


import org.springframework.stereotype.Component;

@Component("injectSimpleConfig")
public class InjectSimpleConfig {

    private String name = "Michal Gebarowski";
    private int age = 40;
    private float height = 1.93f;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }
}
