package view.managebeans;

import java.io.Serializable;
import java.util.Objects;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

@ManagedBean(name="LogForm")
@RequestScoped

public class LogForm implements Serializable{
  
    private static final long serialVersionUID = 1L;
    private String login;
    private String pass;
    
    public String sendForm() {
          return "index";       
    }
    
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


	
}
