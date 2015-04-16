package view.managebeans;

import global.types.Login;
import global.types.Password;
import java.io.Serializable;
import java.util.Objects;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="LogForm")
@RequestScoped

public class LogForm implements Serializable{
  
    private static final long serialVersionUID = 1L;
    private Login login;
    private Password pass;
    private String message;
    
    public LogForm(){
        this.login = new Login();
        this.pass = new Password();
        this.message = "";
        
    }
    
    public String sendForm() {
          message = "Uživatel " + getLogin() + " přihlášen.";
          return "index";       
    }
    
    public String getLogin()
    {
            return login.getLogin();
    }

    public void setLogin(String login)
    {
            this.login = new Login(login);
    }

    public String getPass()
    {
            return this.pass.getPassword();
    }

    public void setPass(String pass)
    {
            this.pass = new Password(pass);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.login.getLogin());
        hash = 89 * hash + Objects.hashCode(this.pass.getPassword());
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
        if (!Objects.equals(this.login.getLogin(), other.login.getLogin())) {
            return false;
        }
        if (!Objects.equals(this.pass.getPassword(), other.pass.getPassword())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LogForm{" + "login=" + login.toString() + ", pass=" + pass.toString() + '}';
    }


	
}
