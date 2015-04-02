package app;

import db.entities.User;
import db.facades.UserFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ManageUsers{
    @EJB
    private UserFacade userFacade;
 
    public ManageUsers(){

    }
    
    public boolean createUser(User user){
        //delete comment after successfull existsUser method
        /*if(!userFacade.existsUser(user.getLogin())){
           userFacade.create(user); 
           return true;
        }*/
        userFacade.create(user);
        return true;
    }


    public List<User> getUsers(){
        return userFacade.findAll();
    }
   
    
}
