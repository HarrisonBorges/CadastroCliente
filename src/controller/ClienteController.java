package controller;

import data.ClienteDAO;
import data.ClienteData;
import model.Cliente;
import java.util.ArrayList;
import java.util.Collection;

public class ClienteController {

    private Collection<Cliente> clientes = new ArrayList<>();
    private ClienteDAO clienteDao = new ClienteDAO();
    
    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void manter(Cliente cliente) throws Exception {
        ClienteData clienteData = new ClienteData();
        if (!verificarNome(cliente.getNome())) {
            clienteData.setNome(cliente.getNome());
            clienteData.setLimiteCredito(cliente.getLimiteCredito());
           // clienteData.setPais(cliente.getPais());
            clienteData.setTelefone(cliente.getTelefone());
           // clientes.add(cliente);
            clienteDao.criar(clienteData);
        } else {
            throw new Exception("Já existe um Cliente com este nome");
        }
    }

    public boolean verificarNome(String nome) {

        boolean existe = false;

        for (Cliente c : clientes) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                existe = true;
            }
        }
        return existe;
    }

    
}
