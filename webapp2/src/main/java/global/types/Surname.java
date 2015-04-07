/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package global.types;

import java.io.Serializable;
import javax.persistence.Embeddable;
@Embeddable
public class Surname implements Serializable {
    
    private String surname;

    public Surname() {
    }
    public Surname(String surname){
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Override
    public String toString() {
        return surname;
    }
    
}
