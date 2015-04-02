/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package global.types;

import java.io.Serializable;

public enum Role implements Serializable {
    ADMIN("ADMIN"), 
    USER("ADMIN");
    
    private final String role;

    private Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
    
}
