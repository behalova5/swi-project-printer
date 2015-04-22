package view.managebeans;

import db.entities.Model;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import view.facades.ModelViewFacade;


@ManagedBean(name="modelsview")
@SessionScoped
public class ModelsView implements Serializable {

    
    @EJB
    private ModelViewFacade manageModelsFacade;
    
    public ModelsView() {
        
    }

    public List<Model> getManageModel(){
       return manageModelsFacade.getListOfModels();
    }
    
}
