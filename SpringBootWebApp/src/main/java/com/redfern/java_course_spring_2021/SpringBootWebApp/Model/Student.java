package com.redfern.java_course_spring_2021.SpringBootWebApp.Model;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	// MEM VARS
	@Id
	private Long id; 
	private String name;
	private String email;
	private LocalDate dob;
	private Integer age;
	
	@OneToMany(mappedBy = "student")
	private List<Course> courses;
	
	// CONSTRUCTORS
	public Student() {
		super();
		System.out.println("Student constructor called...");
		System.out.println(this.getName());
	}

	public Student(Long id, String name, String email, LocalDate dob, Integer age) {
		super();
		System.out.println("Called constructor 5 parms");
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
	}
	
	

	public Student(Long id, String name, String email, LocalDate dob, Integer age, List<Course> courses) {
		super();
		System.out.println("Called constructor 6 parms");
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
		this.courses = courses;
	}

	//GETTERS & SETTERS
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", age=" + age + "]";
	}
}
