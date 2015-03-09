package presentation;

import boundary.UzivatelFacade;
import entities.Uzivatel;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author E589510
 */
@ManagedBean
@RequestScoped
public class UzivatelView
{

	@EJB
	private UzivatelFacade uzivatelFacade;

	private Uzivatel uzivatel;

	/**
	 * Creates a new instance of UzivatelView
	 */
	public UzivatelView()
	{

	}

	public Uzivatel getUzivatel()
	{
		return uzivatel;
	}

	public String vypisUzivatele()
	{
		return uzivatel.toString();
	}

	public Boolean zmenNaAdmina()
	{
		uzivatel.setOpravneni(Uzivatel.ADMIN);
		uzivatelFacade.edit(uzivatel);
		uzivatel.setOpravneni(Uzivatel.ADMIN);
		if (uzivatel.getOpravneni() == Uzivatel.ADMIN)
			return true;
		else
			return false;
	}

	public Boolean zmenNaUzivatele()
	{
		uzivatel.setOpravneni(Uzivatel.UZIVATEL);
		uzivatelFacade.edit(uzivatel);
		if (uzivatel.getOpravneni() == Uzivatel.UZIVATEL)
			return true;
		else
			return false;
	}
}
