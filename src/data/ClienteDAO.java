package data;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Harrison
 */
public class ClienteDAO {

    private Collection<ClienteData> clientes;
    ConexaoBD conex = new ConexaoBD(); // Instanciando

    public ClienteDAO() {
        if (clientes == null) {
            this.clientes = new ArrayList<ClienteData>();
        }
    }

    public Collection<ClienteData> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<ClienteData> clientes) {
        this.clientes = clientes;
    }

    public void criar(ClienteData cliente) {
        conex.conexao(); // Abrir Conexão BD

        System.out.println(cliente.getDataNasc());
        Date data = cliente.getDataNasc().getTime();
        System.out.println(data);
        java.sql.Date dataSQL = new java.sql.Date(data.getTime());
        System.out.println(dataSQL);
        try {
            // Adicionar Try Catch
            PreparedStatement pst = conex.con.prepareStatement("insert into cliente(nome,telefone,limiteCredito,datanasc) values(?,?,?,?)");
            pst.setString(1, cliente.getNome());    // Enviar os Dados conforme o tipo especificado no BD
            pst.setString(2, cliente.getTelefone()); // Enviar os Dados conforme o tipo especificado no BD
            pst.setDouble(3, cliente.getLimiteCredito()); // Enviar os Dados conforme o tipo especificado no BD
            pst.setDate(4, dataSQL); // Enviar os Dados conforme o tipo especificado no BD

            pst.execute(); // Executa a transação quando estiver correto
            JOptionPane.showMessageDialog(null, "Dados inseridos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO Ao inserir os Dados!" + ex.getMessage());

        }

        conex.desconecta(); // Desconecta o BD
        //clientes.add(cliente);
    }

    public void alterar(ClienteData cliente) {
        conex.conexao(); // Abre Conexão
        // Colocar no Try Catch
        try {
            PreparedStatement pst = conex.con.prepareStatement("update cliente set nome=?, telefone=?,limiteCredito=? where id=?");
            pst.setString(1, cliente.getNome());    // Enviar os Dados conforme o tipo especificado no BD
            pst.setString(2, cliente.getTelefone()); // Enviar os Dados conforme o tipo especificado no BD
            pst.setDouble(3, cliente.getLimiteCredito()); // Enviar os Dados conforme o tipo especificado no BD
            pst.setInt(4, cliente.getId()); // Enviar os Dados conforme o tipo especificado no BD
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar os dados! \nErro: " + ex.getMessage());
        }

        conex.desconecta(); // Fecha Conexão
    }

    public void excluir(ClienteData cliente) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from cliente where id=?");
            pst.setInt(1, cliente.getId());
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Exluidos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Deletar os Dados!" + ex.getMessage());
        }
        
        conex.desconecta();
    }

    public ClienteData ler(int id) {
        conex.conexao(); // Abri as conexão
        conex.executaSql("select * from cliente where id = " + id);
        ClienteData cd = new ClienteData();
        
        try {
            conex.rs.first(); // Resultado da pesquisa do primeiro resultado do BD
            cd.setId(conex.rs.getInt("id")); // Exibe o resultado da pesquisa no campo Edit
            cd.setNome(conex.rs.getString("nome"));  // Exibe o resultado da pesquisa no campo Edit
            cd.setLimiteCredito(conex.rs.getDouble("limiteCredito"));  // Exibe o resultado da pesquisa no campo Edit
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar o Cliente: " + ex.getMessage());
        }
        
        conex.desconecta(); // Desconecta conexão
        return cd;
    }

    public Collection<ClienteData> ler() {
        conex.conexao(); // Abri as conexão
        conex.executaSql("select * from cliente where id = " + 0);
        ClienteData cd = new ClienteData();
        
        try {
            conex.rs.first(); // Resultado da pesquisa do primeiro resultado do BD
            cd.setId(conex.rs.getInt("id")); // Exibe o resultado da pesquisa no campo Edit
            cd.setNome(conex.rs.getString("nome"));  // Exibe o resultado da pesquisa no campo Edit
            cd.setLimiteCredito(conex.rs.getDouble("limiteCredito"));  // Exibe o resultado da pesquisa no campo Edit
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar o Cliente: " + ex.getMessage());
        }
        
        conex.desconecta(); // Desconecta conexão
        return null;
    }

}
