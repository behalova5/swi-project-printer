/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package global.types;

import java.io.Serializable;

public enum ModelState implements Serializable{
    UPLOADED("UPLOADED"), 
    NOTPRINTABLE("NOTPRINTABLE"),
    ACCEPTED("ACCEPTED"),
    PRINTED("PRINTED"),
    WASHED("WASHED"),
    DONE("DONE");
    
    private final String modelState;

    private ModelState(String modelState) {
        this.modelState = modelState;
    }

    public String getModelState() {
        return modelState;
    }
}
