/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.managebeans;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;


@ManagedBean(name="index")
@SessionScoped
public class Index implements Serializable {

    @ManagedProperty(value="#{RegForm}")
    private RegForm regForm;
    

    
    private static final long serialVersionUID = 1L;
    private global.types.Email email;
    
    private String message;
    
    public Index() {
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
