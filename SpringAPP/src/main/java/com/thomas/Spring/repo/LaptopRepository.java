package com.thomas.Spring.repo;

import com.thomas.Spring.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void  save(Laptop lap){
        System.out.println("lap saved in Database ");
    }
}
