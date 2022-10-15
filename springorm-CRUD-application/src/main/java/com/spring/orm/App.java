package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.StudentEntity;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("configs.xml");
         StudentDao studentDao = context.getBean("studentsDao",StudentDao.class);
         
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         boolean go = true;
         while(go) {
        	 System.out.println("Press 1 for add student");
             System.out.println("Press 2 for display all students");
             System.out.println("Press 3 get details of single student");
             System.out.println("Press 4 for delete student");
             System.out.println("Press 5 for update student");
             System.out.println("Press 6 for Exit");
             
             try {
            	 int choice = Integer.parseInt(br.readLine());
            	 
            	 switch(choice) {
            	 case 1:
            		 //add student
            		 System.out.println("Enter user id:");
            		 int uid = Integer.parseInt(br.readLine());

            		 System.out.println("Enter user name:");
            		 String uName = br.readLine();
            		 
            		 System.out.println("Enter user city:");
            		 String uCity =  br.readLine();
            		 
            		 StudentEntity s = new StudentEntity();
            		 s.setStudentId(uid);
            		 s.setStudentName(uName);
            		 s.setStudentCity(uCity);
            		 
            		 int result=studentDao.insert(s);
            		 System.out.println("Student added with ID " +result);
            		 System.out.println("******************************");
            		 System.out.println();
            		 
            		 break;
            	 case 2:
            		 //display all students
            		 System.out.println("******************************");
            		 List<StudentEntity> allStudent = studentDao.getAllStudent();
            		 for(StudentEntity st:allStudent) {
            			 System.out.println("Id: "+st.getStudentId());
            			 System.out.println("Name: "+st.getStudentName());
            			 System.out.println("City: "+st.getStudentCity());
            			 System.out.println("---------------------------");
            		 }
            		 System.out.println("******************************");
            		 break;
            	 case 3:
            		 //get single stduent
            		 System.out.println("Enter user id:");
            		 int id = Integer.parseInt(br.readLine());
            		 StudentEntity stu = studentDao.getStudent(id);
            		 System.out.println("Id: "+stu.getStudentId());
        			 System.out.println("Name: "+stu.getStudentName());
        			 System.out.println("City: "+stu.getStudentCity());
        			 System.out.println("---------------------------");
    
            		 break;
            	 case 4:
            		 //delete student
            		 System.out.println("Enter user id:");
            		 int studentId = Integer.parseInt(br.readLine());
            		 StudentEntity delelteStudent = studentDao.deleteStudent(studentId);
            		 System.out.println("Student deleted: "+delelteStudent);
        			 System.out.println("---------------------------");
            		 break;	 
            	 case 5:
            		 //update student
            		 System.out.println("Enter user id:");
            		 int stuId = Integer.parseInt(br.readLine());
            		 StudentEntity uStudent = studentDao.getStudent(stuId);
            		 
            		 System.out.println("Enter user id:");
            		 int sId = Integer.parseInt(br.readLine());

            		 System.out.println("Enter user name:");
            		 String sName = br.readLine();
            		 
            		 System.out.println("Enter user city:");
            		 String sCity =  br.readLine();
            		 
            		 uStudent.setStudentId(sId);
            		 uStudent.setStudentName(sName);
            		 uStudent.setStudentCity(sCity);
            		 studentDao.updateStudent(uStudent);
            		
        			 System.out.println("---------------------------");
            		 
            		 break;	 
            	 case 6:
            		 //Exit
            		 go=false;
            		 break;		 
            		 
            		 
            	 }
             }catch(Exception e) {
        	   System.out.println("Invalid input try with another one");
        	   System.out.println(e.getMessage());
          }
             System.out.println("Thank you for using my application1"); 
         }
         
         
         
         
         
//         StudentEntity s = new StudentEntity(1884,"orm","pune");
//        
//         int result = studentDao.insert(s);
//         System.out.println(result);
//         
//         List<StudentEntity> students= studentDao.getAllStudent();
//         for(StudentEntity stu: students) {
//        	 System.out.println(stu);
//         }
         
    }
}
