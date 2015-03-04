package presentation;

import boundary.PrihlasovaciFormularFacade;
import entities.PrihlasovaciFormular;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author E589510
 */
@ManagedBean(name = "PrihlasovaciFormularView")
@RequestScoped
public class PrihlasovaciFormularView
{
	@EJB
	private PrihlasovaciFormularFacade prihlasovaciFormularFacade;

	private PrihlasovaciFormular prihlasovaciFormular;

	/**
	 * Creates a new instance of PrihlasovaciFormularView
	 */
	public PrihlasovaciFormularView()
	{
		
	}
	
    public PrihlasovaciFormular getPrihlasovaciFormular()
	{
       return prihlasovaciFormular;
    }
	
	public void vypisFormular()
	{
		
	}
	
	public void odesliFormular()
	{
		
	}
	
	public void vypisChyboveHlaseni()
	{
		
	}
}
