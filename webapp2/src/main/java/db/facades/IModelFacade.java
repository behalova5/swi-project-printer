/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.facades;

import db.entities.Model;
import java.util.List;

public interface IModelFacade {

    public void create(Model model);

    public List<Model> findAll();
    
}
