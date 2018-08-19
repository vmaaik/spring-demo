package com.gebarowski.probook.ch3;

public class HelloSpringMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello Spring Framework!";
    }
}
