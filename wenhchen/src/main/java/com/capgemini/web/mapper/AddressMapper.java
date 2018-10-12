package com.capgemini.web.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.capgemini.web.domain.Address;

@Mapper
public interface AddressMapper {
	
	public Address findById(int id);
}
