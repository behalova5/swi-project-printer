package view.facades;

import app.ManageUsers;
import db.entities.User;
import javax.ejb.EJB;
import view.managebeans.RegForm;
import javax.ejb.Stateless;

@Stateless
public class RegFormFacade{ 
    
    @EJB    
    public ManageUsers manageUsers;
    
    
    public RegFormFacade(){
     
    }

    public RegForm getRegFrom()
    {
        return null;
    }
    
    public boolean createUser(User user){
        return manageUsers.createUser(user);
    }

    public ManageUsers getManageUsers() {
        return manageUsers;
    }
	
}
