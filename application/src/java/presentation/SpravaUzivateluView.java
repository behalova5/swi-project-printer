package presentation;

import boundary.SpravaUzivateluFacade;
import entities.SpravaUzivatelu;
import entities.Uzivatel;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author E589510
 */
@ManagedBean
@SessionScoped
public class SpravaUzivateluView
{
	@EJB
	private SpravaUzivateluFacade spravaUzivateluFacade;
    
    private SpravaUzivatelu spravaUzivatelu;
	
	/**
	 * Creates a new instance of SpravaUzivateluView
	 */
	public SpravaUzivateluView()
	{
	}
	
    public SpravaUzivatelu getSpravaUzivatelu()
	{
       return spravaUzivatelu;
    }
	
	public Boolean prihlaseniUzivatele(String login, String heslo)
	{
		return true;
	}
	
	public ArrayList<Uzivatel> vypisUzivatelu()
	{
		return spravaUzivatelu.getSeznamUzivatelu();
	}
	
	public Integer vytvoritUzivatele(String login, String heslo, String email, String jmeno, String prijmeni, Integer opravneni)
	{
		Uzivatel novyUzivatel = new Uzivatel();
		novyUzivatel.setLogin(login);
		novyUzivatel.setHesloHash(heslo);
		novyUzivatel.setEmail(email);
		novyUzivatel.setJmeno(jmeno);
		novyUzivatel.setPrijmeni(prijmeni);
		novyUzivatel.setOpravneni(opravneni);
		return 1;
	}
	
	public Boolean odhlaseniUzivatele(Integer id)
	{
		return true;
	}
}
