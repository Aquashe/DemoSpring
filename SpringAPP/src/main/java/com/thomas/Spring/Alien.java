package com.thomas.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public  class Alien {
    @Autowired
    Laptop lap;

    public void show() {
        lap.compile();
    }
}
