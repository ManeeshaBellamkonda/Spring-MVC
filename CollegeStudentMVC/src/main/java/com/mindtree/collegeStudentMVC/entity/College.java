package com.mindtree.collegeStudentMVC.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int collegeId;
	private String collegeName;
	private int strength;
	private int noOfBoys;
	private int noOfGirls;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "college")
	private List<Student> students;

	public College() {
		super();
	}

	public College(int collegeId, String collegeName, int strength, int noOfBoys, int noOfGirls,
			List<Student> students) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.strength = strength;
		this.noOfBoys = noOfBoys;
		this.noOfGirls = noOfGirls;
		this.students = students;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getNoOfBoys() {
		return noOfBoys;
	}

	public void setNoOfBoys(int noOfBoys) {
		this.noOfBoys = noOfBoys;
	}

	public int getNoOfGirls() {
		return noOfGirls;
	}

	public void setNoOfGirls(int noOfGirls) {
		this.noOfGirls = noOfGirls;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	
}
