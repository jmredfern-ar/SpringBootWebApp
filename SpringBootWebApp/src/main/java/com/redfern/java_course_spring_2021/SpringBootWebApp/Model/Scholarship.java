package com.redfern.java_course_spring_2021.SpringBootWebApp.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Scholarship {
	
	@Id
	private Long id;
	private String name;
	private int amount;
	
	@ManyToMany(mappedBy="scholarships")
	private List<Student> students;
	
	public Scholarship() {
		super();
		System.out.println("Calling Scholarship constructor...");
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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
