package view.facades;

import app.ManageUsers;
import global.types.Login;
import global.types.Password;
import global.types.Role;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import view.managebeans.LogForm;

/**
 *
 * @author E589510
 */
@Stateless
public class LogFormFacade {
    
    @EJB
    ManageUsers manageUsers;

    public LogFormFacade()
    {
        
    }

    public LogForm getLogForm()
    {
        return null;
    }
    
    public Role loginUser(Login login, Password password){
        return manageUsers.loginUser(login, password);
    }
	
}
