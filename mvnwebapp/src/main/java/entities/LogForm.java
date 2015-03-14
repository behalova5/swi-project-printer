package entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author E589510
 */
@Entity
public class LogForm implements Serializable
{
    @Id
    private Long id;
    private static final long serialVersionUID = 1L;
    private String login;
    private String pass;

    public String getLogin()
    {
            return login;
    }

    public void setLogin(String login)
    {
            this.login = login;
    }

    public String getPass()
    {
            return pass;
    }

    public void setPass(String pass)
    {
            this.pass = pass;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.login);
        hash = 89 * hash + Objects.hashCode(this.pass);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LogForm other = (LogForm) obj;
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.pass, other.pass)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LogForm{" + "login=" + login + ", pass=" + pass + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


	
}
