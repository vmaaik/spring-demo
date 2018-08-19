package com.gebarowski.probook.ch3.messageprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("configMessage")
@Scope("prototype")
public class ConfigurableMessageProvider implements MessageProvider {

    public String message;

    @Autowired
    public ConfigurableMessageProvider(
            @Value("${message}") String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
