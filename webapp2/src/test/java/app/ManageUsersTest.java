/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

import global.types.*;
import app.ManageUsers;
import db.entities.User;
import db.facades.IUserFacade;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import view.managebeans.LogForm;
import view.managebeans.RegForm;

/**
 *
 * @author okalman
 */
public class ManageUsersTest {
    
    IUserFacade facade;
    ManageUsers manager;
    LogForm logForm;
    RegForm regForm;
    @Before
    public void setUp() {
        facade = new IUserFacade() {
            User user= new User();
            ArrayList<User>list = new ArrayList<User>();
            
            void IUserFacade(){
                user.setEmail(new Email("neco@neco.com"));
                user.setId(Integer.SIZE);
                user.setLogin(new Login("User"));
                user.setPassHash(new Password("user"));
                user.setRole(Role.ADMIN);
                user.setName(new Name("Jmeno"));
                user.setSurname(new Surname("Prijmeni"));
            }
        
            @Override
            public boolean existsUser(Login login) {
                return user.getLogin().equals(login);
            }

            @Override
            public User getUserByLogin(String login) {
                
                
                if(user.getLogin().equals(login)){
                    return user;
                }else{
                    return null;
                }
            }

            @Override
            public int count() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void create(User entity) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void edit(User entity) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public User find(Object id) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public List<User> findAll() {
                list.add(user)  ;
                return list  ;
            }

            @Override
            public List<User> findRange(int[] range) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void remove(User entity) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
         manager = new ManageUsers();
         //manager.setUserFacade(facade);
         
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of loginUser method, of class ManageUsersView.
     */
    @Test
    public void testLoginExistingUser() {
        logForm= new LogForm();
        logForm.setLogin("User");
        logForm.setPass("user");
        //assertTrue("Login for existing user failed: ", manager.loginUser(logForm));       
    }
    
    @Test
    public void testLoginNonExistingUser() {
        logForm= new LogForm();
        logForm.setLogin("nekdo");
        logForm.setPass("user");
        //assertFalse("Login for non-existing user failed: ", manager.loginUser(logForm));       
    }
    
    @Test
    public void createNullUserTest(){
        try{
           //assertFalse("Vytvoreni uzivatele NULL neselhalo",manager.createUser(null));
        }catch(Exception e){
            // ok vyjimka je taky akceptovatelna
        }
        
        
    }
    
    @Test
    public void createValidUserTest(){
       /* regForm = new RegForm();
        regForm.setEmail("neco@neco.com");
       // regForm.setId(new Long(2));
        regForm.setLogin("User2");
        regForm.setPass("ahoj");
        regForm.setRole(1);
        regForm.setName("Jmeno");
        regForm.setSurname("Prijmeni");;
        
        try{
           //assertTrue("Vytvoreni validniho uzivatele selhalo",manager.createUser(regForm));
        }catch(Exception e){
            // ok vyjimka je taky akceptovatelna
        }  */             
    }
    @Test
    public void createInvalidUserTest(){
       /* regForm = new RegForm();
        regForm.setEmail("neco@neco.com");
        regForm.setRole(1);
        regForm.setName("Jmeno");
        regForm.setSurname("Prijmeni");;
        
        try{
           //assertTrue("Vytvoreni nevalidniho uzivatele neselhalo",manager.createUser(regForm));
        }catch(Exception e){
            // ok vyjimka je taky akceptovatelna
        }  */             
    }
    
    @Test
    public void printUsersTest(){
        //assertEquals("List is empty", 1, manager.printUsers().size());
        
        
        
    }
    

   
}
