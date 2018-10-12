package com.capgemini.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.web.domain.Grade;
import com.capgemini.web.domain.Student;
import com.capgemini.web.mapper.GradeMapper;
import com.capgemini.web.mapper.StudentMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class SpringBootMybatisApplicationTests {

	@Autowired
	StudentMapper studentMapper;
	@Autowired
	GradeMapper gradeMapper;
	
	@Test
	public void test() {
//		this.getStudent();
//		this.getGrade();
//		this.addGrade();
//		this.updateGrade();
//		this.deleteGrade();
		this.add();
	}

	void add(){
		Grade grade = new Grade();
		grade.setId(2);
		grade.setGradeName("xxxx");
		gradeMapper.add(grade);	
		int i=1/0;
		Student student = new Student();
		student.setId(3);
		student.setName("sheng");
		student.setAge(30);
		studentMapper.add(student);
	}
 
	
	void addGrade(){
		Grade grade = new Grade();
		grade.setId(2);
		grade.setGradeName("xxxx");
		gradeMapper.add(grade);	
	}
	
	void updateGrade(){
		Grade grade = new Grade();
		grade.setId(2);
 		grade.setGradeName("xxxx22222");
		gradeMapper.update(grade);	
	}
	
	
	void deleteGrade(){	
		gradeMapper.delete(2);	
	}
	
	
	void getStudent() {
		Student student = studentMapper.findById(1);
		System.out.print(student.getName());
	}

	void getGrade(){
		Grade grade = gradeMapper.findById(1);
		System.out.print(grade.getGradeName());
	}
}
