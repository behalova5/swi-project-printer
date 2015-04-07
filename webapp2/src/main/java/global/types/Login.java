/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package global.types;

import java.io.Serializable;
import javax.persistence.Embeddable;
@Embeddable
public class Login implements Serializable{
    private String login;

    public Login() {
    }
    
    public Login(){
        this.login = "";
    }
    
    public Login(String login){
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    @Override
    public String toString() {
        return login;
    }

}
