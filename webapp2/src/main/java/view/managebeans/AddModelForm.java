package view.managebeans;

import db.entities.Model;
import global.types.ModelName;
import global.types.Color;
import global.types.Scale;
import global.types.ModelData;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Model;
import javax.faces.bean.ManagedBean;
import view.facades.AddModelFormFacade;

@ManagedBean(name="addmodelform")
@SessionScoped

public class AddModelForm implements Serializable {
    private static final long serialVersionUID = 1L;
    private ModelName modelName;
    private Color color;
    private Scale scale;
    private ModelData modelData;
    private String message;
    
    private String fileName;
    
    @EJB
    private view.facades.AddModelFormFacade facade; 
 
    public AddModelForm() {
        this.modelName = new ModelName();
        this.color = new Color();
        this.scale = new Scale();
        this.modelData = new ModelData();
        this.message = "";
    }
        
    public String sendForm(){
        return "addmodelform";
    }
    
    @Override
    public String toString() {
        return "AddModelForm{" + "modelName=" + modelName.toString() + ", color=" + color.toString() + '}';
    }
   
    public String toFloat() {
        return "AddModelForm{" + "scale=" + scale.toFloat() + '}';
    }

    public ModelName getModelName() {
        return modelName;
    }

    public void setModelName(ModelName modelName) {
        this.modelName = modelName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Scale getScale() {
        return scale;
    }

    public void setScale(Scale scale) {
        this.scale = scale;
    }

    public ModelData getModelData() {
        return modelData;
    }

    public void setModelData(ModelData modelData) {
        this.modelData = modelData;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public AddModelFormFacade getFacade() {
        return facade;
    }

    public void setFacade(AddModelFormFacade facade) {
        this.facade = facade;
    }
    
    public boolean AddModel(){
        Model model = new Model() {};
        model.setModelName(this.modelName);
        model.setColor(this.color);
        model.setScale(this.scale);
        model.setModelData(this.modelData);
        return getFacade().AddModel(model);
    }
}