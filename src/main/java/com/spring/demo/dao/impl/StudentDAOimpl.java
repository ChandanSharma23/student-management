package com.spring.demo.dao.impl;

import org.hibernate.Session;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.spring.demo.Entity.Student;
import com.spring.demo.HibernateUtil.HibernateUtil;

import com.spring.demo.dao.StudentDAO;
import java.util.List;


@Repository
public class StudentDAOimpl implements StudentDAO {
	
	




	public void addStudent(Student student) {
		
		
	
	
		
				// create session
				Session session = HibernateUtil.getSF().openSession();
				
				try {			
					// create a student object
					System.out.println("Creating new student object.."  );
				
					
					// start a transaction
					session.beginTransaction();
					
					// save the student object
					System.out.println("Saving the student...");
					session.save(student);
					
					// commit transaction
					session.getTransaction().commit();
					
					System.out.println("Done!");
				}catch(Exception ex) {
					session.getTransaction().rollback();
				}
				finally {
					session.close();
				}
		

	}


 public void deleteStudent(int id) {

	 Session session = HibernateUtil.getSF().openSession();
	 
	 try {
		 
			session.beginTransaction();
			System.out.println("deleting the student...");
		 
	 Student student = (Student) session.load(Student.class,id);
	 if(null!= student)
	 {
	 session.delete(student);
	 }
	 
	 session.getTransaction().commit();
	 
	}
	 catch(Exception ex) {
			session.getTransaction().rollback();
		}
		finally {
			session.close();
		}
 
 
 
 
 }
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSF().openSession();
		System.out.println("All the student...");
	
		
		List<Student> list = null;
		try {
			session.beginTransaction();
		List list2 = session.createQuery("from Student", Student.class).list();
		list = list2;
		
		
		session.getTransaction().commit();
	}
		catch(Exception ex) {
			session.getTransaction().rollback();
		}
		finally {
			session.close();
		}
		return list;
	
	}
	
	
	
	public Student updateStudent(Student student) {
		
		Session session = HibernateUtil.getSF().openSession();
		try {
			session.beginTransaction();
			System.out.println("Updating  the student...");
			
			session.update(student);
			
			
			session.getTransaction().commit();
		}
		catch(Exception ex) {
			session.getTransaction().rollback();
		}
		finally {
			session.close();
		}
		
		return student;
	}

	
	
	
	
	public Student getStudent(int id) {
		
		Session session = HibernateUtil.getSF().openSession();
		Student s = null;
		try {
			session.beginTransaction();
			System.out.println("getting the student...");
			
			
			
		 s = (Student) session.get(Student.class,id);
			session.getTransaction().commit();
			return s;
		}
		catch(Exception ex) {
			session.getTransaction().rollback();
		}
		finally {
			session.close();
		}
return s;
}
}
