package org.thomas;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("desk")
@Scope("prototype")
public class Desktop implements  Computer{
    private int name ;

    public Desktop() {
        System.out.println("Desktop Object Created...");
    }


    @Override
    public void compile() {
        System.out.println("Desktop is Compiling.....");
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
