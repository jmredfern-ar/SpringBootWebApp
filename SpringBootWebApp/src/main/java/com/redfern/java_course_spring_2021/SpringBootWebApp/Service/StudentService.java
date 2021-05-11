package com.redfern.java_course_spring_2021.SpringBootWebApp.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.redfern.java_course_spring_2021.SpringBootWebApp.Model.Student;

@Service
public class StudentService {
	
	// THIS IS OUR BUSINESS LOGIC LAYER
	public List<Student> getStudents() {
		return Arrays.asList(new Student(
											102L,
											"He Man",
											"he_man@greyskull.cs",
											LocalDate.of(1980, Month.AUGUST, 11),
											40
				   						));
		
	}

}
