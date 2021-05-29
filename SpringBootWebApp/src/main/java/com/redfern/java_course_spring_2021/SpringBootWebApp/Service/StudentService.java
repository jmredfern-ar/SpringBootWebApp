package com.redfern.java_course_spring_2021.SpringBootWebApp.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redfern.java_course_spring_2021.SpringBootWebApp.DAO.StudentDAO;
import com.redfern.java_course_spring_2021.SpringBootWebApp.Model.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDAO studentDAO;
	
	public List<Student> findAll() {
		return studentDAO.findAll();
	}

	public Student saveAndFlush(Student student) {
		return studentDAO.save(student);
		
	}

}
