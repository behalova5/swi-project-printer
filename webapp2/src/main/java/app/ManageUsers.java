package app;

import db.entities.User;
import db.facades.IUserFacade;
import db.facades.UserFacade;
import global.types.Login;
import global.types.Password;
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
        //delete comment after successfull existsUser method
        /*if(!userFacade.existsUser(user.getLogin())){
           userFacade.create(user); 
           return true;
        }*/
        try {
            userFacade.create(user);
            return  true;
        }
        catch (Exception e){
            return false;
        }
    }


    public List<User> getUsers(){
        return userFacade.findAll();
    }
    
    public boolean loginUser(Login login, Password pwd){
        if(userFacade.getUserByLoginAndPassword(login, pwd)!=null){
            return true;
        }
        return false;
    }
   
    
}
