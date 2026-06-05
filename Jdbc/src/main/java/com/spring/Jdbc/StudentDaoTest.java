package com.spring.Jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Jdbc.dao.StudentDao;
import com.spring.Jdbc.entities.Student;

public class StudentDaoTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Jdbc/NewFile.xml");
		StudentDao s = context.getBean("studentDao",StudentDao.class);
		
		Student student = new Student();
		
		student.setId(54);
		student.setName("Uday");
		student.setCity("Yerwada");
		
		int res = s.insert(student);
		System.out.println("Data Inserted"+res);
	}
}
