/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.facades;

import app.ManageUsers;
import db.entities.User;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ManageUsersFacade {
    
    @EJB    
    public ManageUsers manageUsers;

    public List<User> getUsers(){
        return manageUsers.getUsers();
    }
    
}
