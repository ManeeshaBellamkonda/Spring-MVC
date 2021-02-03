package com.mindtree.collegeStudentMVC.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.collegeStudentMVC.entity.College;
import com.mindtree.collegeStudentMVC.entity.Student;

@Service
public interface CollegeService {

	College addCollege(College college);

	List<College> getCollege();

	void addStudent(Student student, String collegeName);

	List<College> getAllColleges(int collegeId);

	List<Student> getAllStudents();

	List<College> getCollegeDetails();

	String deleteStudent(int studentId);

}
