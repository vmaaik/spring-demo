package com.gebarowski.probook.ch3.messageprovider;

import org.springframework.stereotype.Component;

@Component("provider")
public class HelloSpringMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello Spring Framework!";
    }
}
