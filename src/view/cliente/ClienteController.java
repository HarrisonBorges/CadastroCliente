package view.cliente;

import data.ClienteDAO;
import data.ClienteData;
import data.PaisDAO;
import data.PaisData;
import java.util.ArrayList;
import view.Principal.PrincipalView;

public class ClienteController {
    
    private ClienteView clienteView;
    private ClienteDAO clienteDAO = new ClienteDAO();
    private PaisDAO paisDAO = new PaisDAO();
    private ClienteData clienteData = new ClienteData();
    private ClienteModel clienteModel = new ClienteModel();
    
    public ClienteController(){
        
        clienteModel.setPaises((ArrayList<PaisData>) paisDAO.ler());
        clienteView = new ClienteView(this);
        clienteView.setVisible(true);
    }
    
    public ClienteController(PrincipalView principalView){
        
        clienteModel.setPaises((ArrayList<PaisData>) paisDAO.ler());
        clienteView = new ClienteView(this);
        clienteView.setVisible(true);
    }
    
    public ArrayList<String> paises(){
        ArrayList<String> paises = new ArrayList<>();
        for (int i = 0; i < clienteModel.getPaises().size(); i++) {
            paises.add(clienteModel.getPaises().get(i).getNomePais());
        }
        
        return paises;
    }
    
    public void cadastrarCiente(ClienteModel clienteModel){
        clienteData.setNome(clienteModel.getNome());
        clienteData.setPais(paisDAO.ler(clienteModel.getPais()));
        clienteData.setTelefone(clienteModel.getTelefone());
        clienteData.setDataNasc(clienteModel.getDataNasc());
        
        clienteDAO.criar(clienteData);
    }
    
}
