package org.thomas.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.thomas.Alien;
import org.thomas.Computer;
import org.thomas.Desktop;
import org.thomas.Laptop;

@Configuration
@ComponentScan("org.thomas")
public class AppConfig {

    /*
    @Bean(name = {"desk","com1"})
    @Scope("prototype")
    public Desktop desktop(){
        return  new Desktop();
    }

    @Bean
    public Alien alien(@Qualifier("laptop") Computer com){
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setCom(com);
        return  obj;
    }

    @Bean
    @Primary
    public Laptop laptop(){
        return  new Laptop();
    }

     */

}
