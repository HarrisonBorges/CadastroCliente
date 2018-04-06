/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JOptionPane;

/**
 *
 * @author Harrison
 */
public class PaisDAO {
    private Collection<PaisData> paises;

        ConexaoBD conex = new ConexaoBD(); // Instanciando

    
    public PaisDAO() {
        if(paises == null){
            this.paises = new ArrayList<PaisData>();
        }
    }

    public ArrayList<PaisData> getPaises() {
        return (ArrayList<PaisData>) paises;
    }

    public void setPaises(Collection<PaisData> paises) {
        this.paises = paises;
    }
   
    public void criar(PaisData pais){
    conex.conexao(); // Abrir Conexão BD

        try {
            // Adicionar Try Catch
            PreparedStatement pst = conex.con.prepareStatement("insert into pais(nomePais,sigla,telefoneQtdeDigitos) values(?,?,?)");
            pst.setString(1, pais.getNomePais());    // Enviar os Dados conforme o tipo especificado no BD
            pst.setString(2, pais.getSigla()); // Enviar os Dados conforme o tipo especificado no BD
            pst.setInt(3, pais.getTelefoneQtdeDigitos()); // Enviar os Dados conforme o tipo especificado no BD

            pst.execute(); // Executa a transação quando estiver correto
            JOptionPane.showMessageDialog(null, "Dados inseridos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO Ao inserir os Dados!" + ex.getMessage());

        }

        conex.desconecta(); // Desconecta o BD
        //clientes.add(cliente);
    }
    
    public void alterar(PaisData pais){
                conex.conexao(); // Abre Conexão
        // Colocar no Try Catch
        try {
            PreparedStatement pst = conex.con.prepareStatement("update pais set nomePais=?, sigla=?,telefoneQdeDigitos=? where id=?");
            pst.setString(1, pais.getNomePais());    // Enviar os Dados conforme o tipo especificado no BD
            pst.setString(2, pais.getSigla()); // Enviar os Dados conforme o tipo especificado no BD
            pst.setDouble(3, pais.getTelefoneQtdeDigitos()); // Enviar os Dados conforme o tipo especificado no BD
            pst.setInt(4, pais.getId()); // Enviar os Dados conforme o tipo especificado no BD
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar os dados! \nErro: " + ex.getMessage());
        }

        conex.desconecta(); // Fecha Conexão
    }
    
    public void excluir(PaisData pais){
             conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from pais where id=?");
            pst.setInt(1, pais.getId());
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Exluidos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Deletar os Dados!" + ex.getMessage());
        }
        
        conex.desconecta();
    }
    
    public PaisData ler(int id){
              conex.conexao(); // Abri as conexão
        conex.executaSql("select * from pais where id = " + id);
        PaisData cp = new PaisData();
        
        try {
            conex.rs.first(); // Resultado da pesquisa do primeiro resultado do BD
            cp.setId(conex.rs.getInt("id")); // Exibe o resultado da pesquisa no campo Edit
            cp.setNomePais(conex.rs.getString("nomePais"));  // Exibe o resultado da pesquisa no campo Edit
            cp.setSigla(conex.rs.getString("sigla"));  // Exibe o resultado da pesquisa no campo Edit
            cp.setTelefoneQtdeDigitos(conex.rs.getInt("setTelefoneQtdeDigitos"));  // Exibe o resultado da pesquisa no campo Edit
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o Pais: " + ex.getMessage());
        }
        
        conex.desconecta(); // Desconecta conexão
        return cp;
  
    }
    
    public Collection<PaisData> ler(){
              conex.conexao(); // Abri as conexão
        conex.executaSql("select * from pais where id = " + 0);
        PaisData cp = new PaisData();
        
        try {
            conex.rs.first(); // Resultado da pesquisa do primeiro resultado do BD
            cp.setId(conex.rs.getInt("id")); // Exibe o resultado da pesquisa no campo Edit
            cp.setNomePais(conex.rs.getString("nomePais"));  // Exibe o resultado da pesquisa no campo Edit
            cp.setSigla(conex.rs.getString("sigla"));  // Exibe o resultado da pesquisa no campo Edit
            cp.setTelefoneQtdeDigitos(conex.rs.getInt("telefoneQtdeDigitos"));  // Exibe o resultado da pesquisa no campo Edit

            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar o Pais: " + ex.getMessage());
        }
        
        conex.desconecta(); // Desconecta conexão
        return null;
    }
}
