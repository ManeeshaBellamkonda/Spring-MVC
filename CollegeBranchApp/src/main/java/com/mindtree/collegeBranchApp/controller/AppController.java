package com.mindtree.collegeBranchApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.collegeBranchApp.entity.Branch;
import com.mindtree.collegeBranchApp.entity.College;
import com.mindtree.collegeBranchApp.exception.BrandSizeExceededException;
import com.mindtree.collegeBranchApp.service.CollegeService;

@Controller
public class AppController {

	@Autowired
	CollegeService collegeService;
	
	Branch branch=new Branch();
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/form1")
	public String form1()
	{
		return "college";
	}
	
	@PostMapping("/college")
	public String addCollege(College college)
	{
		collegeService.addCollege(college);
		return "index";
	}
	
	@RequestMapping("/form2")
	public String student(Model model) {
		List<College> college = collegeService.getCollege();
		model.addAttribute("college", college);
		return "branch";
	}

	@PostMapping("/branch")
	public String addBranch(Branch branch, @RequestParam String collegeName) throws BrandSizeExceededException {
		collegeService.addBranch(branch, collegeName);
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
		List<College> list = collegeService.getCollegeDetails();
		model.addAttribute("college", list);
		College colleges = collegeService.getAllColleges(collegeId);
		model.addAttribute("colleges", colleges);
		
		int sum=0;
		sum=collegeService.getTotalStrength(collegeId);
		model.addAttribute("sum", sum);
		return "view";
	}
	
	@GetMapping("/update/{branchId}")
	public String update(@PathVariable int branchId,Model model)
	{	
		Branch branchList=collegeService.getData(branchId);		
		branch=branchList;
		model.addAttribute("branch", branch);
		return "update";
	}
	
	@RequestMapping("/updateBranchDetails")
	public String updateBranchStrength(@RequestParam int totalStrength)
	{
		collegeService.updateBranchStrength(branch,totalStrength);
		return "index";
	}
}
