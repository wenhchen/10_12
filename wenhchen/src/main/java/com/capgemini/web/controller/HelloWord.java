package com.capgemini.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {
	
	@Value("${springMvc.hello}")
	private String hello;
	
	@RequestMapping(value="hello")
	public String helloWord(){
		return hello;
	}

}
