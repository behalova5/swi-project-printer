package view.facades;

import db.abstr.facades.AbstractFacade;
import view.managebeans.RegForm;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author E589510
 */
@Stateless
public class RegFormFacade{ 

    public RegFormFacade()
    {
           
    }

    public RegForm getRegFrom()
    {
        return null;
    }
	
}
