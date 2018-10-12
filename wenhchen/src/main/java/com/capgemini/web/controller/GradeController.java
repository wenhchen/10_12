package com.capgemini.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.web.domain.Grade;
import com.capgemini.web.domain.Student;
import com.capgemini.web.mapper.AddressMapper;
import com.capgemini.web.mapper.GradeMapper;
import com.capgemini.web.mapper.StudentMapper;

@RestController
public class GradeController {
	
	
	@Autowired
	StudentMapper studentMapper;
	@Autowired
	AddressMapper addressMapper;
	@Autowired
	GradeMapper gradeMapper;
	
	@RequestMapping(value="getGrade")
	public void getGrade(Grade grade){
		System.out.println(grade.getId());
	}
	


}
