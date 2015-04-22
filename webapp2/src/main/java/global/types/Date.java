/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package global.types;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Date implements Serializable{
    private long timestamp;

    public Date() {
        this.timestamp=0;
    }

    public Date(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
    public void setCurrentDate(){
        this.timestamp = System.currentTimeMillis();
    }
    
}
