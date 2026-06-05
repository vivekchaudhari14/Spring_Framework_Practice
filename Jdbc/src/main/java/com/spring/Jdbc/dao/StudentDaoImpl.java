package com.spring.Jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

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
	
	
}
