package com.spring.Jdbc.dao;


import java.util.List;

import com.spring.Jdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	public int update1(Student student);
	public int delete(int studentId);
	public Student getStudent(int studentId);
	public List<Student> getAllStudent();
	
}
