package com.mindtree.collegeBranchApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.collegeBranchApp.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer>{

}
