package com.mindtree.collegeStudentMVC.service.serviceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.collegeStudentMVC.entity.College;
import com.mindtree.collegeStudentMVC.entity.Student;
import com.mindtree.collegeStudentMVC.repository.CollegeRepository;
import com.mindtree.collegeStudentMVC.repository.StudentRepository;
import com.mindtree.collegeStudentMVC.service.CollegeService;

@Service
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	CollegeRepository collegeRepository;

	@Autowired
	StudentRepository studentRepository;

	@Override
	public College addCollege(College college) {
		return collegeRepository.save(college);
	}

	@Override
	public List<College> getCollege() {
		List<College> college = new ArrayList<College>();
		List<College> collegeList = collegeRepository.findAll();
		for (College college2 : collegeList) {
			college.add(college2);
		}
		return college;
	}

	@Override
	public void addStudent(Student student, String collegeName) {
		List<College> colleges = collegeRepository.findAll();
		for (College college : colleges) {
			if (college.getCollegeName().equalsIgnoreCase(collegeName)) {
				student.setCollege(college);
				
				if (student.getGender().equalsIgnoreCase("boy")) {
					college.setNoOfBoys(college.getNoOfBoys() + 1);
				}

				if (student.getGender().equalsIgnoreCase("girl")) {
					college.setNoOfGirls((college.getNoOfGirls() + 1));
				}

			}

			collegeRepository.save(college);

			studentRepository.save(student);
		}
	}

	@Override
	public List<College> getAllColleges(int collegeId) {

		College college = collegeRepository.findById(collegeId).get();
		int boyCount = 0;
		int girlCount = 0;
		List<College> collegeList = new ArrayList<College>();
		for (College college2 : college) {
			if (college2.getCollegeId() == collegeId) {
				for (Student student : college2.getStudents()) {
					if (student.getGender().equalsIgnoreCase("boy")) {
						boyCount++;
					} else {
						girlCount++;
					}
				}
			}
			college2.setNoOfBoys(boyCount);
			college2.setNoOfGirls(girlCount);
			collegeList.add(college2);
			collegeRepository.save(college2);

		
		}
		return collegeList;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> student = studentRepository.findAll();
		Collections.sort(student);
		return student;

	}

	@Override
	public List<College> getCollegeDetails() {
		return collegeRepository.findAll();
	}

	@Override
	public String deleteStudent(int studentId) {

		Student student = studentRepository.findById(studentId).get();
		College college = student.getCollege();
		student.setCollege(null);
		studentRepository.deleteById(studentId);

		if (student.getGender().equalsIgnoreCase("boy")) {
			college.setNoOfBoys(college.getNoOfBoys() - 1);
			college.setStrength(college.getStrength()-1);
			
		}

		if (student.getGender().equalsIgnoreCase("girl")) {
			college.setNoOfGirls(college.getNoOfGirls() - 1);
			college.setStrength(college.getStrength()-1);
		}
		
		collegeRepository.saveAndFlush(college);

		return "deleted successfully";

	}

}
