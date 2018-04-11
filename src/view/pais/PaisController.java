package view.pais;

import data.PaisDAO;
import data.PaisData;
import view.Principal.PrincipalView;

public class PaisController {

    private PaisView paisView = new PaisView(this);
    private PaisDAO paisDAO = new PaisDAO();
    private PaisData paisData = new PaisData();

    public PaisController() {
        paisView.setVisible(true);
    }

    public PaisController(PrincipalView principalView) {
        paisView.setVisible(true);
    }
    
    /*public void setVisible(boolean b){
        this.paisView.setVisible(b);
    }*/
    
    public void cadastrarPais(PaisModel paisModel) {
        //paisData.setId(0);
        paisData.setNomePais(paisModel.getNomePais());
        paisData.setSigla(paisModel.getSigla());
        paisData.setTelefoneQtdeDigitos(paisModel.getTelefoneQtdeDigitos());

        paisDAO.criar(paisData);
    }
}
