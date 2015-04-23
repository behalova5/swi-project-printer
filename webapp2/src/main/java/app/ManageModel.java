/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import db.entities.Model;
import db.facades.IModelFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ManageModel {
    
    @EJB
    private IModelFacade modelFacade;
    
    public void setModelFacade(IModelFacade facade){
       modelFacade=facade;
    }
    
    public boolean createModel(Model model){
        try {
            modelFacade.create(model);
        } catch (Exception e){
            return false;
        }
        return true;
    }


    public List<Model> getListOfModels(){
        return modelFacade.findAll();
    }
}
