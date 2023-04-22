package com.example.restapi.service;

import java.util.List;

import com.example.restapi.entity.Student;

public interface StudentService {
public List<Student>getStudent();
public void save(Student student);
public Student  findById(Integer id);
public void delete(Student student);
}

	
	

