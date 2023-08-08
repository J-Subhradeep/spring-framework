package com.constructorinjection;

public class Person {
    private String name;
    private String personId;
    public Person() {
    }
    public Person(String name, String personId) {
        this.name = name;
        this.personId = personId;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", personId=" + personId + "]";
    }

    
}
