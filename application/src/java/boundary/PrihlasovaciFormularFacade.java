package boundary;

import entities.PrihlasovaciFormular;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author E589510
 */
@Stateless
public class PrihlasovaciFormularFacade extends AbstractFacade<PrihlasovaciFormular>
{
	@PersistenceContext(unitName = "swi-project-printerPU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager()
	{
		return em;
	}

	public PrihlasovaciFormularFacade()
	{
		super(PrihlasovaciFormular.class);
	}
	
}
