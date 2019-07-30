/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnectionDemoWithDAOPattern;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author monirujjaman
 */
public interface StudentDAO {
    Student create(Student student);
    Student retrive(String studentId);
    
    List<Student>retrive();
    List<Student>retrive(Predicate<Student>predicate);
    default int count(){
        return retrive().size();
    }
}
