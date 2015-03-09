package boundary;

import entities.SpravaUzivatelu;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author E589510
 */
@Stateless
public class SpravaUzivateluFacade extends AbstractFacade<SpravaUzivatelu>
{
	@PersistenceContext(unitName = "swi-project-printerPU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager()
	{
		return em;
	}

	public SpravaUzivateluFacade()
	{
		super(SpravaUzivatelu.class);
	}
	
}
