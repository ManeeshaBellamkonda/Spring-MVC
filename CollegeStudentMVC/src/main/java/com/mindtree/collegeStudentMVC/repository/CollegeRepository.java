package com.mindtree.collegeStudentMVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.collegeStudentMVC.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer>{

}
