/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package global.types;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class ModelData implements Serializable{
    private Byte[] data;

    public ModelData() {
        this.data = null;
    }
    public Byte[] getData() {
        return data;
    }
    public void setData(Byte[] data) {
        this.data = data;
        
    }
}
