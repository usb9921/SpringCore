package com.bikkadit.controller;

import java.util.List;

import com.bikkadit.model.Timings;
import com.bikkadit.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bikkadit.binding.Student;
import com.bikkadit.service.SrudentServiceImpl;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class StudentController {
	
	@Autowired
	private SrudentServiceImpl serviceImpl;


	@PostMapping("/saveStudent")
	public String addStudent(@ModelAttribute Student student) {
		// Save logic
		Student s = serviceImpl.addStudent(student);
		return "success";
	}


	@GetMapping("/student")    //http://localhost:9090/student
	public String loadForm(Model model) {
		
		List<String> gender = serviceImpl.getGender();  // LIST 1
		List<String> course = serviceImpl.getCourse();
		//List<String> timing = serviceImpl.getTimings();
		
		model.addAttribute("gender", gender);   //("JSP items" , LIST 1)
		model.addAttribute("course", course);
		model.addAttribute("timingOptions" , Timings.values());
		
		model.addAttribute("student", new Student());   //Student class Annonymous object
		
		return "studentReg";
	}
	
	
	//<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	       //USE FOR CREATING SMALL FORMS :- SpringLiabrary






}
