/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.managebeans;

import global.types.Role;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import view.states.ILoginState;
import view.states.LoginState;


@ManagedBean(name="index")
@SessionScoped
public class Index implements Serializable {

    @ManagedProperty(value="#{RegForm}")
    private RegForm regForm;
    
    @ManagedProperty(value="#{LogForm}")
    private LogForm logForm;

    
    private static final long serialVersionUID = 1L;
    private global.types.Email email;
    
    private String message;
    
    public Index() {
    }
    
    public Role getRole(){
     Role role = logForm.getRole();
     return logForm.getRole();
    }
    
    public LogForm getLogForm() {
        return logForm;
    }

    public void setLogForm(LogForm logForm) {
        this.logForm = logForm;
    }
    

    public RegForm getRegForm() {
        return regForm;
    }
    
    public void setRegForm(RegForm regForm){
        this.regForm = regForm;
    }

    public String getEmail() {
            return regForm.getEmail();
    }

    public String getMessage() {
        if (message == null || message.equals("")) {
            message = regForm.getMessage();
        } else {
            message = "Tohle mainpage";
        }
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
   

 
    
}
