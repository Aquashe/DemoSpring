package com.thomas.Spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public  class Alien {

    private int age;
    private Computer com;

    public Computer getCom() {
        return com;
    }

    @Autowired
    @Qualifier("desktop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    @Value("25")
    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        com.compile();
    }
}
