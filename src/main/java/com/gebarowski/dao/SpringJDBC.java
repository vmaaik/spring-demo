package com.gebarowski.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJDBC {

        private Logger logger = LoggerFactory.getLogger(this.getClass());
        public static void main(String[] args) {

            SpringApplication.run(SpringJDBC.class, args);

        }
}
