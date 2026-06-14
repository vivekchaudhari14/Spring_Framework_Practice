package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class StudentTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/Confi.xml");
		StudentDao s =  context.getBean("studentDao",StudentDao.class);
		
		Student student = new Student(222,"Vivek Chuahdari","Pimpale");
		int res = s.insert(student);
		
		System.out.println("Done Entry"+res);
		
	}

}
