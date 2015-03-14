package boundary;

import entities.LogForm;
import entities.RegForm;
import entities.User;
import java.util.ArrayList;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author E589510
 */
@Stateless
public class UserFacade extends AbstractFacade<User>
{
    @PersistenceContext(unitName = "swi-project-printerPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager()
    {
            return em;
    }

    public UserFacade()
    {
            super(User.class);
    }
    public ArrayList<User> getAllUsers()
    {
        return null;
    }
    public User getUserByLogin(String login)
    {
        return null;
    }
    public boolean insertUser(RegForm newUser)
    {
        return false;
    }
    public boolean changeRole(User user, int role)
    {
        return false;
    }
    
    public boolean existsUser(LogForm user) {
        return false;
    }
        
	
}
