package presentation;

import boundary.RegistracniFormularFacade;
import entities.RegistracniFormular;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author E589510
 */
@ManagedBean(name = "RegistracniFormularView")
@RequestScoped
public class RegistracniFormularView
{
	@EJB
	private RegistracniFormularFacade registracniFormularFacade;

    private RegistracniFormular registracniFormular;
	
	/**
	 * Creates a new instance of RegistracniFormularView
	 */
	public RegistracniFormularView()
	{
		
	}
	
    public RegistracniFormular getRegistracniFormular()
	{
       return registracniFormular;
    }
	
	public Boolean zvalidujFormular()
	{
		return true;
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
