package com.redfern.java_course_spring_2021.SpringBootWebApp.Model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StudentTest {
	
	// STATIC VARS
	static Student s = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		s = new Student(
						102L,
						"Luke Skywalker",
						"luke@theforcerox.net",
						LocalDate.of(1977, Month.DECEMBER, 4),
						53
						);
	}

	@Test
	void getAge_GivenInt_ShouldReturnInt() {
		assertEquals(s.getAge(), 53);
	}

}
