package view.managebeans;

import db.entities.User;
import global.types.Email;
import global.types.Login;
import global.types.Name;
import global.types.Password;
import global.types.Role;
import global.types.Surname;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import view.facades.RegFormFacade;

@ManagedBean(name="RegForm")
@SessionScoped


public class RegForm implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String email;
    private String login;
    private String pass;
    private String name;
    private String surname;
    private String role;
    private String message;
    
    @EJB
    private view.facades.RegFormFacade facade;
    

    public RegForm() {
        
    }
    
    
    public String sendForm(){
        if(createUser()){
           message = "Uživatel " + getLogin() + " zaregistrován." ;
           return "index";
        } else {
           message = "Uživatel " + getLogin() + " je již zaregistrován." ;
           return "regform";
        }
    }

   
    @Override
    public String toString() {
        return "RegForm{" + "email=" + email + ", login=" + login + ", pass=" + pass + ", name=" + name + ", surname=" + surname + ", role=" + role + '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
            return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
            return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public RegFormFacade getFacade() {
        return facade;
    }

    public void setFacade(RegFormFacade facade) {
        this.facade = facade;
    }
    
    public Role[] getRolesValue(){
        return Role.values();
    }
   
    public boolean createUser(){
        User user = new User();
        user.setEmail(new Email(email));
        user.setLogin(new Login(login));
        user.setName(new Name(name));
        user.setPassHash(new Password(pass));
        user.setRole(Role.valueOf(role));
        user.setSurname(new Surname(surname));
        return getFacade().createUser(user);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
	
    
}
