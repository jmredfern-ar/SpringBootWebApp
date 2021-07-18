package com.redfern.java_course_spring_2021.SpringBootWebApp.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redfern.java_course_spring_2021.SpringBootWebApp.DAO.StudentDAO;
import com.redfern.java_course_spring_2021.SpringBootWebApp.Exception.ResourceNotFoundException;
import com.redfern.java_course_spring_2021.SpringBootWebApp.Model.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDAO studentDAO;
	
	public List<Student> findAll() {
		return studentDAO.findAll();
	}

	public Student save(Student student) {
		return studentDAO.saveAndFlush(student);
	}

	public Student findById(Long id) {
		return studentDAO.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
	}

	public void delete(Student student) {
		studentDAO.delete(student);
		
	}
}
