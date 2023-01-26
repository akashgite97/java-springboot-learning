package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentdetails")
public class StudentEntity {

	@Id
	@Column(name="student_id")
	private int studentId;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="student_city")
	private String studentCity;

	public StudentEntity(int studentId, String studentName, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}

	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setStudentId(int uid) {
		// TODO Auto-generated method stub
		this.studentId = uid;
	}

	public void setStudentName(String uName) {
		// TODO Auto-generated method stub
		this.studentName=uName;
		
	}

	public void setStudentCity(String uCity) {
		// TODO Auto-generated method stub
		this.studentCity=uCity;
		
	}

	public String getStudentName() {
		// TODO Auto-generated method stub
		return studentName;
	}
	
	public int getStudentId() {
		// TODO Auto-generated method stub
		return studentId;
	}
	
	public String getStudentCity() {
		// TODO Auto-generated method stub
		return studentCity;
	}

	

	
	
	
}
