package com.gebarowski.probook.ch3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloSpringConfiguration {

    @Bean
    public MessageProvider provider() {
        return new HelloSpringMessageProvider();
    }

    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new StandardOutMessageProvider();
        renderer.setMessageProvider(provider());
        return renderer;
    }

}
