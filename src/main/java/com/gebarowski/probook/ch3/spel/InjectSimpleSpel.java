package com.gebarowski.probook.ch3.spel;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimpleSpel {
    private String name;
    private int age;
    private float height;

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("probook.ch3/app-context-annotations.xml");
        ctx.refresh();

        InjectSimpleSpel spel = (InjectSimpleSpel) ctx.getBean("injectSimpleSpel");
        System.out.println(spel);
        ctx.close();

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InjectSimpleSpel{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
