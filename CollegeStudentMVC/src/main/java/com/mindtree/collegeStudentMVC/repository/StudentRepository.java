package com.mindtree.collegeStudentMVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.collegeStudentMVC.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
