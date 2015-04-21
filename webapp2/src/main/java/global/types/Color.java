/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package global.types;

import java.io.Serializable;

public class Color implements Serializable{
    private String color;

    public Color() {
        this.color = "";
    }


    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
