package com.spring.Jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.Jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insert(Student student) {
		String q = "INSERT INTO student(id,name,city) values(?,?,?)";
		int result = this.jdbcTemplate.update(q,student.getId(),student.getName(),student.getCity());
		return result;
	}
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	@Override
	public int update1(Student student) {
		String q = "UPDATE student SET name = ?,city = ? WHERE id = ?";
		int r = this.jdbcTemplate.update(q,student.getName(),student.getCity(),student.getId());
		return r;
	}



	@Override
	public int delete(int studentId) {
		String q = "DELETE FROM student Where id = ?";
		int r = this.jdbcTemplate.update(q,studentId);
		return r;
	}



	@Override
	public Student getStudent(int studentId) {
		String q ="SELECT * FROM student WHERE id = ?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(q,rowMapper,studentId);
		return student;
	}



	@Override
	public List<Student> getAllStudent() {
		String q = "SELECT *FROM student";
		List<Student> students = this.jdbcTemplate.query(q, new RowMapperImpl());
		return students;
	}
	
	
}
