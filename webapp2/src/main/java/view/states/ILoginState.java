/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.states;

import global.types.Login;
import global.types.Role;
import javax.ejb.Remote;

/**
 *
 * @author nigfire
 */
@Remote
public interface ILoginState {

    Login getLogin();

    Role getRole();

    void setLogin(Login login);

    void setRole(Role role);
    
}
