package controller;

import model.Cliente;
import java.util.ArrayList;
import java.util.Collection;

public class ClienteController {

    private Collection<Cliente> clientes = new ArrayList<>();

    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void manter(Cliente cliente) throws Exception {
        if (!verificarNome(cliente.getNome())) {
            clientes.add(cliente);
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
