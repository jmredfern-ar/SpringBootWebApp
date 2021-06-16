package com.redfern.java_course_spring_2021.SpringBootWebApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redfern.java_course_spring_2021.SpringBootWebApp.DAO.ScholarshipDAO;
import com.redfern.java_course_spring_2021.SpringBootWebApp.Model.Scholarship;

@Service
public class ScholarshipService {
	
	@Autowired
	private ScholarshipDAO scholarshipDAO;

	public List<Scholarship> findAll() {
		return scholarshipDAO.findAll();
	}

}
