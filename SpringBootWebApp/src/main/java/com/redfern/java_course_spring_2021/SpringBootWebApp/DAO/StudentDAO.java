package com.redfern.java_course_spring_2021.SpringBootWebApp.DAO;

import org.springframework.data.repository.CrudRepository;

import com.redfern.java_course_spring_2021.SpringBootWebApp.Model.Student;

public interface StudentDAO extends CrudRepository<Student, Long> {

}
