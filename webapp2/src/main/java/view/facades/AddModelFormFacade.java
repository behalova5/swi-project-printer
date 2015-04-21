/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.facades;

import app.ManageModel;
import db.entities.Model;
import javax.ejb.EJB;
import javax.ejb.Stateless;


@Stateless
public class AddModelFormFacade {
    
    @EJB
    private ManageModel manageModel;

    public boolean addModel(Model model){
        return manageModel.createModel(model);
    }
    
}
