package com.example.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.entity.Student;
import com.example.restapi.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
@Autowired
private StudentService studentService;

@GetMapping("/students")
public List<Student>getStudent(){
return studentService.getStudent();
	
}
@PostMapping("/save")
public Student saveStudent(@RequestBody Student student)
{
	studentService.save(student);
	return student;

}
@GetMapping("/student/{id}")
public Student getStudentById(@PathVariable Integer id)
{
 Student student = studentService.findById(id) ;
 return student;
}

@DeleteMapping("/delete/{id}")
public Student deleteStudent(@PathVariable Integer id)
{
Student student=studentService.findById(id)	;
studentService.delete(student);
return student;
}

@PutMapping("/update/{id}")
public Student updateStudent(@PathVariable Integer id,@RequestBody Student studentDetail)
{
Student student=studentService.findById(id);
student.setName(studentDetail.getName());
student.setEmail(studentDetail.getEmail());
student.setAddress(studentDetail.getAddress());
student.setPassword(studentDetail.getPassword());
studentService.save(student);
return student;


}

}

