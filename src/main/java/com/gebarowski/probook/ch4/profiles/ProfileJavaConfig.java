package com.gebarowski.probook.ch4.profiles;

import com.gebarowski.probook.ch4.profiles.highschool.HighschoolConfig;
import com.gebarowski.probook.ch4.profiles.kindergarten.KindergartenConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.List;

public class ProfileJavaConfig {

    public static void main(String[] args) {

        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(KindergartenConfig.class, HighschoolConfig.class);
        FoodProviderService foodProviderService = ctx.getBean("foodProviderService", FoodProviderService.class);
        List<Food> lunchSet = foodProviderService.provideLunchSet();

        lunchSet.forEach(e -> System.out.print(e.getName()));
    }
}
