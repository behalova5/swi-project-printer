package boundary;

import entities.LogForm;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author E589510
 */
@Stateless
public class LogFormFacade extends AbstractFacade<LogForm>
{
    @PersistenceContext(unitName = "swi-project-printerPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager()
    {
            return em;
    }

    public LogFormFacade()
    {
        super(LogForm.class);
    }

    public LogForm getLogForm()
    {
        return null;
    }
	
}
