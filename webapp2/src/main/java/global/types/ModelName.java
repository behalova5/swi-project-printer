/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package global.types;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class ModelName implements Serializable{
    private String modelName;

    public ModelName(String modelName) {
        this.modelName = "";
    }

    public ModelName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
