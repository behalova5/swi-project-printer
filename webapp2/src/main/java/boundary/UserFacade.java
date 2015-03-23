package boundary;

import managebeans.LogForm;
import managebeans.RegForm;
import entities.User;
import java.util.ArrayList;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
        Query query = em.createQuery("SELECT u FROM User u");
        return (ArrayList<User>) query.getResultList();
    }
    public User getUserByLogin(String login)
    {
        //TODO, now returning user with id 1
        return em.find(User.class, 1);
    }
    public boolean insertUser(RegForm newUser)
    {
        User u = new User();
        u.setLogin(newUser.getLogin());
        u.setPassHash(newUser.getPass());
        u.setEmail(newUser.getEmail());
        u.setRole(newUser.getRole());
        u.setSurname(newUser.getSurname());
        u.setName(newUser.getName());
        if(!getAllUsers().contains(u)){
            em.persist(u);
            return true;
        }
        return false;
    }
    public boolean changeRole(User user, int role)
    {
        return false;
    }
    
    public boolean existsUser(LogForm user) {
        User u = new User();
        u.setLogin(user.getLogin());
        return getAllUsers().contains(u);
    }
        
	
}
