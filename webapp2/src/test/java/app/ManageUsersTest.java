/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

import global.types.*;
import db.entities.User;
import db.facades.IUserFacade;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author okalman
 */
public class ManageUsersTest {
    
    IUserFacade facade;
    ManageUsers manager;
    @Before
    public void setUp() {
        
         User user= new User();
         user.setEmail(new Email("neco@neco.com"));
         user.setId(Integer.SIZE);
         user.setLogin(new Login("User"));
         user.setPassHash(new Password("user"));
         user.setRole(Role.ADMIN);
         user.setName(new Name("Jmeno"));
         user.setSurname(new Surname("Prijmeni"));
         ArrayList<User>list = new ArrayList<User>();
         list.add(user);
         final User fUser=user;
         final ArrayList<User>fList=list;
        facade = new IUserFacade() {
          
            
            void IUserFacade(){
               
            }
        
            @Override
            public boolean existsUser(Login login) {
                return fUser.getLogin().equals(login);
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
                
                return fList  ;
            }

            @Override
            public List<User> findRange(int[] range) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void remove(User entity) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public User getUserByLoginAndPassword(Login login, Password password) {
               if(fUser.getLogin().toString().equals(login.toString()) && fUser.getPassHash().toString().equals(password.toString())){
                   return fUser;
               }else{
                   return null;
               }
            }
        };
         manager = new ManageUsers();
         manager.setUserFacade(facade);
         
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of loginUser method, of class ManageUsersView.
     */
    @Test
    public void testLoginExistingUser() {
       Login login = new Login("User");
       Password pwd = new Password("user");
        
        assertTrue("Login for existing user failed: ", manager.loginUser(login, pwd));       
    }
    
    @Test
    public void testLoginNonExistingUser() {
        Login login = new Login("Userg");
       Password pwd = new Password("user");
     
        assertFalse("Login for non-existing user failed: ", manager.loginUser(login, pwd));       
    }
    @Test
    public void testLoginWrongPassword() {
        Login login = new Login("User");
        Password pwd = new Password("userr");
     
        assertFalse("Login for non-existing user failed: ", manager.loginUser(login, pwd));       
    }
    
    @Test
    public void createNullUserTest(){
        try{
           assertFalse("Vytvoreni uzivatele NULL neselhalo",manager.createUser(null));
        }catch(Exception e){
            // ok vyjimka je taky akceptovatelna
        }
        
        
    }
    
    @Test
    public void createValidUserTest(){
        User user= new User();
        user.setEmail(new Email("neco@neco.com"));
        user.setId(Integer.SIZE);
        user.setLogin(new Login("User"));
        user.setPassHash(new Password("user"));
        user.setRole(Role.ADMIN);
        user.setName(new Name("Jmeno"));
        user.setSurname(new Surname("Prijmeni"));
        
        try{
           assertTrue("Vytvoreni validniho uzivatele selhalo",manager.createUser(user));
        }catch(Exception e){
            // ok vyjimka je taky akceptovatelna
        }              
    }
    @Test
    public void createInvalidUserTest(){
        User user= new User();
        user.setEmail(new Email("neconeco.com"));
        user.setId(Integer.SIZE);
        user.setLogin(new Login("User"));
        user.setPassHash(new Password("user"));
        user.setRole(Role.ADMIN);
        user.setName(new Name("Jmeno"));
        user.setSurname(new Surname("Prijmeni"));
        
        try{
           assertTrue("Vytvoreni nevalidniho uzivatele neselhalo",manager.createUser(user));
        }catch(Exception e){
            // ok vyjimka je taky akceptovatelna
        }              
    }
    
    @Test
    public void printUsersTest(){
        assertEquals("List is empty", 1, manager.getUsers().size());
        
        
        
    }
    

   
}
