package com.spring.Jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.Jdbc.dao.StudentDao;
import com.spring.Jdbc.entities.Student;

public class StudentDaoTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Jdbc/NewFile.xml");
		StudentDao s = context.getBean("studentDao", StudentDao.class);

		//Student student = new Student();

		
		/*
		 * student.setId(54); student.setName("Uday"); student.setCity("Yerwada"); int
		 * res = s.insert(student); System.out.println("Data Inserted"+res);
		 * 
		 * student.setName("Vivek C");student.setCity("Pimpale");student.setId(111); int
		 * res = s.update1(student); System.out.println("Data updated" + res);
		 */
		
		/*
		 * student.setId(54); int res = s.delete(student.getId());
		 * System.out.println("Student is deleted"+res);
		 */
		
//		Student student = s.getStudent(203);
//		System.out.println(student);
		
		List<Student> students = s.getAllStudent();
		
		for (Student student : students) {
				System.out.println(student);
		}
	}
}
