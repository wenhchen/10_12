package com.capgemini.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.web.domain.Address;
import com.capgemini.web.domain.Student;
import com.capgemini.web.mapper.AddressMapper;
import com.capgemini.web.mapper.StudentMapper;

@Controller
public class StudentController {
	
	
	int studentid;
	
	@Autowired
	StudentMapper studentMapper;
	@Autowired
	AddressMapper addressMapper;
	
	
	@RequestMapping(value="getStudent")
	public ModelAndView getStudent(HttpServletRequest request,HttpServletResponse response){
		
		 
		
		ModelAndView mv = new ModelAndView();
	
		List<Student> list = studentMapper.FindAllStudent();
		
		mv.addObject("students", list);
		mv.setViewName("student");
		return mv;
	}
	
	
	
		@RequestMapping(value="updateStudent")
		public String update(HttpServletRequest request,HttpServletResponse response){
			studentid=Integer.valueOf(request.getParameter("id"));
			return "updateStudent";
			
		}
		
		
		@RequestMapping(value="update")
		public ModelAndView updateConfirm(HttpServletRequest request,HttpServletResponse response){
			
			System.out.println(request.getParameter("name"));
			Student student =new Student();
			student.setId(studentid);
			student.setName(request.getParameter("name"));
			student.setAge(Integer.valueOf(request.getParameter("age")));
			studentMapper.update(student);
			return new ModelAndView("redirect:/getStudent");
		}
		
	
	
	@RequestMapping(value="deleteStudent")
	public ModelAndView DeleteStudent(HttpServletRequest request,HttpServletResponse response){
		int id=Integer.valueOf(request.getParameter("id"));
		studentMapper.deleteStudent(id);
		
		return new ModelAndView("redirect:/getStudent");
	}
	
	
	
	
	@RequestMapping(value="addStudent")
	public Address addStudent(Student student){
		 studentMapper.add(student);	
		 return addressMapper.findById(student.getAddress().getId());
	}
	
	
	@RequestMapping(value="getStudent2")
	public String getStudent2(int id,Model model){
		Student student= studentMapper.findById(id);

		List<Student> list = new ArrayList<Student>();
		list.add(student);
		model.addAttribute("student", student);
		model.addAttribute("students", list);
		return "student";
	}


}
