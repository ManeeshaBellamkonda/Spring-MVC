package com.mindtree.collegeBranchApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.collegeBranchApp.entity.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer>{

}
