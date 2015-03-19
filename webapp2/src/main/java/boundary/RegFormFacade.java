package boundary;

import managebeans.RegForm;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author E589510
 */
@Stateless
public class RegFormFacade extends AbstractFacade<RegForm>
{
    @PersistenceContext(unitName = "swi-project-printerPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager()
    {
            return em;
    }

    public RegFormFacade()
    {
            super(RegForm.class);
    }

    public RegForm getRegFrom()
    {
        return null;
    }
	
}
