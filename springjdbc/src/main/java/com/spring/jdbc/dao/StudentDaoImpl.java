package com.spring.jdbc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Student;

public class StudentDaoImpl implements StudentDao {
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
		int r = this.jdbcTemplate.update(q, student.getName(), student.getCity());
		return r;
	}

	@Override
	public int change(Student student) {
		// updating data
		String q = "update students set name=?, city=? where id=?";
		this.jdbcTemplate.update(q, student.getName(), student.getCity(), student.getId());

		return 0;
	}

	@Override
	public int delete(Student student) {

		String q = "delete from students where id=?";
		return this.jdbcTemplate.update(q, student.getId());

	}

	@Override
	public Student getStudent(int studentId) {

		String q = "select * from students where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		return this.jdbcTemplate.queryForObject(q, rowMapper, studentId);
		// return null;
	}

	@Override
	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		String q = "select * from students";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		
		List<Student> res=this.jdbcTemplate.query(q,rowMapper);
		return res;
	}

}
