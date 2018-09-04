package com.gebarowski.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJDBC implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    StudentJdbcRepository repository;

    public static void main(String[] args) {

        SpringApplication.run(SpringJDBC.class, args);

    }

    @Override
    public void run(String...args) throws Exception {
        logger.info("Student id 10001 -> {}", repository.findById(10001L));
    }

}
