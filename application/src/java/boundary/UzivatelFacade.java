package boundary;

import entities.Uzivatel;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author E589510
 */
@Stateless
public class UzivatelFacade extends AbstractFacade<Uzivatel>
{
	@PersistenceContext(unitName = "swi-project-printerPU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager()
	{
		return em;
	}

	public UzivatelFacade()
	{
		super(Uzivatel.class);
	}
	
}
