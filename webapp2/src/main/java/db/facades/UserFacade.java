package db.facades;

import global.types.*;
import db.abstr.facades.AbstractFacade;
import db.entities.User;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


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
    
    public User getUserByLogin(Login login)
    {
       try {
            return (User) em.createQuery("SELECT * FROM user WHERE login = :login")
                    .setParameter(":login", login)
                    .getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    
    //@Override
    public boolean existsUser(Login login) {
        //getMaxResults returns LIMIT clause from sql, it doesnt execute query
        int prom;
        prom = em.createQuery("SELECT u FROM User u WHERE u.login = :login", User.class).setParameter("login", login).getMaxResults();
        return prom != 0;
    }

    
    public boolean existsUser(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //@Override
    public User getUserByLogin(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
	
}
