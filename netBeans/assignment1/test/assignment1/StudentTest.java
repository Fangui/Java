/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 16108849
 */
public class StudentTest {

    
    Student std1 = new Student("Data", "Dave","1846546");
    
    /**
     * Test of getCourse method, of class Student.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        Student instance = std1;
        String expResult = "Data";
        String result = instance.getCourse();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = std1;
        String expResult = "Dave";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getStudentID method, of class Student.
     */
    @Test
    public void testGetStudentID() {
        System.out.println("getStudentID");
        Student instance = std1;
        String expResult = "1846546";
        String result = instance.getStudentID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
