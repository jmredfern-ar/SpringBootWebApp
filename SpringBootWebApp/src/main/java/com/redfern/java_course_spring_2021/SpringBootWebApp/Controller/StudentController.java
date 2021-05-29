package com.redfern.java_course_spring_2021.SpringBootWebApp.Controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redfern.java_course_spring_2021.SpringBootWebApp.DAO.StudentDAO;
import com.redfern.java_course_spring_2021.SpringBootWebApp.Model.Student;
import com.redfern.java_course_spring_2021.SpringBootWebApp.Service.StudentService;

@Controller
@RequestMapping("api/v1")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
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
	
	@GetMapping("student")
	public String studentJSP() {
		return "student.html";
	}
	
	@GetMapping("addStudent")
	public String addStudent(Student student) {
		studentService.saveAndFlush(student);
		return "student.html";
	}
	
	@GetMapping("/students")
	public String getStudents(Model model){
		List<Student> students = studentService.findAll();
		model.addAttribute("students", students);
		return "student-list.html"; //names;
	}

}
