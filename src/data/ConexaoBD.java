// Faz conexão com o Banco de Dados
package data;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Harrison
 */
public class ConexaoBD {
    // Os que estão Públicos são para ser acessados de outras classes
    // Os Privados será acessados somente na nossa classe
    public Statement stm; // Faz a pesquisa no bd
    public ResultSet rs; // Armazena o resultado da pesquisa
    private String driver = "org.postgresql.Driver"; // Identifica o nosso serviço
    private String caminho = "jdbc:postgresql://localhost:5432/bdarquitetura"; // Qual é o caminho que está alocado o bd
    private String usuario = "root"; // Usuário do bd
    private String senha = ""; // Senha do BD
    public Connection con; // Fazer conexão com o BD
    
    public void conexao(){ // Método para realizar a Conexão com o BD
        
        try {
            System.setProperty("jdbc.Drivers", driver); // Seta a propriedade do driver da conexão
            con=DriverManager.getConnection(caminho,usuario,senha);
        //    JOptionPane.showMessageDialog(null,"Conexão Efetuada com Sucesso!"); // Mensagem de Sucesso
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao se Conectar ao Banco de Dados: \n" + ex.getMessage()); // Mensagem de ERRO
        }
    }
    
    // Para usar o Botão pesquisa do FormMedico
    public void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY); // TYPE_SCROLL_INSENSITIVE diferencial letra maíuscula de minuscula, CONCUR_READ_ONLY percorre todo o BD
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ExecutaSql: \n" + ex.getMessage());
        }
    }
    
    public void desconecta(){ // Método para desconectar BD
        try {
            con.close(); // Digito somente conclose() e vou em circundar try catch
          //  JOptionPane.showMessageDialog(null,"Banco de Dados Desconectado com Sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão do Banco de Dados!" + ex.getMessage());
        }
    }
 
}
