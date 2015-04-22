/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.facades;

import db.abstr.facades.IAbstractFacade;
import db.entities.Model;
import javax.ejb.Local;

@Local
public interface IModelFacade extends IAbstractFacade<Model>{
    public Model getModelById(int IDmodel);
    public boolean existsModel(int IDmodel);
}
