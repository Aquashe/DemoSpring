package org.thomas;

import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;
@Component
public class Laptop implements Computer {

    private String name;
    private  int idNo;
    public Laptop() {
        System.out.println("Laptop Object Created....");
    }
    @ConstructorProperties({"idNo","name"})
    public Laptop(int idNo ,String name) {
        this.name =name;
        this.idNo = idNo;
        System.out.println("Para constructor called....with name "+this.name+" and iD :"+this.idNo);
    }

    @Override
    public void compile(){
        System.out.println("Laptop is Compiling.....");
    }
}
