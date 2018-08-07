package com.gebarowski.legacy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("legacy/applicationContext.xml");

        // constructor injection
        Coach coach = context.getBean("myCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        // setter injection
        Coach myCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(myCricketCoach.getDailyFortune());
        System.out.println(myCricketCoach.getDailyWorkout());
        System.out.println(((CricketCoach) myCricketCoach).getEmailAddress());
        System.out.println(((CricketCoach) myCricketCoach).getTeam());

        context.close();
    }
}
