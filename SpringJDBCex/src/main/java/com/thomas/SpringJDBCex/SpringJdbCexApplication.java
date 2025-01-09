package com.thomas.SpringJDBCex;

import com.thomas.SpringJDBCex.model.Student;
import com.thomas.SpringJDBCex.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbCexApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbCexApplication.class, args);
		Student s = context.getBean(Student.class);
		s.setRollNo(1);
		s.setName("Rahul");
		s.setMarks(90);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);
		List<Student>students = service.getStudents();
		for(Student stud : students)
			System.out.println(stud.getRollNo()+" : "+stud.getName()+" :"+stud.getMarks());

	}

}
