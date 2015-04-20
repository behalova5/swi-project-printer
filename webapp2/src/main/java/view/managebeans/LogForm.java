package view.managebeans;

import global.types.Login;
import global.types.Password;
import global.types.Role;
import java.io.Serializable;
import java.util.Objects;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import view.facades.LogFormFacade;
import view.states.ILoginState;
import view.states.LoginState;

@ManagedBean(name="LogForm")
@RequestScoped

public class LogForm implements Serializable{
    
    @EJB
    ILoginState loginState;
    
    @EJB
    LogFormFacade facade;
  
    private static final long serialVersionUID = 1L;
    private Login login;
    private Password pass;
    private String message;
    
    public Role getRole(){
        return loginState.getRole();
    } 
    
    public LogForm(){
        this.login = new Login();
        this.pass = new Password();
        this.message = "";
        
    }
    
    public String sendForm() 
{
        Role role=facade.loginUser(login, pass);
        if(role !=null){
           message = "Uživatel " + getLogin() + " přihlášen.";
           loginState.setLogin(login);
           loginState.setRole(role);
            return "index";    
        }else{
            throw new RuntimeException("invalid login or password");
        }
         
            
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
