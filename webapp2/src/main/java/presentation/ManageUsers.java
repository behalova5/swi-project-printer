package presentation;

import boundary.IUserFacade;
import boundary.UserFacade;
import entities.User;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import managebeans.LogForm;
import managebeans.RegForm;

@ManagedBean(name="ManageUsers")
@SessionScoped
public class ManageUsers
{
    @EJB
    private IUserFacade userFacade;
    
    
    public ManageUsers(){

    }
    
    public IUserFacade getUserFacade() {
        return userFacade;
    }

    public void setUserFacade(IUserFacade userFacade) {
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
