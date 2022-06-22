package com.tns.module;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ICollegeRepository extends JpaRepository<College,Integer>{
	

}
