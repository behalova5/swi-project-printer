/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boundary;

import entities.RegForm;
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
public class RegFormFacadeTest {
    
    public RegFormFacadeTest() {
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
     * Test of create method, of class RegFormFacade.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        RegForm entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RegFormFacade instance = (RegFormFacade)container.getContext().lookup("java:global/classes/RegFormFacade");
        instance.create(entity);
        container.close();
    }

    /**
     * Test of edit method, of class RegFormFacade.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        RegForm entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RegFormFacade instance = (RegFormFacade)container.getContext().lookup("java:global/classes/RegFormFacade");
        instance.edit(entity);
        container.close();
    }

    /**
     * Test of remove method, of class RegFormFacade.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        RegForm entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RegFormFacade instance = (RegFormFacade)container.getContext().lookup("java:global/classes/RegFormFacade");
        instance.remove(entity);
        container.close();
    }

    /**
     * Test of find method, of class RegFormFacade.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Object id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RegFormFacade instance = (RegFormFacade)container.getContext().lookup("java:global/classes/RegFormFacade");
        RegForm expResult = null;
        RegForm result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
    }

    /**
     * Test of findAll method, of class RegFormFacade.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RegFormFacade instance = (RegFormFacade)container.getContext().lookup("java:global/classes/RegFormFacade");
        List<RegForm> expResult = null;
        List<RegForm> result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
    }

    /**
     * Test of findRange method, of class RegFormFacade.
     */
    @Test
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RegFormFacade instance = (RegFormFacade)container.getContext().lookup("java:global/classes/RegFormFacade");
        List<RegForm> expResult = null;
        List<RegForm> result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
    }

    /**
     * Test of count method, of class RegFormFacade.
     */
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RegFormFacade instance = (RegFormFacade)container.getContext().lookup("java:global/classes/RegFormFacade");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
    }

    /**
     * Test of getRegFrom method, of class RegFormFacade.
     */
    @Test
    public void testGetRegFrom() throws Exception {
        System.out.println("getRegFrom");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RegFormFacade instance = (RegFormFacade)container.getContext().lookup("java:global/classes/RegFormFacade");
        RegForm expResult = null;
        RegForm result = instance.getRegFrom();
        assertEquals(expResult, result);
        container.close();
    }
    
}
