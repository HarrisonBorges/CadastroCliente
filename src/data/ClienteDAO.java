/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Harrison
 */
public class ClienteDAO {
    
    private Collection<ClienteData> clientes;

    
    public ClienteDAO() {
        if(clientes == null){
            this.clientes = new ArrayList<ClienteData>();
        }
    }

    public Collection<ClienteData> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<ClienteData> clientes) {
        this.clientes = clientes;
    }
   
    public void criar(ClienteData cliente){
        clientes.add(cliente);
    }
    
    public void alterar(ClienteData cliente, int id){
        
    }
    
    public void excluir(ClienteData cliente, int id){
        f
    }
    
    public ClienteData ler(int id){
        
    }
    
    public Collection<ClienteData> ler(){
        
    }
}
