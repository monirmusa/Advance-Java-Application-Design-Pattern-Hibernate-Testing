/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnectionDemoWithDAOPattern;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author seu
 */
public class StudentDAOMySqlImplementation implements StudentDAO{

    @Override
    public Student create(Student student) {
         try {
          Connection connection=ConnectionDb.getConnection();
          Statement statement = connection.createStatement();
             int executeUpdate = statement.executeUpdate("INSERT INTO STUDENT VALUES('"+student.getId()+"','"+student.getName()+"')");
            return retrive(student.getId());
            
      
      
      
      } catch (SQLException ex) {
          Logger.getLogger(DbConnectionWithModel.class.getName()).log(Level.SEVERE, null, ex);
      } 
         return null;
    }

    @Override
    public Student retrive(String studentId) {
          try {
          Connection connection=ConnectionDb.getConnection();
          Statement statement = connection.createStatement();
              ResultSet resultSet = statement.executeQuery("SELECT * FROM student WHERE ID='"+studentId+"'");
            if(resultSet.next()){
              Student student=new Student(resultSet.getString("id"),resultSet.getString("name"));
                return student;
            
            
            
               
           } else  return null;
    
      } catch (SQLException ex) {
          Logger.getLogger(DbConnectionWithModel.class.getName()).log(Level.SEVERE, null, ex);
      } 
         return null;
    }

    @Override
    public List<Student> retrive() {
        List<Student>studentList=new ArrayList<>();
    try {
          Connection connection=ConnectionDb.getConnection();
          Statement statement = connection.createStatement();
              ResultSet resultSet = statement.executeQuery("SELECT * FROM student");
            while(resultSet.next()){
              Student student=new Student(resultSet.getString("id"),resultSet.getString("name"));
              studentList.add(student);  
            }
            return studentList;
         }
          catch (SQLException ex) {
          Logger.getLogger(DbConnectionWithModel.class.getName()).log(Level.SEVERE, null, ex);
      } 
         return null;
         
    
    }

    @Override
    public List<Student> retrive(Predicate<Student> predicate) {
    return retrive().stream().filter(predicate).collect(Collectors.toList());
    
    
    }
    
}
