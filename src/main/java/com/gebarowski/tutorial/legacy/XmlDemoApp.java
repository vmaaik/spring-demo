package com.gebarowski.tutorial.legacy;

import com.gebarowski.tutorial.legacy.coach.Coach;
import com.gebarowski.tutorial.legacy.coach.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlDemoApp {
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

        // bean scope
        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("legacy/beanScope-applicationContext.xml");
        Coach theCoach = context1.getBean("myCoach", Coach.class);
        Coach alphaCoach = context1.getBean("myCoach", Coach.class);
        boolean result = (theCoach == alphaCoach);
        System.out.println("Pointing to the same object: "+ result);
        System.out.println("Memory location for theCoach: "+ theCoach);
        System.out.println("Memory location for alphaCoach: "+ alphaCoach);

        context1.close();
    }
}
