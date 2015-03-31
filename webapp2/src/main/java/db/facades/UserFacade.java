package db.facades;

import db.abstr.facades.AbstractFacade;
import db.entities.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author E589510
 */
@Stateless
public class UserFacade extends AbstractFacade<User> implements IUserFacade
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
    
    @Override
    public User getUserByLogin(String login)
    {
        try {
            return (User) em.createQuery("SELECT * FROM user WHERE login = :login")
                    .setParameter(":login", login)
                    .getSingleResult();
        } catch (Exception e) {
            return null;
        }  
    }
    
    @Override
    public boolean existsUser(String login) {
        
        int prom = em.createQuery("SELECT * FROM user WHERE id = :id").setParameter(":id", login).getMaxResults();
        return prom != 0;
    }
        
	
}
