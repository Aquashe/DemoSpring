package com.thomas.Spring_data_JPA;

import com.thomas.Spring_data_JPA.model.Student;
import com.thomas.Spring_data_JPA.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context  = SpringApplication.run(SpringDataJpaApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

//		s1.setRollNo(101);
//		s1.setName("Navin");
//		s1.setMarks(89);
//
//		s2.setRollNo(102);
//		s2.setName("Kumar");
//		s2.setMarks(81);
//
//		s3.setRollNo(103);
//		s3.setName("Reddy");
//		s3.setMarks(70);
//
//		repo.save(s3);

//		Optional<Student> s = repo.findById(103);
//		System.out.println(s.orElse(new Student()));

		//System.out.println(repo.findByName("Navin"));
		//System.out.println(repo.findByMarks(70));
		System.out.println(repo.findByMarksGreaterThan(70));

//UPDATE
		s2.setRollNo(102);
		s2.setName("Kumar");
		s2.setMarks(100);

		//System.out.println(repo.save(s2));

		repo.delete(s2);

	}

}
