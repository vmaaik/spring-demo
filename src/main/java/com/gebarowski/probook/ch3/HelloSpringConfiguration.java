package com.gebarowski.probook.ch3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "com.gebarowski.probook.ch3")
@Configuration
@PropertySource("probook.ch3/probook.properties")
public class HelloSpringConfiguration {

}