/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presentation;

import entities.LogForm;
import entities.RegForm;
import entities.User;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author okalman
 */
public class ManageUsersViewTest {
    
    public ManageUsersViewTest() {
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
     * Test of loginUser method, of class ManageUsersView.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        LogForm user = null;
        ManageUsersView instance = new ManageUsersView();
        boolean expResult = false;
        boolean result = instance.loginUser(user);
        assertEquals(expResult, result);
    }

    /**
     * Test of createUser method, of class ManageUsersView.
     */
    @Test
    public void testCreateUser() {
        System.out.println("createUser");
        RegForm newUser = null;
        ManageUsersView instance = new ManageUsersView();
        boolean expResult = false;
        boolean result = instance.createUser(newUser);
        assertEquals(expResult, result);
    }

    /**
     * Test of printUsers method, of class ManageUsersView.
     */
    @Test
    public void testPrintUsers() {
        System.out.println("printUsers");
        ManageUsersView instance = new ManageUsersView();
        ArrayList<User> expResult = null;
        ArrayList<User> result = instance.printUsers();
        assertEquals(expResult, result);
    }

    /**
     * Test of logoutUser method, of class ManageUsersView.
     */
    @Test
    public void testLogoutUser() {
        System.out.println("logoutUser");
        String login = "";
        ManageUsersView instance = new ManageUsersView();
        boolean expResult = false;
        boolean result = instance.logoutUser(login);
        assertEquals(expResult, result);
    }
    
}
