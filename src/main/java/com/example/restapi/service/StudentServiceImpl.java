package com.example.restapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restapi.dao.StudentRespository;
import com.example.restapi.entity.Student;
@Service
public class StudentServiceImpl  implements StudentService{

	@Autowired
	private StudentRespository studentRepo;
	
	
	@Override
	public List<Student> getStudent() {
		
		return studentRepo.findAll() ;
	}

	@Override
	public void save(Student student) {
		studentRepo.save(student);
		
	}

	@Override
	public Student findById(Integer id) {
		Optional<Student>studentResult=studentRepo.findById(id);
		Student student=null;
		if(studentResult.isPresent())
		{
		student=studentResult.get();
		}
		
		return student;
	}

	@Override
	public void delete(Student student) {
		
		studentRepo.delete(student);	
	}

	
	
	
}
