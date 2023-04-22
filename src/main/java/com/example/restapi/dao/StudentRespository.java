package com.example.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapi.entity.Student;

public interface StudentRespository  extends JpaRepository<Student,Integer>{

}
