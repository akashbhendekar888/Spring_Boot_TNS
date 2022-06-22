package com.example.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.service.StudentService;
@RestController

public class StudentController {
	private StudentService studentservice;

	public StudentController(StudentService studentservice) {
		this.studentservice = studentservice;
	}
	@PostMapping("/student")
	public Student saveStudent(Student student) {
		return student;
	}
}
