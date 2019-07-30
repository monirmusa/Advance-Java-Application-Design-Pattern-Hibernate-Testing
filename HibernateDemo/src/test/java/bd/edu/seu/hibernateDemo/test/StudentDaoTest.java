/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.edu.seu.hibernateDemo.test;

import bd.edu.seu.hibernatedemo.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Monirujjaman
 */
public class StudentDaoTest {
private static Validator validator;
    public StudentDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
         
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class StudentDao.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Student student = new Student(1234l, new Name("John", " doe"), LocalDate.of(2001, Month.FEBRUARY, 13), "no", new ArrayList<>(), Gender.MALE);
        
        student.getPhoneList().add("01303154763");
        student.getPhoneList().add("09703154763");
        
        StudentDao instance = new StudentDao();
  
       
        Set<ConstraintViolation<Student>> validate =null;
        
        try{
            validator.validate(student);
            instance.create(student);   
       
        }catch(Exception e)
        {
        assertEquals(1 , validate.size());   
        validate.forEach(v->System.err.printf("Message [%s]\n",v.getMessage()));

        }

//  validate.forEach(System.err::println);
    
    }

    /**
     * Test of retrive method, of class StudentDao.
     */
    @Test
    @Ignore
    public void testRetriveAll() {
        System.out.println("retrive all");
        StudentDao instance = new StudentDao();
        Student student1 = new Student(1216l, new Name("John", " doe"), LocalDate.of(2001, Month.FEBRUARY, 11), "Everyboday@gmail.com", new ArrayList<>(), Gender.MALE);
        Student student2 = new Student(1234l, new Name("Khan", " doe"), LocalDate.of(2001, Month.FEBRUARY, 15), "Strongday@gmail.com", new ArrayList<>(), Gender.FEMALE);
        instance.create(student1);
        instance.create(student2);
        List<Student> studentList = instance.retrive();
        assertEquals(3, studentList.size());
        assertEquals(student1, studentList.get(0));
        assertEquals(student2, studentList.get(1));

// TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrive method, of class StudentDao.
     */
    @Test
    //@Ignore
    public void testRetriveById() {
        System.out.println("retrive by Id");
        StudentDao instance = new StudentDao();
        Long longId = 24411391l;
        Student student1 = new Student(longId, new Name("Loan", " doe"), LocalDate.of(2001, Month.FEBRUARY, 15), "noboday@gmail.com", new ArrayList<>(), Gender.MALE);
        student1.getPhoneList().add("0180315400 3");

        instance.create(student1);

        Student student2 = instance.retrive(longId);

        assertEquals(student1, student2);
    }

}
