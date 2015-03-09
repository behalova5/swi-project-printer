package entities;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author E589510
 */
@Entity
public class SpravaUzivatelu implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private ArrayList<Uzivatel> seznamUzivatelu;

	public ArrayList<Uzivatel> getSeznamUzivatelu()
	{
		return seznamUzivatelu;
	}

	public void setSeznamUzivatelu(ArrayList<Uzivatel> seznamUzivatelu)
	{
		this.seznamUzivatelu = seznamUzivatelu;
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	@Override
	public int hashCode()
	{
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object)
	{
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof SpravaUzivatelu))
		{
			return false;
		}
		SpravaUzivatelu other = (SpravaUzivatelu) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
		{
			return false;
		}
		return true;
	}

	@Override
	public String toString()
	{
		return "entities.SpravaUzivatelu[ id=" + id + " ]";
	}
	
}
