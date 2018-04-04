package controller;

import model.Pais;
import java.util.ArrayList;
import java.util.Collection;

public class PaisController {

    private Collection<Pais> pais = new ArrayList<>();

    public Collection<Pais> getPais() {
        return pais;
    }

    public void setPais(Collection<Pais> pais) {
        this.pais = pais;
    }

    public void manter(Pais p) throws Exception {
        if (!verificarNome(p.getNomePais())) {
            pais.add(p);
        } else {
            throw new Exception("Já existe um País com este nome!");
        }
    }

    public Pais procurar(String nome){
        for (Pais p : pais) {
            if (p.getNomePais().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        
        return null;
    }
    
    public boolean verificarNome(String nome) {
        boolean existe = false;

        for (Pais p : pais) {
            if (p.getNomePais().equalsIgnoreCase(nome)) {
                existe = true;
            }
        }
        return existe;
    }
}
