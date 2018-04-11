package view.Principal;

import view.pais.PaisController;
import view.cliente.ClienteController;

public class PrincipalController {
    private PrincipalView principalView;
    
    public PrincipalController(){
        if(principalView == null)
            principalView = new PrincipalView(this);
        
        principalView.setVisible(true);
    }
    
    /*public void setVisible(boolean b){
        this.principalView.setVisible(b);
    }*/
    
    public void cliente(){
        ClienteController clienteController = new ClienteController(principalView);
    }

    public void pais(){
        PaisController paisController = new PaisController(principalView);
    }

}
