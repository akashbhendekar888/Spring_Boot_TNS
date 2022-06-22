package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentServiceImplementation implements StudentService{
	private StudentRepository studrep;

	public StudentServiceImplementation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studrep.save(student);
	}
	

}
