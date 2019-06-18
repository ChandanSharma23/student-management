package com.spring.demo.Service4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.demo.Entity.Student;

@Service
public interface StudentService {
	
	
	public void addStudent(Student student);

	public List<Student> getAllStudent();

	public void deleteStudent(int id);

	public Student getStudent(int id);

	public Student updateStudent(Student student);

}
