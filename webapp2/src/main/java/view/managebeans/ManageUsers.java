/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.managebeans;

import db.entities.User;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import view.facades.ManageUsersFacade;


@ManagedBean(name="manageUsers")
@SessionScoped
public class ManageUsers implements Serializable {

    
    @EJB
    private ManageUsersFacade manageUsersFacade;
    
    public ManageUsers() {
        
    }

    
    //@PostConstruct
    public List<User> getAllUsers(){
       return manageUsersFacade.getUsers();
    }
    
}
