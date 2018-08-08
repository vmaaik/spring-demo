package com.gebarowski.noxml;

import com.gebarowski.legacy.coach.Coach;
import com.gebarowski.noxml.coach.SwimCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        Coach coach = context.getBean("tennisCoach", Coach.class);
        System.out.println(coach.getDailyFortune());

        Coach coach1 = context.getBean("swimCoach", SwimCoach.class);
        System.out.println(((SwimCoach) coach1).getEmail());
        System.out.println(((SwimCoach) coach1).getTeam());
        System.out.println(coach1.getDailyFortune());
    }
}
