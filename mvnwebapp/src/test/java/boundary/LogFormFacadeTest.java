/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boundary;

import entities.LogForm;
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
public class LogFormFacadeTest {
    
    public LogFormFacadeTest() {
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
     * Test of create method, of class LogFormFacade.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        LogForm entity = new LogForm();
        entity.setLogin("testLogin");
        entity.setPass("testPass");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LogFormFacade instance = (LogFormFacade)container.getContext().lookup("java:global/classes/LogFormFacade");
        instance.create(entity);
        assertEquals(entity, instance.getLogForm());
        container.close();
    }

    /**
     * Test of edit method, of class LogFormFacade.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        LogForm entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LogFormFacade instance = (LogFormFacade)container.getContext().lookup("java:global/classes/LogFormFacade");
        instance.edit(entity);
        container.close();
    }

    /**
     * Test of remove method, of class LogFormFacade.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        LogForm entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LogFormFacade instance = (LogFormFacade)container.getContext().lookup("java:global/classes/LogFormFacade");
        instance.remove(entity);
        container.close();
    }

    /**
     * Test of find method, of class LogFormFacade.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Object id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LogFormFacade instance = (LogFormFacade)container.getContext().lookup("java:global/classes/LogFormFacade");
        LogForm expResult = null;
        LogForm result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
    }

    /**
     * Test of findAll method, of class LogFormFacade.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LogFormFacade instance = (LogFormFacade)container.getContext().lookup("java:global/classes/LogFormFacade");
        List<LogForm> expResult = null;
        List<LogForm> result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
    }

    /**
     * Test of findRange method, of class LogFormFacade.
     */
    @Test
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LogFormFacade instance = (LogFormFacade)container.getContext().lookup("java:global/classes/LogFormFacade");
        List<LogForm> expResult = null;
        List<LogForm> result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
    }

    /**
     * Test of count method, of class LogFormFacade.
     */
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LogFormFacade instance = (LogFormFacade)container.getContext().lookup("java:global/classes/LogFormFacade");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
    }

    /**
     * Test of getLogForm method, of class LogFormFacade.
     */
    @Test
    public void testGetLogForm() throws Exception {
        System.out.println("getLogForm");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LogFormFacade instance = (LogFormFacade)container.getContext().lookup("java:global/classes/LogFormFacade");
        LogForm expResult = null;
        LogForm result = instance.getLogForm();
        assertEquals(expResult, result);
        container.close();
    }
    
}
