package com.redfern.java_course_spring_2021.SpringBootWebApp.Controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redfern.java_course_spring_2021.SpringBootWebApp.DAO.StudentDAO;
import com.redfern.java_course_spring_2021.SpringBootWebApp.Model.Student;
import com.redfern.java_course_spring_2021.SpringBootWebApp.Service.StudentService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> getStudents() {
		return studentService.findAll();
	}
	
	@PostMapping("/students")
	public Student createStudent(@RequestBody Student student) {
		return studentService.save(student);
	}
	
	// PUT REQUEST IS USED TO MODIFY AN EXISTING RECORD
	@PutMapping("/students/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
		
		// STEP ONE: QUERY STUDENT RECORD FROM THE DB USING ID
		Student student = studentService.findById(id);
		
		// STEP TWO: UPDATE RETRIEVED STUDENT RECORD WITH NEW STUDENT DETAILS
		student.setName(studentDetails.getName());
		student.setEmail(studentDetails.getEmail());
		student.setDob(studentDetails.getDob());
		student.setAge(studentDetails.getAge());
		
		// STEP THREE: SAVE THE MODIFIED STUDENT RECORD TO THE DATABASE
		Student updatedStudent = studentService.save(student);
		
		// STEP FOUR: RETURN A RESPONSE CONTAINING OK AND THE UPDATED STUDENT RECORD
		return ResponseEntity.ok(updatedStudent);
	}
	
	// DELETE REQUEST IS USED TO DELETE AN EXISTING STUDENT RECORD
	@DeleteMapping("/students/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteStudent(@PathVariable Long id) {
		
		// STEP ONE: RETREIVE STUDENT RECORD FROM DB BY ID
		Student student = studentService.findById(id);
		
		// STEP TWO: CALL SERVICE'S DELETE METHOD
		studentService.delete(student);
		
		//STEP THREE: CREATE A HASHMAP TO HOLD RESPONSE
		Map<String, Boolean> response = new HashMap<String, Boolean>();
		response.put("Deleted Student Id: " + id, Boolean.TRUE);
		
		//STEP FOUR: RETURN MAP INSIDE RESPONSE
		return ResponseEntity.ok(response);
	}

}
