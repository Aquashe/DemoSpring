package com.thomas.Spring;

import com.thomas.Spring.model.Alien;
import com.thomas.Spring.model.Laptop;
import com.thomas.Spring.model.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringAppApplication.class, args);
		/*
		//This was intially for understanding the Spring and Spring boot

		Alien obj = context.getBean(Alien.class);
		System.out.println(obj.getAge());
		obj.show();

		 */

		Laptop lap = context.getBean(Laptop.class);
		LaptopService service = context.getBean(LaptopService.class);
		service.addLaptop(lap);
	}

}
