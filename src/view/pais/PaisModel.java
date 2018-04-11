package view.pais;

public class PaisModel {

    private String nomePais;
    private String sigla;
    private int telefoneQtdeDigitos;

    public PaisModel() {
    }

    public PaisModel(String nomePais, String sigla, int telefoneQtdeDigitos) {
        this.nomePais = nomePais;
        this.sigla = sigla;
        this.telefoneQtdeDigitos = telefoneQtdeDigitos;
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

    @Override
    public String toString() {
        return "PaisModel{" + "nomePais=" + nomePais + ", sigla=" + sigla + ", telefoneQtdeDigitos=" + telefoneQtdeDigitos + '}';
    }

}
