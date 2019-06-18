package com.spring.demo.HibernateUtil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring.demo.Entity.Student;

public class HibernateUtil 
{
		private static SessionFactory sf;
		
		static {
			try {
				sf = new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Student.class)
						.buildSessionFactory();
			}catch(Exception e) {
				System.out.println(e);
			}
		}

		public static SessionFactory getSF() {
			return sf;
		}

}
