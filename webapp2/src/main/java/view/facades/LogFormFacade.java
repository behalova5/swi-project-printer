package view.facades;

import db.abstr.facades.AbstractFacade;
import view.managebeans.LogForm;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author E589510
 */
@Stateless
public class LogFormFacade {


    public LogFormFacade()
    {
        
    }

    public LogForm getLogForm()
    {
        return null;
    }
	
}
