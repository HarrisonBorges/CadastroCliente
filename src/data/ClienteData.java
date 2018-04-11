package data;

import java.util.GregorianCalendar;
import model.Pais;

public class ClienteData {
    private int id;
    private String nome;
    private String telefone;
    private double limiteCredito;
    private PaisData pais;
    private GregorianCalendar dataNasc;

    public ClienteData() {
    }

    
    
    public ClienteData(int id, String nome, String telefone, double limiteCredito, PaisData pais, GregorianCalendar dataNasc) {
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

    public PaisData getPais() {
        return pais;
    }

    public void setPais(PaisData pais) {
        this.pais = pais;
    }

    public GregorianCalendar getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(GregorianCalendar dataNasc) {
        this.dataNasc = dataNasc;
    }

    
}
