package com.redfern.java_course_spring_2021.SpringBootWebApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.redfern.java_course_spring_2021.SpringBootWebApp.Model.Instructor;
import com.redfern.java_course_spring_2021.SpringBootWebApp.Service.InstructorService;

@Controller
@RequestMapping("api/v1")
public class InstructorController {
	
	@Autowired
	private InstructorService instructorService;
	
	@GetMapping("/instructors")
	public String getInstructors(Model model) {
		List<Instructor> instructors = instructorService.findAll();
		model.addAttribute("instructors", instructors);
		return "instructor-list.html";
	}
}
