package com.capgemini.web.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.capgemini.web.domain.Grade;

@Mapper
public interface GradeMapper {
	
	public void add(Grade grade);
	
	public void update(Grade grade);
	
	public void delete(int id);
	
	public Grade findById(@Param("id") int id);

}
