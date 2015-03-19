/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boundary;

import entities.LogForm;
import entities.RegForm;
import entities.User;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
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
public class UserFacadeTest {
    
    public UserFacadeTest() {
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
     * Test of create method, of class UserFacade.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        User entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserFacade instance = (UserFacade)container.getContext().lookup("java:global/classes/UserFacade");
        instance.create(entity);
        container.close();
    }

    /**
     * Test of edit method, of class UserFacade.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        User entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserFacade instance = (UserFacade)container.getContext().lookup("java:global/classes/UserFacade");
        instance.edit(entity);
        container.close();
    }

    /**
     * Test of remove method, of class UserFacade.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        User entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserFacade instance = (UserFacade)container.getContext().lookup("java:global/classes/UserFacade");
        instance.remove(entity);
        container.close();
    }

    /**
     * Test of find method, of class UserFacade.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Object id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserFacade instance = (UserFacade)container.getContext().lookup("java:global/classes/UserFacade");
        User expResult = null;
        User result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
    }

    /**
     * Test of findAll method, of class UserFacade.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserFacade instance = (UserFacade)container.getContext().lookup("java:global/classes/UserFacade");
        List<User> expResult = null;
        List<User> result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
    }

    /**
     * Test of findRange method, of class UserFacade.
     */
    @Test
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserFacade instance = (UserFacade)container.getContext().lookup("java:global/classes/UserFacade");
        List<User> expResult = null;
        List<User> result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
    }

    /**
     * Test of count method, of class UserFacade.
     */
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserFacade instance = (UserFacade)container.getContext().lookup("java:global/classes/UserFacade");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
    }

    /**
     * Test of getAllUsers method, of class UserFacade.
     */
    @Test
    public void testGetAllUsers() throws Exception {
        System.out.println("getAllUsers");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserFacade instance = (UserFacade)container.getContext().lookup("java:global/classes/UserFacade");
        ArrayList<User> expResult = null;
        ArrayList<User> result = instance.getAllUsers();
        assertEquals(expResult, result);
        container.close();
    }

    /**
     * Test of getUserByLogin method, of class UserFacade.
     */
    @Test
    public void testGetUserByLogin() throws Exception {
        System.out.println("getUserByLogin");
        String login = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserFacade instance = (UserFacade)container.getContext().lookup("java:global/classes/UserFacade");
        User expResult = null;
        User result = instance.getUserByLogin(login);
        assertEquals(expResult, result);
        container.close();
    }

    /**
     * Test of insertUser method, of class UserFacade.
     */
    @Test
    public void testInsertUser() throws Exception {
        System.out.println("insertUser");
        RegForm newUser = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserFacade instance = (UserFacade)container.getContext().lookup("java:global/classes/UserFacade");
        boolean expResult = false;
        boolean result = instance.insertUser(newUser);
        assertEquals(expResult, result);
        container.close();
    }

    /**
     * Test of changeRole method, of class UserFacade.
     */
    @Test
    public void testChangeRole() throws Exception {
        System.out.println("changeRole");
        User user = null;
        int role = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserFacade instance = (UserFacade)container.getContext().lookup("java:global/classes/UserFacade");
        boolean expResult = false;
        boolean result = instance.changeRole(user, role);
        assertEquals(expResult, result);
        container.close();
    }

    /**
     * Test of existsUser method, of class UserFacade.
     */
    @Test
    public void testExistsUser() throws Exception {
        System.out.println("existsUser");
        LogForm user = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        UserFacade instance = (UserFacade)container.getContext().lookup("java:global/classes/UserFacade");
        boolean expResult = false;
        boolean result = instance.existsUser(user);
        assertEquals(expResult, result);
        container.close();
    }
    
}
