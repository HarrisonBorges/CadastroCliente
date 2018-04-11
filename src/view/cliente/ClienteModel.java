package view.cliente;

import data.PaisData;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class ClienteModel {
    private String nome;
    private String telefone;
    private String pais;
    private ArrayList<PaisData> paises;
    private GregorianCalendar dataNasc;

    public ClienteModel() {
        
    }

    public ClienteModel(String nome, String telefone, String pais, GregorianCalendar dataNasc) {
        this.nome = nome;
        this.telefone = telefone;
        this.pais = pais;
        this.dataNasc = dataNasc;
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

    public ArrayList<PaisData> getPaises() {
        return paises;
    }

    public void setPaises(ArrayList<PaisData> paises) {
        this.paises = paises;
    }

    public GregorianCalendar getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(GregorianCalendar dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "ClienteModel{" + "nome=" + nome + ", telefone=" + telefone + ", pais=" + pais + ", paises=" + paises + ", dataNasc=" + dataNasc + '}';
    }


}
