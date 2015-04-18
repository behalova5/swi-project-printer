/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.states;

import global.types.Login;
import global.types.Role;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author okalman
 */
@Stateful
public class LoginState implements ILoginState{
    private Role role;
    private Login login;
    
    @PostConstruct
    private void creaete(){
     role=Role.GUEST;
    
    }



    @Override
    public Role getRole() {
        return role;
    }

    @Override
    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public Login getLogin() {
        return login;
    }

    @Override
    public void setLogin(Login login) {
        this.login = login;
    }
    
    
    
}
