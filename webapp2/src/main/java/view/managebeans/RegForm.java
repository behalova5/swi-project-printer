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
    private Email email;
    private Login login;
    private Password pass;
    private Name name;
    private Surname surname;
    private Role role;
    private String message;
    
    @EJB
    private view.facades.RegFormFacade facade;
    

    public RegForm() {
        this.email = new Email();
        this.login = new Login();
        this.pass = new Password();
        this.name = new Name();
        this.surname = new Surname();
        this.message = "";
        this.role = Role.ADMIN;
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
        return "RegForm{" + "email=" + email.toString() + ", login=" + login.toString() + ", pass=" + pass.toString() + ", name=" + name.toString() + ", surname=" + surname.toString() + ", role=" + role.toString() + '}';
    }

    public String getEmail() {
        return this.email.getEmail();
    }

    public void setEmail(String email) {
        this.email = new Email(email);
    }

    public String getLogin() {
            return this.login.getLogin();
    }

    public void setLogin(String login) {
        this.login = new Login(login);
    }

    public String getPass() {
            return this.pass.getPassword();
    }

    public void setPass(String pass) {
        this.pass = new Password(pass);
    }

    public String getName() {
        return this.name.getName();
    }

    public void setName(String name) {
        this.name = new Name(name);
    }

    public String getSurname() {
        return this.surname.getSurname();
    }

    public void setSurname(String surname) {
        this.surname = new Surname(surname);
    }

    public String getRole() {
        return this.role.getRole();
    }

    public void setRole(String role) {
        this.role = Role.valueOf(role);
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
        user.setEmail(this.email);
        user.setLogin(this.login);
        user.setName(this.name);
        user.setPassHash(this.pass);
        user.setRole(this.role);
        user.setSurname(this.surname);
        return getFacade().createUser(user);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
	
    
}
