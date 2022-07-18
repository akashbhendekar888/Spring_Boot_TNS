package com.projects.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.projects.services.EmployeeServiceImpl;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl employeeservice;
	
	public String viewHomePage(Model model) {
		model.addAttribute("List Employees",employeeservice.getAllEmployees());
		return "index";
	}

}
