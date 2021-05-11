package com.redfern.java_course_spring_2021.SpringBootWebApp.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	private Long id;
	private String name;
	private String department;
	private String instructor;
	
	// CONSTRUCTORS
	public Course() {
		super();
	}
	
	public Course(String name, String department, String instructor) {
		super();
		this.name = name;
		this.department = department;
		this.instructor = instructor;
	}

	public Course(Long id, String name, String department, String instructor) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.instructor = instructor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", department=" + department + ", instructor=" + instructor
				+ "]";
	}
}