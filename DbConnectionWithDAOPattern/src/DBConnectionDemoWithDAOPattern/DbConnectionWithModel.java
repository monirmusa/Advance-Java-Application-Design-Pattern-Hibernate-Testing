/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnectionDemoWithDAOPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author monirujjaman
 */
public class DbConnectionWithModel {

    public void insertStudent(Student student){
      try {
          Connection connection=ConnectionDb.getConnection();
          Statement statement = connection.createStatement();
          statement.executeUpdate("INSERT INTO STUDENT VALUES('"+student.getId()+"','"+student.getName()+"')");
      
      
      
      
      } catch (SQLException ex) {
          Logger.getLogger(DbConnectionWithModel.class.getName()).log(Level.SEVERE, null, ex);
      }
    
    }
    
    
    public List<Student> retriveStudent(){
        List<Student>studentList=new ArrayList<>();
           try {
          Connection connection=ConnectionDb.getConnection();
         for(int i=0;i<100;i++)
             connection=ConnectionDb.getConnection();
          
          Statement statement = connection.createStatement();
               ResultSet resultSet = statement.executeQuery("SELECT *FROM student");
                 while(resultSet.next()){
               String id=resultSet.getString("id");
               String name=resultSet.getString("name");
               //System.out.printf("%s %s\n",id,name);
              Student  student=new Student(id,name);
              studentList.add(student);
                 
                 }
               
      
      
      } catch (SQLException ex) {
          Logger.getLogger(DbConnectionWithModel.class.getName()).log(Level.SEVERE, null, ex);
      }
        
     return studentList;   
        
    }
    
    
  public  DbConnectionWithModel(){
   //insertStudent("2016000000876","sadat khan");
   // retriveStudent().stream().forEach(student->System.out.println(student));
  

   StudentDAO studentDAO=new StudentDAOMySqlImplementation();
     /*     ///////Dao cheking  Add to DB///////////////
   Student student=new Student("44501","Mujjammel");
   System.out.printf("inserting [%s]\n",student);
     Student createStudent=studentDAO.create(student);
   System.out.printf("inserted [%s]\n",createStudent);
*/
      ///////Dao cheking  Retrive from DB///////////////
 //  studentDAO.retrive().stream().forEach(System.out::println);
   ///////Dao cheking  Retrive from DB as like Filtering///////////////
   studentDAO.retrive(student->student.getId().startsWith("2016"))
             .stream().forEach(System.out::println);
         
      System.out.printf("Student Coun %d\n",studentDAO.count());

  }
  
  
    
    public static void main(String[] args) {
       new DbConnectionWithModel();
    }

   
    
}
