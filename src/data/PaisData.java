/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Harrison
 */
public class PaisData {
    private int id;
    private String nomePais;
    private String sigla;
    private int telefoneQtdeDigitos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getTelefoneQtdeDigitos() {
        return telefoneQtdeDigitos;
    }

    public void setTelefoneQtdeDigitos(int telefoneQtdeDigitos) {
        this.telefoneQtdeDigitos = telefoneQtdeDigitos;
    }
    
    
}
