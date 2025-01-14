package com.thomas.Spring_data_JPA.repo;

import com.thomas.Spring_data_JPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

}
