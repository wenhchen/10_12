package com.capgemini.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.capgemini.web.domain.Student;

@Mapper
public interface StudentMapper {
	public void add(Student student);
	
	public Student findById(int id);
	
	public List<Student> findByGradeId(int gradeId);
	public List<Student>  FindAllStudent();
	public void deleteStudent(int id);
	public void update(Student student);
}

