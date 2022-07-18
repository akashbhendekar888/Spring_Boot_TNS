package com.projects.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projects.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
