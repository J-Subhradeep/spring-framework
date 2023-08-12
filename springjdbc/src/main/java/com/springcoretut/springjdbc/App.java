package com.springcoretut.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcoretut/springjdbc/conf.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String query = "CREATE TABLE IF NOT EXISTS students("
                + "ID SERIAL PRIMARY KEY, "
                + "NAME VARCHAR (200) NOT NULL," +
                "CITY varchar(255) NOT NULL)";
        template.execute(query);
        Student st = new Student("Abinash", "Bangkok");
        StudentDaoImpl impl = context.getBean("studentDao", StudentDaoImpl.class);
        impl.insert(st);

    }
}
