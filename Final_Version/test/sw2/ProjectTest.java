/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fc
 */
public class ProjectTest {
    
    public ProjectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
     * Test of Check_Login method, of class Project.
     */
    @Test
    public void testCheck_Login() {
        System.out.println("Check_Login");
        String student_id = "2200379";
        String password = "1234";
        Project instance = new Project();
        boolean expResult = true;
        boolean result = instance.Check_Login(student_id, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of main method, of class Project.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Project.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Check_Registration method, of class Project.
     */
    @Test
    public void testCheck_Registration() {
        System.out.println("Check_Registration");
        int student_level = 3;
        String student_id = "2200379";
        String student_name = "OM";
        String password = "1234";
        Project instance = new Project();
        boolean expResult = true;
        boolean result = instance.Check_Registration(student_level, student_id, student_name, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Check_Update method, of class Project.
     */
    @Test
    public void testCheck_Update() {
        System.out.println("Check_Update");
        String student_id = "2200379";
        String oldPassword = "123";
        String newPassword = "12345";
        Project instance = new Project();
        boolean expResult = false;
        boolean result = instance.Check_Update(student_id, oldPassword, newPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Check_Delete_Single_Student method, of class Project.
     */
    @Test
    public void testCheck_Delete_Single_Student() {
        System.out.println("Check_Delete_Single_Student");
        String student_id = "230379";
        Project instance = new Project();
        boolean expResult = false;
        boolean result = instance.Check_Delete_Single_Student(student_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Check_Delete_Multiple_Student method, of class Project.
     */
    @Test
    public void testCheck_Delete_Multiple_Student() {
        System.out.println("Check_Delete_Multiple_Student");
        String student_level = "5";
        Project instance = new Project();
        boolean expResult = false;
        boolean result = instance.Check_Delete_Multiple_Student(student_level);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Check_Max_Student_Id method, of class Project.
     */
    @Test
    public void testCheck_Max_Student_Id() {
        System.out.println("Check_Max_Student_Id");
        Project instance = new Project();
        boolean expResult = true;
        boolean result = instance.Check_Max_Student_Id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Check_Student_Count method, of class Project.
     */
    @Test
    public void testCheck_Student_Count() {
        System.out.println("Check_Student_Count");
        Project instance = new Project();
        boolean expResult = true;
        boolean result = instance.Check_Student_Count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Check_Min_Student_Id method, of class Project.
     */
    @Test
    public void testCheck_Min_Student_Id() {
        System.out.println("Check_Min_Student_Id");
        Project instance = new Project();
        boolean expResult = true;
        boolean result = instance.Check_Min_Student_Id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
