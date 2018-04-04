/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Collection;
import model.Cliente;

/**
 *
 * @author Harrison
 */
public class ClienteDAO {
    
    private Collection<Cliente> clientes;

    
    public ClienteDAO() {
        if(clientes == null){
            this.clientes = new ArrayList<Cliente>();
        }
    }

    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }
   
    public void criar(Cliente cliente){
        clientes.add(cliente);
    }
    
    public void alterar(Cliente cliente, int id){
        
    }
    
    public void excluir(Cliente cliente, int id){
        clientes.remove()
    }
    
    public Cliente ler(int id){
        
    }
    
    public Collection<Cliente> ler(){
        
    }
}
