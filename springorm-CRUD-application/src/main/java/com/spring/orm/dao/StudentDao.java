package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.StudentEntity;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(StudentEntity student) {
		//insert
		Integer i = (Integer)this.hibernateTemplate.save(student);
		return i;
	}
	
	//get SIngle data object
	public StudentEntity getStudent(int studentId) {
		StudentEntity s = this.hibernateTemplate.get(StudentEntity.class, studentId);
		return s;
	}
	
	//get all data object
		public List<StudentEntity> getAllStudent() {
			List<StudentEntity> s = this.hibernateTemplate.loadAll(StudentEntity.class);
			return s;
		}
		
		//delete student
		@Transactional
		public StudentEntity deleteStudent(int studentID) {
		    StudentEntity s = this.hibernateTemplate.get(StudentEntity.class, studentID);
			this.hibernateTemplate.delete(s);
			return s;
		}	
		
		// update student
		@Transactional
		public void updateStudent(StudentEntity uStudent) {
			 this.hibernateTemplate.update(uStudent);
		}
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	

}
