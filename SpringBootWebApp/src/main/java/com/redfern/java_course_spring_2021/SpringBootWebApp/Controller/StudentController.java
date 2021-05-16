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

import com.redfern.java_course_spring_2021.SpringBootWebApp.DAO.StudentDAO;
import com.redfern.java_course_spring_2021.SpringBootWebApp.Model.Student;
import com.redfern.java_course_spring_2021.SpringBootWebApp.Service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentDAO studentDAO;
	
//	//MEM VARS
//	private final StudentService studentService;
//		
//	@Autowired
//	public StudentController(StudentService studentService) {
//		super();
//		this.studentService = studentService;
//	}
//	
//	@GetMapping
//	public List<Student> getStudents() {
//		return studentService.getStudents();
//	}
	
	@RequestMapping("api/v1/student")
	public String studentJSP() {
		return "student.html";
	}
	
	@RequestMapping("api/v1/addStudent")
	public String addStudent(Student student) {
		studentDAO.save(student);
		return "student.html";
	}

}
