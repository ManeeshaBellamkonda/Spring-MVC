package com.mindtree.collegeStudentMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.collegeStudentMVC.entity.College;
import com.mindtree.collegeStudentMVC.entity.Student;
import com.mindtree.collegeStudentMVC.service.CollegeService;

@Controller
public class AppController {

	College Clg=new College();
	
	@Autowired
	CollegeService collegeService;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/form1")
	public String form1() {
		return "college";
	}

	@PostMapping("addCollege")
	public String college(College college) {
		collegeService.addCollege(college);
		return "college";
	}

	@RequestMapping("/form2")
	public String student(Model model) {
		List<College> college = collegeService.getCollege();
		model.addAttribute("college", college);
		return "student";
	}

	@PostMapping("/student")
	public String addStudent(Student student, @RequestParam String collegeName) {
		collegeService.addStudent(student, collegeName);
		return "index";
	}

	@GetMapping("/view")
	public String view(Model m) {
		List<College> list = collegeService.getCollegeDetails();
		m.addAttribute("college", list);
		return "view";
	}

	@GetMapping("/getCollege")
	public String getAllCollegeDetails(Model model, int collegeId) {
		List<College> colleges = collegeService.getAllColleges(collegeId);
		model.addAttribute("colleges", colleges);
		return "view";
	}

	@GetMapping("/viewStudent")
	public String getAllStudent(Model model) {
		List<Student> students = collegeService.getAllStudents();
		model.addAttribute("students", students);
		return "viewStudent";
	}
	
	@RequestMapping("/delete/{studentId}")
	public String delete(@PathVariable int studentId) {
		collegeService.deleteStudent(studentId);
		return "index";
	}
}
