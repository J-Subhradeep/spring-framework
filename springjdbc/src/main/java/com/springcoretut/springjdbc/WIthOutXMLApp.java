package com.springcoretut.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class WIthOutXMLApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao dao = context.getBean("studentDao", StudentDao.class);
        List<Student> students = dao.getStudentList();
        System.out.println(students);
    }
}
