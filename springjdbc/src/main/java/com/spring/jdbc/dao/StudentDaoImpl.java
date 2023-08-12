package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entites.Student;

public class StudentDaoImpl implements StudentDao{
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Student student) {
		String q = "insert into students(name,city) values(?,?)";
		int r = this.jdbcTemplate.update(q,student.getName(),student.getCity());
		return r;
	}
	
}
