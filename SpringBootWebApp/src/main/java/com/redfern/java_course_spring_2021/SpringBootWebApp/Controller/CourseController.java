package com.redfern.java_course_spring_2021.SpringBootWebApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redfern.java_course_spring_2021.SpringBootWebApp.DAO.CourseDAO;

@RestController
public class CourseController {
	
	@Autowired
	CourseDAO courseDAO;
	
	@RequestMapping("/course") //localhost:portnumber/course
	public String course() {
		return "Course Page";
	}
}
