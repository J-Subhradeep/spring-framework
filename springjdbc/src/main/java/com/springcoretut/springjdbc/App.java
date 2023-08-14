package com.springcoretut.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
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
        // Student st = new Student("Sujoy","Netaji Subhash");
        // StudentDao dao = context.getBean("studentDao",StudentDao.class);
        // dao.insert(st);

        // Student st = new Student("Sujoy Debnath","Airport",3);
        // StudentDao dao = context.getBean("studentDao",StudentDao.class);
        // dao.change(st);

        // Student st = new Student();
        // st.setId(2);
        // StudentDao dao = context.getBean("studentDao",StudentDao.class);
        // dao.delete(st);

        // get student
        // StudentDao dao = context.getBean("studentDao", StudentDao.class);
        // Student st = dao.getStudent(1);
        // System.out.println(st);

        // get all students
        StudentDao dao = context.getBean("studentDao", StudentDao.class);
        List<Student> students = dao.getStudentList();
        System.out.println(students);

    }
}
