package db.facades;

import db.abstr.facades.AbstractFacade;
import db.entities.Model;
import db.entities.User;
import global.types.*;
import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class ModelFacade extends AbstractFacade<Model> implements IModelFacade 
{
    @PersistenceContext(unitName = "swi-project-printerPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager()
    {
            return em;
    }

    public ModelFacade()
    {
            super(Model.class);
    }
    
        
    @Override
    public Model getModelById(int IDmodel)
    {
       try {
           Model model = (Model) em.createQuery("SELECT * FROM Model m WHERE m.IDmodel = :IDmodel")
                    .setParameter("IDmodel", IDmodel)
                    .getSingleResult();
            return model;
        } catch (Exception e) {
            return null;
        }
    }
    
    

    
    @Override
    public boolean existsModel(int IDmodel) {
        //getMaxResults returns LIMIT clause from sql, it doesnt execute query
        int prom;
        prom = em.createQuery("SELECT * FROM model m WHERE m.IDmodel = :IDmodel").setParameter("IDmodel", IDmodel).getMaxResults();
        return prom != 0;
    }

}
