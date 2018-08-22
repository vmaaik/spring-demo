package com.gebarowski.probook.ch3.employee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("plumber")
public class Plumber implements Employee {

    @Value("I am a plumber!")
    private String profesionName;

    @Override
    public String getProfesion() {
        return profesionName;
    }
}
