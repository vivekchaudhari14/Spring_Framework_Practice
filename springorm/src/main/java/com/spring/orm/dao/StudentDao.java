package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	  
	private HibernateTemplate hibernateTemplate;
	  
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}



	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Transactional
	public int insert(Student student) {
		int i = (int) this.hibernateTemplate.save(student);
		return i;
	}
	
	// get Single info student
	public Student getStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	// get All student
	
	public List<Student> getAllStudent(){
		List<Student> student = this.hibernateTemplate.loadAll(Student.class);
		return student;
		
	}
	
	
	// delete Student Id
	
	public void deleteId(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class,studentId);
		this.hibernateTemplate.delete(student);
	}
	
	// Update data
	
	public void updateStudent(Student student) {
		
		this.hibernateTemplate.update(student);
		
	}
}
