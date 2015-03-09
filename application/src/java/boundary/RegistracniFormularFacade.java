package boundary;

import entities.RegistracniFormular;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author E589510
 */
@Stateless
public class RegistracniFormularFacade extends AbstractFacade<RegistracniFormular>
{
	@PersistenceContext(unitName = "swi-project-printerPU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager()
	{
		return em;
	}

	public RegistracniFormularFacade()
	{
		super(RegistracniFormular.class);
	}
	
}
