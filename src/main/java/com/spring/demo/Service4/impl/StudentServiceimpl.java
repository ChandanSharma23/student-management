package com.spring.demo.Service4.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.demo.Entity.Student;
import com.spring.demo.Service4.StudentService;
import com.spring.demo.dao.StudentDAO;
import com.spring.demo.dao.impl.StudentDAOimpl;

@Service
public class StudentServiceimpl implements StudentService {
	
	@Autowired
	@Qualifier("studentDAOimpl")
	StudentDAO studentdao;

	public Student getStudent(int id) {
	return	studentdao.getStudent(id);
		
	}

	public Student updateStudent(Student student) {
	return studentdao.updateStudent(student);

	}
	
	public void deleteStudent(int id) {
		studentdao.deleteStudent(id);
	}
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentdao.addStudent(student);
		
	}
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentdao.getAllStudents();
	}

}
