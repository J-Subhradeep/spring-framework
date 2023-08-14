package com.springcoretut.springjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
public class JdbcConfig {

    @Bean(name = { "ds" })
    public DriverManagerDataSource getDataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("org.postgresql.Driver");
        ds.setUrl("jdbc:postgresql://localhost:5432/springjdbcDB");
        ds.setUsername("postgres");
        ds.setPassword("admin");
        return ds;
    }

    @Bean(name = { "jdbcTemplate" })
    public JdbcTemplate getJdbcTemplate() {
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(getDataSource());
        return template;
    }

    @Bean(name = { "studentDao" })
    public StudentDaoImpl studentDao() {
        StudentDaoImpl dao = new StudentDaoImpl();
        dao.setJdbcTemplate(getJdbcTemplate());
        return dao;
    }
}
