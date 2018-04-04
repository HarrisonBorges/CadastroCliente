/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.GregorianCalendar;
import model.Pais;

/**
 *
 * @author Harrison
 */
public class ClienteData {
    private int id;
    private String nome;
    private String telefone;
    private double limiteCredito;
    private Pais pais;
    private GregorianCalendar dataNasc;

    public ClienteData() {
    }

    
    
    public ClienteData(int id, String nome, String telefone, double limiteCredito, Pais pais, GregorianCalendar dataNasc) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.limiteCredito = limiteCredito;
        this.pais = pais;
        this.dataNasc = dataNasc;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public GregorianCalendar getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(GregorianCalendar dataNasc) {
        this.dataNasc = dataNasc;
    }

    
}
