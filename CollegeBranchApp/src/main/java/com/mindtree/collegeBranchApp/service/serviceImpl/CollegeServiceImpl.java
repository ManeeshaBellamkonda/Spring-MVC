package com.mindtree.collegeBranchApp.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.collegeBranchApp.entity.Branch;
import com.mindtree.collegeBranchApp.entity.College;
import com.mindtree.collegeBranchApp.exception.BrandSizeExceededException;
import com.mindtree.collegeBranchApp.repository.BranchRepository;
import com.mindtree.collegeBranchApp.repository.CollegeRepository;
import com.mindtree.collegeBranchApp.service.CollegeService;

@Service
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	CollegeRepository collegeRepository;
	@Autowired
	BranchRepository branchRepository;

	@Override
	public College addCollege(College college) {
		return collegeRepository.save(college);
	}

	@Override
	public List<College> getCollege() {

		return collegeRepository.findAll();
	}

	@Override
	public String addBranch(Branch branch, String collegeName) throws BrandSizeExceededException {
		List<College> colleges = collegeRepository.findAll();
		for (College college : colleges) {
			if (college.getCollegeName().equalsIgnoreCase(collegeName)) {
				if (college.getBranch().size()>=college.getNoOfBranches()) {
					throw new BrandSizeExceededException("Branch Exceeded");
				} else {
					branch.setCollege(college);
				}
			}
			branchRepository.save(branch);
		}
		return "inserted";
	}

	@Override
	public List<College> getCollegeDetails() {
		return collegeRepository.findAll();
	}

	@Override
	public College getAllColleges(int collegeId) {
		College college = collegeRepository.findById(collegeId).get();
		return college;
	}

	@Override
	public Branch getData(int branchId) {
		Branch branch = branchRepository.findById(branchId).get();
		return branch;
	}

	@Override
	public String updateBranchStrength(Branch branch, int totalStrength) {
		branch.setTotalStrength(totalStrength);
		branchRepository.save(branch);
		return "updated";

	}

	@Override
	public int getTotalStrength(int collegeId) {

		int total = 0;
		College college = collegeRepository.findById(collegeId).get();
		for (Branch branch : college.getBranch()) {
			total += branch.getTotalStrength();
		}
		return total;
	}
}
