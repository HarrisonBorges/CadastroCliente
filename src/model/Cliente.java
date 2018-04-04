package model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Cliente {

    private String nome;
    private String telefone;
    private double limiteCredito;
    private Pais pais;
    private GregorianCalendar dataNasc;

    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(String nome, String telefone, Pais pais, GregorianCalendar dataNasc) throws Exception {
        setNome(nome);
        setPais(pais);
        setTelefone(telefone);
        this.dataNasc = dataNasc;
        this.limiteCredito = atribuirLimite(dataNasc);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (tamNome(nome)) {
            this.nome = nome;
        } else {
            throw new Exception("O Nome deve ter no mínimo 5 caracteres!");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws Exception{
        if(validarTelefone(telefone))
            this.telefone = telefone;
        else
            throw new Exception("Telefone inválido!");
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(GregorianCalendar dtNasc) {
        this.limiteCredito = atribuirLimite(dtNasc);
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) throws Exception {
        if (tamPais(pais)) {
            this.pais = pais;
        } else {
            throw new Exception("O pais é obrigatório!");
        }
    }

    public GregorianCalendar getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(GregorianCalendar dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", telefone=" + telefone + ", limiteCredito=" + limiteCredito + ", pais=" + pais + ", dataNasc=" + dataNasc + '}';
    }

    public void cadastrarCliente(Cliente cliente) {
        this.nome = cliente.getNome();
    }

    public boolean tamNome(String nome) {
        if (nome.length() < 5) {
            return false;
        }
        return true;
    }

    public boolean tamPais(Pais p) {
        if (p == null) {
            return false;
        }
        return true;
    }

    public double atribuirLimite(GregorianCalendar dtNasc) {
        GregorianCalendar dataAtual = new GregorianCalendar();
        String local = pais.getNomePais();

        int idade = dataAtual.get(Calendar.YEAR) - dtNasc.get(Calendar.YEAR);
        double credito = 0;

        if (idade <= 18) {
            credito = 100;
        } else if (idade > 18 && idade <= 35) {
            credito = 300;
        } else {
            credito = 500;
        }
        if (local.equalsIgnoreCase("brasil")) {
            credito += 100;
        }

        return credito;
    }
    
    public boolean validarTelefone(String telefone){
        if(this.pais.getTelefoneQtdeDigitos() != 0)
            if(telefone.length() == this.pais.getTelefoneQtdeDigitos())
                return true;
        
        return false;
    }
}
