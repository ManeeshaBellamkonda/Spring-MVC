package com.mindtree.collegeBranchApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.collegeBranchApp.entity.Branch;
import com.mindtree.collegeBranchApp.entity.College;
import com.mindtree.collegeBranchApp.exception.BrandSizeExceededException;

@Service
public interface CollegeService {

	/**
	 * @param college
	 * @return college
	 */
	College addCollege(College college);

	/**
	 * @return list of colleges
	 */
	List<College> getCollege();

	/**
	 * @param branch
	 * @param collegeName
	 * @return string
	 * @throws BrandSizeExceededException 
	 */
	String addBranch(Branch branch, String collegeName) throws BrandSizeExceededException;

	/**
	 * @return list of colleges
	 */
	List<College> getCollegeDetails();

	/**
	 * @param collegeId
	 * @return college
	 */
	College getAllColleges(int collegeId);

	/**
	 * @param branch
	 * @param totalStrength
	 * @return string
	 */
	String updateBranchStrength(Branch branch, int totalStrength);

	/**
	 * @param branchId
	 * @return branch
	 */
	Branch getData(int branchId);

	/**
	 * @param collegeId
	 * @return integer
	 */
	int getTotalStrength(int collegeId);

}
