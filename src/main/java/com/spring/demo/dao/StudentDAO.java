package com.spring.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.demo.Entity.Student;



@Repository
public interface StudentDAO {
	
	public void addStudent(Student student);
	public List<Student> getAllStudents();
	public Student updateStudent(Student student );
	public void deleteStudent(int id);
	public Student getStudent(int id);

}
