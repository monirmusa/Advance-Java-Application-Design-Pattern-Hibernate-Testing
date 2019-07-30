/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.edu.seu.mavenlombocdbdemo;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Monirujjaman
 */
public class Main {

    public Main() {
        List<Student> students = new ArrayList<Student>();
        System.out.println("Hellow World");
        Student student1 = new Student(3431, "jhon doe", 17, 3.88, (List<Course>) new Course("CSE4039", "Advance java"));

        Student student2 = new Student(3432, "jhon khan", 25, 3.33, (List<Course>) new Course("CSE1011", "C Language"));
        Student student3 = new Student(3434, "jhon doe", 27, 3.00, (List<Course>) new Course("CSE4039", "Advance java lab"));
        students.add(student1);
        students.add(student2);
        students.add(student3);
        Connection connection = ConnectionSingleton.getConnection();

    }

    public boolean predicate(List<Student> studentList) {
        return studentList.stream().anyMatch(student -> student.getAge() < 22 && student.getCgpa() >= 3.5);

    }

    public static void main(String args[]) {
        new Main();

    }
}
