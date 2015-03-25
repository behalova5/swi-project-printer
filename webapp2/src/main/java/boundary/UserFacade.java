package boundary;

import entities.User;
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
    
    public User getUserByLogin(String login)
    {
        return (User) em.createQuery("SELECT * FROM User u WHERE login=:userLogin")
                .setParameter("userLogin", login)
                .getSingleResult();
    }
    
    public boolean existsUser(User user) {
        return findAll().contains(user);
    }
        
	
}
