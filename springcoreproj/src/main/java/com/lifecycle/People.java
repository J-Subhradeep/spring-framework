package com.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class People {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public People() {
    }

    @Override
    public String toString() {
        return "People [subject=" + subject + "]";
    }

    @PostConstruct
    public void start() {
        System.out.println("Starting people method");
    }

    @PreDestroy
    public void end() {
        System.out.println("Ending people method");
    }

}
