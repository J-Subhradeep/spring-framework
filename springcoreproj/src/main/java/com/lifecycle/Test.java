package com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/lifecycle/samosaconfig.xml");
        Samosa s = (Samosa) context.getBean("s1");
        System.out.println(s);
        Pepsi p = (Pepsi) context.getBean("p1");
        System.out.println(p);
        // registering shutdown hook
        context.registerShutdownHook();
    }
}
