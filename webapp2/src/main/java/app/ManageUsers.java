package app;

import db.entities.User;
import db.facades.IUserFacade;
import global.types.Login;
import global.types.Password;
import global.types.Role;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ManageUsers{
    @EJB
    private IUserFacade userFacade;
    
 
    public ManageUsers(){

    }
    
    public void setUserFacade(IUserFacade facade){
       userFacade=facade;
    }

    
    public boolean createUser(User user){
       try {
            userFacade.create(user);
        } catch (Exception e){
            return false;
        }
        return true;
    }


    public List<User> getUsers(){
        return userFacade.findAll();
    }
    
    public Role loginUser(Login login, Password pwd){
        User user = userFacade.getUserByLogin(login);
        
        if(user!=null){
            return user.getRole();
        }
        return null;
    }
   
    
}
