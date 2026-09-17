/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poepart1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    //MY JUNIT TESTS
    @Test
    public void testCheckUserName_CorrectlyFormatted() {
        System.out.println("checkUserName");
        Login instance = new Login("Kyle", "Smith", "+27838968976", "kyl_1", "Ch&&sec@ke99!");
        boolean expResult = true;
        boolean result = instance.checkUserName();
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckUserName_IncorrectlyFormatted() {
        System.out.println("checkUserName");
        Login instance = new Login("Kyle", "Smith", "+27838968976", "kyle!!!!!!!", "Ch&&sec@ke99!");
        boolean expResult = false;
        boolean result = instance.checkUserName();
        assertEquals(expResult, result);
    }

    /**
     * Test of checkCellPhoneNumber method, of class Login.
     */
    @Test
    public void testCheckCellPhoneNumber_CorrectlyFormatted() {
        System.out.println("checkCellPhoneNumber");
        Login instance = new Login("Kyle", "Smith", "+27838968976", "kyl_1", "Ch&&sec@ke99!");
        boolean expResult = true;
        boolean result = instance.checkCellPhoneNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckCellPhoneNumber_IncorrectlyFormatted() {
        System.out.println("checkCellPhoneNumber");
        Login instance = new Login("Kyle", "Smith", "08966553", "kyl_1", "Ch&&sec@ke99!");
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity_MeetsRequirements() {
        System.out.println("checkPasswordComplexity");
        Login instance = new Login("Kyle", "Smith", "+27838968976", "kyl_1", "Ch&&sec@ke99!");
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity();
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckPasswordComplexity_DoesNotMeetRequirements() {
        System.out.println("checkPasswordComplexity");
        Login instance = new Login("Kyle", "Smith", "+27838968976", "kyl_1", "password");
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity();
        assertEquals(expResult, result);
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser_Success() {
        System.out.println("registerUser");
        Login instance = new Login("Kyle", "Smith", "+27838968976", "kyl_1", "Ch&&sec@ke99!");
        String expResult = "Cell phone number successfully captured. Username successfully captured. Password successfully captured. ";
        String result = instance.registerUser();
        assertEquals(expResult, result);
    }

    @Test
    public void testRegisterUser_Failure() {
        System.out.println("registerUser");
        Login instance = new Login("Kyle", "Smith", "08966553", "kyle!!!!!!!", "password");
        String result = instance.registerUser();
        assertTrue(result.contains("incorrectly formatted") || result.contains("not correctly formatted"));
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser_Successful() {
        System.out.println("loginUser");
        String enteredUsername = "kyl_1";
        String enteredpassword = "Ch&&sec@ke99!";
        Login instance = new Login("Kyle", "Smith", "+27838968976", "kyl_1", "Ch&&sec@ke99!");
        boolean expResult = true;
        boolean result = instance.loginUser(enteredUsername, enteredpassword);
        assertEquals(expResult, result);
    }

    @Test
    public void testLoginUser_Failed() {
        System.out.println("loginUser");
        String enteredUsername = "kyl_1";
        String enteredpassword = "WrongPassword1!";
        Login instance = new Login("Kyle", "Smith", "+27838968976", "kyl_1", "Ch&&sec@ke99!");
        boolean expResult = false;
        boolean result = instance.loginUser(enteredUsername, enteredpassword);
        assertEquals(expResult, result);
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus_Success() {
        System.out.println("returnLoginStatus");
        String enteredUsername = "kyl_1";
        String enteredpassword = "Ch&&sec@ke99!";
        Login instance = new Login("Kyle", "Smith", "+27838968976", "kyl_1", "Ch&&sec@ke99!");
        String expResult = "Welcome Kyle, Smith it is great to see you again.";
        String result = instance.returnLoginStatus(enteredUsername, enteredpassword);
        assertEquals(expResult, result);
    }

    @Test
    public void testReturnLoginStatus_Failure() {
        System.out.println("returnLoginStatus");
        String enteredUsername = "kyl_1";
        String enteredpassword = "WrongPassword1!";
        Login instance = new Login("Kyle", "Smith", "+27838968976", "kyl_1", "Ch&&sec@ke99!");
        String expResult = "Username or password incorrect, please try again.";
        String result = instance.returnLoginStatus(enteredUsername, enteredpassword);
        assertEquals(expResult, result);
    }
    
}
