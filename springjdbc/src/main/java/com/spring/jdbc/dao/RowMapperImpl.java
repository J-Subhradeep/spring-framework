package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.spring.jdbc.entites.Student;

public class RowMapperImpl implements RowMapper<Student>{

    @Override
    @Nullable
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        // TODO Auto-generated method stub
        Student student = new Student();
        student.setId(rs.getInt(1));
        student.setName(rs.getString(2));
        student.setCity(rs.getString(3));

        return student;
    }
    
}
