package com.mindtree.collegeStudentMVC.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student implements Comparable<Student>{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String studentName;
	private int studentAge;
	private Date dateOfBirth;
	private String gender;
	private String studentHobbies;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private College college;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, int studentAge, Date dateOfBirth, String gender,
			String studentHobbies, College college) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.studentHobbies = studentHobbies;
		this.college = college;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStudentHobbies() {
		return studentHobbies;
	}

	public void setStudentHobbies(String studentHobbies) {
		this.studentHobbies = studentHobbies;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public int compareTo(Student s) {
		return s.studentName.compareTo(this.getStudentName());
	}
	
}
