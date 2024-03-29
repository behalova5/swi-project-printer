package db.facades;

import db.abstr.facades.AbstractFacade;
import db.entities.User;
import global.types.*;
import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


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
    public User getUserByLogin(Login login)
    {
       try {
           User user= (User) em.createQuery("SELECT * FROM Model u WHERE u.login.login = :login")
                    .setParameter("login", login.getLogin())
                    .getSingleResult();
           System.out.println(user.getName());
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public User getUserByLoginAndPassword(Login login, Password password)
    {
       try {
            return (User) em.createQuery("SELECT * FROM USERS u WHERE u.login.login = :login AND u.passHash.password = :password")
                    .setParameter(":login", login.getLogin())
                    .setParameter(":password", password.getPassword())
                    .getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    
    @Override
    public boolean existsUser(Login login) {
        //getMaxResults returns LIMIT clause from sql, it doesnt execute query
        int prom;
        prom = em.createQuery("SELECT u FROM user u WHERE u.login.login = :login", User.class).setParameter("login", login.getLogin()).getMaxResults();
        return prom != 0;
    }

}
