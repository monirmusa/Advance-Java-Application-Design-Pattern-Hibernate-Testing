/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnectionDemoWithDAOPattern;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seu
 */
public class StudentDAOFileImplementation implements StudentDAO{

    @Override
    public Student create(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student retrive(String studentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> retrive() {
  
       List<Student> studentList=new ArrayList<>();
        //java 7;try with resource
        try(RandomAccessFile input=new RandomAccessFile("student.txt","r")) {
          String line;
          
          while((line=input.readLine())!=null){
          String id=line.split("\\;")[0];
          String name=line.split("\\;")[1];
          Student student=new Student(id,name);
          studentList.add(student);
          }
          
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentDAOFileImplementation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentDAOFileImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
   return studentList;
    }



    @Override
    public int count() {
        return StudentDAO.super.count(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> retrive(Predicate<Student> predicate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
