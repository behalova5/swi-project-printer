/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.facades;

import app.ManageModel;
import db.entities.Model;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ModelViewFacade {
    
    @EJB
    private ManageModel manageModel;
    
    public List<Model> getListOfModels(){
        return manageModel.getListOfModels();
    }
    
    
}
