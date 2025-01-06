package org.thomas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("21")
    private  int age;

    private  Computer com;
    public Alien() {
        System.out.println("Alien Object created....");
    }

    public  void code(){
        com.compile();
        System.out.println("Alien is Coding............");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Computer getCom() {
        return com;
    }
    @Autowired
    @Qualifier("laptop")//Make first letter small and then class name
    public void setCom(Computer com) {
        this.com = com;
    }
}
