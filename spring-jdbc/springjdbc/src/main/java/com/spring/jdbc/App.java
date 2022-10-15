package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring JDBC" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDaoImpl studentDaoImpl =context.getBean("studentDao",StudentDaoImpl.class);
        
        //Insert
//        Student s= new Student();
//        s.setId(55);
//        s.setName("mama");
//        s.setCity("jalna");
//        
//        studentDaoImpl.insert(s);
        
        //Insert query
//        String query="insert into student(id, name, city) values(?,?,?)";
//        int result =template.update(query,33,"Raja", "mumbai");
//        System.out.print("Record inserted Successfully" +result);
        
        
        //Update 
//        Student s2 = new Student();
//        s2.setId(22);
//        s2.setName("updatedName");
//        s2.setCity("updatedCity");
//        
//        int updateResult = studentDaoImpl.update(s2);
//        System.out.print("Updated Result"+ updateResult);
        
        //Delete:
           
//        int deleteResult = studentDaoImpl.delete(33);
//        System.out.println("Updated Result"+ deleteResult);
        
        //Select single data
//        Student student = studentDaoImpl.getStudent(11);
//        System.out.println("selected Result"+ student);
        
        //getAll values from DB
         List<Student> students = studentDaoImpl.getAllStudents();
         for(Student s: students) {
        	 System.out.println(s);
         }
        
        
    }
}
