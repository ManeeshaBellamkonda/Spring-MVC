package com.mindtree.collegeBranchApp.entity;

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
	private String locationName;
	private int noOfBranches;
	
	@OneToMany(mappedBy = "college",cascade = CascadeType.ALL)
	private List<Branch> branch;

	public College() {
		super();
	}

	public College(int collegeId, String collegeName, String locationName, int noOfBranches, List<Branch> branch) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.locationName = locationName;
		this.noOfBranches = noOfBranches;
		this.branch = branch;
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

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public int getNoOfBranches() {
		return noOfBranches;
	}

	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}

	public List<Branch> getBranch() {
		return branch;
	}

	public void setBranch(List<Branch> branch) {
		this.branch = branch;
	}

	
	
}
