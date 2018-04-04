package model;

public class Pais {

    private String nomePais;
    private String sigla;
    private int telefoneQtdeDigitos;

    public Pais(String nomePais, String sigla, int telefoneQtdeDigitos) throws Exception{
        setNomePais(nomePais);
        setSigla(sigla);
        this.telefoneQtdeDigitos    = telefoneQtdeDigitos;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) throws Exception{
        if(nomePais.length() > 0)
            this.nomePais   = nomePais;
        else
            throw new Exception("O nome do País é obrigatório!");
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) throws Exception{      
        if(sigla.length() > 0)
            this.sigla  = sigla;
        else
            throw new Exception("A sigla do País é obrigatório!");
    }

    public int getTelefoneQtdeDigitos() {
        return telefoneQtdeDigitos;
    }

    public void setTelefoneQtdeDigitos(int telefoneQtdeDigitos) {
        this.telefoneQtdeDigitos = telefoneQtdeDigitos;
    }

    @Override
    public String toString() {
        return "Pais{" + "nomePais=" + nomePais + ", sigla=" + sigla + ", telefoneQtdeDigitos=" + telefoneQtdeDigitos + '}';
    }
}
