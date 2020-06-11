
package modal.dao;

import connection.ModuloConexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modal.bean.Cliente;
/**
 * USJ - Centro Universitário de São José
 * @author Matheus Alves Pereira - SC 
 */
public class ClienteDAO {

    public void create(Cliente cliente) {//inserindo produto dentro do BD

        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO cliente(nome, cpf, dataNasc, sexo, estado, cep, email, telefone)  VALUES(?, ?, ?, ?, ?, ?, ?, ?)");//? = parametros
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getDataNasc());
            stmt.setString(4, cliente.getSexo());
            stmt.setString(5, cliente.getEstado());
            stmt.setString(6, cliente.getCep());
            stmt.setString(7, cliente.getEmail());
            stmt.setString(8, cliente.getTelefone());

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Sucesso ao Cadastrar", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: Esse mês pode não ter dia 31 ou\nno caso de fevereiro vai ate 29.");
        } finally {
            ModuloConexao.closeConnection(con, stmt);
        }
    }
    
    public void delete(Cliente u) {//deletando cliente dentro do BD

        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE cliente SET status = 'desativo' WHERE id = ?");//? = parametros a serem preenchidos
            stmt.setInt(1, u.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir: " + ex);
        } finally {
            ModuloConexao.closeConnection(con, stmt);
        }
    }
    
    public List<Cliente> read(){//criando uma lista pra mostrar no jTable, utilizando SELECT do bd
        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Cliente> listaClientes = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE cliente.status = 'ativo'");
            rs = stmt.executeQuery();
            
            while(rs.next()){//quando nao tiver mais resultado ele retorna false e o loop para
                Cliente cliente = new Cliente();
                
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setNasc(rs.getString("dataNasc"));
                cliente.setSexo(rs.getString("sexo"));
                cliente.setEstado(rs.getString("estado"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                listaClientes.add(cliente);
            }
        } catch (SQLException ex) {
            System.err.println("Erro no metodo read: " + ex);
        }finally{
             ModuloConexao.closeConnection(con, stmt, rs);
        }
        
        return listaClientes;
    }

    public List<Cliente> find(String desc){//criando uma lista pra mostrar no jTable, utilizando SELECT do bd
        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Cliente> listaClientes = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE status = 'ativo' AND (nome LIKE ? OR estado LIKE ?)");
            stmt.setString(1, "%"+desc+"%");
            stmt.setString(2, "%"+desc+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){//quando nao tiver mais resultado ele retorna false e o loop para
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setNasc(rs.getString("dataNasc"));
                cliente.setSexo(rs.getString("sexo"));
                cliente.setEstado(rs.getString("estado"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
               listaClientes.add(cliente);
            }
        } catch (SQLException ex) {
            System.err.println("Erro no metodo read: " + ex);
        }finally{
             ModuloConexao.closeConnection(con, stmt, rs);
        }
        
        return listaClientes;
    }
    
    public boolean existsCPF(String cpf){//Verificando se existe alguem com esse cliente
        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        boolean check = false;
        
        try {
            stmt = con.prepareStatement("SELECT cpf FROM cliente WHERE cpf = ?");
            stmt.setString(1, cpf);//cliente do parametro

            rs = stmt.executeQuery();
            
            if(rs.next()){//validação de cliente e senha
                check = true;
            }
        } catch (SQLException ex) {
            System.err.println("Erro no metodo existsLogin: " + ex);
        }finally{
             ModuloConexao.closeConnection(con, stmt, rs);
        }
        
        return check;
    }
    
    public Cliente umCliente(String i) {//
        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Cliente cliente = new Cliente();
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE status = 'ativo' AND id LIKE ?");
            stmt.setString(1, "%"+i+"%");
            rs = stmt.executeQuery();

            if(rs.next()) {//quando nao tiver mais resultado ele retorna false e o loop para
                
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNasc(rs.getString("dataNasc"));
                cliente.setSexo(rs.getString("sexo"));
                cliente.setEstado(rs.getString("estado"));
                cliente.setCep(rs.getString("cep"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setStatus(rs.getString("status"));
            }else{
                JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
            }
        } catch (SQLException ex) {
            System.err.println("Erro no metodo umCliente: " + ex);
        } finally {
            ModuloConexao.closeConnection(con, stmt, rs);
        }

        return cliente;
    }
    
}//fim da classe
