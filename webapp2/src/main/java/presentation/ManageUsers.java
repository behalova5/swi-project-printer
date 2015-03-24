package presentation;

import boundary.UserFacade;
import managebeans.LogForm;
import managebeans.RegForm;
import entities.User;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="ManageUsers")
@SessionScoped
public class ManageUsers
{
    @EJB
    private UserFacade userFacade;
    
    
    public ManageUsers(){

    }
    
    public UserFacade getUserFacade() {
        return userFacade;
    }

    public void setUserFacade(UserFacade userFacade) {
        this.userFacade = userFacade;
    }


    public boolean loginUser(LogForm user)
    {
        if(userFacade.existsUser(user)){
            //create statefull bean
            return true;
        }
        return false;  
    }
    public boolean createUser(RegForm newUser)
    {
        return userFacade.insertUser(newUser) ? true : false;
    }
    public ArrayList<User> printUsers()
    {
        return userFacade.getAllUsers();
    }
    public boolean logoutUser(String login)
    {
        return false;
    }
  
}
