package com.redfern.java_course_spring_2021.SpringBootWebApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.redfern.java_course_spring_2021.SpringBootWebApp.Model.Scholarship;
import com.redfern.java_course_spring_2021.SpringBootWebApp.Service.ScholarshipService;

@Controller
@RequestMapping("api/v1")
public class ScholarshipController {
	
	@Autowired
	private ScholarshipService scholarshipService;
	
	@GetMapping("scholarships")
	private String getScholarships(Model model) {
		List<Scholarship> scholarships = scholarshipService.findAll();
		model.addAttribute("scholarships", scholarships);
		return "scholarship-list.html";
	}

}
