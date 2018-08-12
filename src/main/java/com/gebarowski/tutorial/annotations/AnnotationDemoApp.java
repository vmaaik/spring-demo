package com.gebarowski.tutorial.annotations;

import com.gebarowski.tutorial.annotations.coach.TennisCoach;
import com.gebarowski.tutorial.legacy.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations/applicationContext.xml");
        Coach coach = context.getBean("tennisCoach", TennisCoach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        // setter injection
        Coach coach1 = context.getBean("hockeyCoach", Coach.class);
        System.out.println(coach1.getDailyFortune());

        // field injection
        Coach coach2 = context.getBean("footballCoach", Coach.class);
        System.out.println(coach2.getDailyWorkout());
        System.out.println(coach2.getDailyFortune());

        // inject properties file
        System.out.println(((TennisCoach) coach).getTeam());
        System.out.println(((TennisCoach) coach).getEmail());

        context.close();
    }
}
