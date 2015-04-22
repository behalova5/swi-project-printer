/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import global.types.*;
import db.entities.Model;
import db.facades.IModelFacade;
import db.facades.ModelFacade;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import view.managebeans.AddModelForm;
import view.managebeans.ModelsView;

/**
 *
 * @author Jiri Pavlik
 */
public class ManageModelTest {
    
    IModelFacade modelFacade;
    AddModelForm modelManager;
    ModelsView viewManager;
    
    
    // testing data initialization
    @Before
     public void setUp() {
         Model model = new Model();
         model.setIDmodel(1);
         model.setColor(null);
         model.setDate(null);
         model.setModelName(new ModelName("TestModel"));
         model.setScale(null);

         
         ArrayList<Model>list = new ArrayList<Model>();
         list.add(model);
         
         modelFacade = new IModelFacade() {

             @Override
             public Model getModelById(int IDmodel) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }

             @Override
             public boolean existsModel(int IDmodel) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }

             @Override
             public int count() {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }

             @Override
             public void create(Model entity) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }

             @Override
             public void edit(Model entity) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }

             @Override
             public Model find(Object id) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }

             @Override
             public List<Model> findAll() {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }

             @Override
             public List<Model> findRange(int[] range) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }

             @Override
             public void remove(Model entity) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
         };
                       
        modelManager = new AddModelForm();
        //modelManager.setModelFacade(modelFacade);
         
     }
     
    @After
    public void tearDown() {
    }
    
    /*
    @Test
    public void addValidModel(){
        Model model = new Model();
        model.setColor(null);
        model.setDate(null);
        model.setModelName(new ModelName("valid"));
        model.setScale(null);
        
        try{
           assertTrue("Vytvoreni validniho modelu selhalo",modelManager.AddModel(model));
        }catch(Exception e){
            
        }        
    }
    
    @Test
    public void addInvalidModel(){
        Model model = new Model();
        model.setColor(null);
        model.setDate(null);
        model.setModelName(new ModelName("invalid"));
        model.setScale(null);
        
        try{
           assertTrue("Vytvoreni nevalidniho modelu neselhalo",modelManager.AddModel(model));
        }catch(Exception e){
            
        }
    }
    
    
    @Test
    public void printModels(){
        
    }
    
    */
           

}
