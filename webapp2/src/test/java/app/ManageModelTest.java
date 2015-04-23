/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import global.types.*;
import db.entities.Model;
import db.facades.IModelFacade;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author Jiri Pavlik
 */
public class ManageModelTest {
    
    IModelFacade facade;
    ManageModel modelManager;
    
    
    // testing data initialization
    @Before
     public void setUp() {
         Model model = new Model();
         model.setIDmodel(1);
         model.setColor(new Color());
         model.setDate(null);
         model.setModelName(new ModelName("TestModel"));
         model.setScale(null);

         
         ArrayList<Model> list = new ArrayList<>();
         list.add(model);
         
         final ArrayList<Model> modelList = list;
         
         facade = new IModelFacade() {

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
                 return modelList;
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
                       
        modelManager = new ManageModel();
        modelManager.setModelFacade(facade);
         
     }
     
    @After
    public void tearDown() {
    }
    
    
    @Test
    public void addValidModel(){
        Date date = new Date();
        date.setCurrentDate();
        Model model = new Model();
        model.setIDmodel(12345);
        model.setColor(new Color("red"));
        model.setDate(date);
        model.setModelName(new ModelName("valid"));
        model.setScale(null);
        
        try{
           assertTrue("Vytvoreni validniho modelu selhalo",modelManager.createModel(model));
        }catch(Exception e){
            
        }        
    }
    
    @Test
    public void addInvalidModel(){

        Model model = new Model();
        model.setIDmodel(-12345);
        model.setModelName(new ModelName("invalid"));
        
        try{
           assertTrue("Vytvoreni nevalidniho modelu neselhalo",modelManager.createModel(model));
        }catch(Exception e){
            
        }
    }      
    
    @Test
    public void viewModelsTest(){
        assertEquals("Model list is empty - only Test model", 1, modelManager.getListOfModels().size());
    }
              

}
