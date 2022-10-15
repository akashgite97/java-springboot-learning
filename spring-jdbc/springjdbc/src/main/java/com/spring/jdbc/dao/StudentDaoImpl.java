package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entites.Student;

@Component
public class StudentDaoImpl implements StudentDaoInterface {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		// TODO Auto-generated method stub
		//Insert query
        String query="insert into student(id, name, city) values(?,?,?)";
        int result =this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
        System.out.print("Record inserted Successfully" +result);
		return result;
	} 
	
	//Update values
	public int update(Student student) {
		
		//Update query
        String Updatequery="update student set name=?, city=? where id=?";
        int updateResult =this.jdbcTemplate.update(Updatequery,student.getName(),student.getCity(),student.getId());
        System.out.print("Record updated Successfully" +updateResult);
		return updateResult;
	}
	
	//Delete values
		public int delete(int studentId) {
			
			//Update query
	        String deleteQuery="delete from student where id=?";
	        int deleteResult =this.jdbcTemplate.update(deleteQuery,studentId);
	        System.out.print("Record deleted Successfully" +deleteResult);
			return deleteResult;
		}
		
		//Select values
		public Student getStudent(int studentId) {
			 String selectQuery="select * from student where id=?";
			 RowMapper<Student> rowMapper = new RowMapperImpl();
		     Student student =this.jdbcTemplate.queryForObject(selectQuery,rowMapper,studentId); 
			return student;
		}
		
		public List<Student> getAllStudents() {
			String selectAllQuery = "select * from student";
			List<Student> students =this.jdbcTemplate.query(selectAllQuery,new RowMapperImpl()); 
			return students;	
		}
		
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public String toString() {
		return "StudentDaoImpl [jdbcTemplate=" + jdbcTemplate + "]";
	}

	
	
	
}
