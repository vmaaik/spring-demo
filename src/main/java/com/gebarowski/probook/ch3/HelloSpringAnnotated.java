package com.gebarowski.probook.ch3;

import com.gebarowski.probook.ch3.messagerenderer.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpringAnnotated {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloSpringConfiguration.class);

        MessageRenderer messageRenderer = context.getBean("renderer", MessageRenderer.class);
        messageRenderer.render();
    }
}
