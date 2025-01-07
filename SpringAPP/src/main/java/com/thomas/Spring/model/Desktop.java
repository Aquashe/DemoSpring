package com.thomas.Spring.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements  Computer{

    @Override
    public void compile() {
        System.out.println("Desktop is compiling");
    }
}
