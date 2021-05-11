package com.redfern.java_course_spring_2021.SpringBootWebApp.Controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redfern.java_course_spring_2021.SpringBootWebApp.Model.Student;
import com.redfern.java_course_spring_2021.SpringBootWebApp.Service.StudentService;

@RestController
@RequestMapping("api/v1/student") //localhost:8080/api/vi/student
public class StudentController {
	
	//MEM VARS
	private final StudentService studentService;
		
	@Autowired
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping
	public List<Student> getStudents() {
		return studentService.getStudents();
	}

}
