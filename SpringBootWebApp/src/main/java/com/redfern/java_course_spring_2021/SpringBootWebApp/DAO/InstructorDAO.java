package com.redfern.java_course_spring_2021.SpringBootWebApp.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redfern.java_course_spring_2021.SpringBootWebApp.Model.Instructor;

public interface InstructorDAO extends JpaRepository<Instructor, Long> {

}
