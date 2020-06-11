package modal.dao;

import connection.ModuloConexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modal.bean.Produto;

/**
 * USJ - Centro Universitário de São José
 *
 * @author Matheus Alves Pereira - SC
 */
public class ProdutoDAO {

    public void create(Produto p) {//inserindo produto dentro do BD

        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO produto (descricao, tipo, qtd, preco) VALUES(?, ?, ?, ?)");//? = parametros
            stmt.setString(1, p.getDescricao());
            stmt.setInt(2, p.getTipo());
            stmt.setInt(3, p.getQtd());
            stmt.setDouble(4, p.getPreco());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            ModuloConexao.closeConnection(con, stmt);
        }
    }
    
    public List<Produto> read(){//criando uma lista pra mostrar no jTable, utilizando SELECT do bd
        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> listaProdutos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();
            
            while(rs.next()){//quando nao tiver mais resultado ele retorna false e o loop para
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setTipo(rs.getInt("tipo"));
                produto.setQtd(rs.getInt("qtd"));
                produto.setPreco(rs.getDouble("preco"));
                listaProdutos.add(produto);
            }
        } catch (SQLException ex) {
            System.err.println("Erro no metodo read: " + ex);
        }finally{
             ModuloConexao.closeConnection(con, stmt, rs);
        }
        
        return listaProdutos;
    }
    
    public void update(Produto p) {//alterando produto dentro do BD

        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE produto SET descricao = ?, tipo = ?, qtd = ?, preco = ? WHERE id = ?");//? = parametros
            stmt.setString(1, p.getDescricao());
            stmt.setInt(2, p.getTipo());
            stmt.setInt(3, p.getQtd());
            stmt.setDouble(4, p.getPreco());
            stmt.setInt(5, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar: " + ex);
        } finally {
            ModuloConexao.closeConnection(con, stmt);
        }
    }
    
    public void delete(Produto p) {//deletando produto dentro do BD

        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM produto WHERE id = ?");//? = parametros a serem preenchidos
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir: " + ex);
        } finally {
            ModuloConexao.closeConnection(con, stmt);
        }
    }
    
    public List<Produto> find(String desc){//criando uma lista pra mostrar no jTable, utilizando SELECT do bd
        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> listaProdutos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE descricao LIKE ? OR tipo LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            stmt.setString(2, "%"+desc+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){//quando nao tiver mais resultado ele retorna false e o loop para
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setTipo(rs.getInt("tipo"));
                produto.setQtd(rs.getInt("qtd"));
                produto.setPreco(rs.getDouble("preco"));
                listaProdutos.add(produto);
            }
        } catch (SQLException ex) {
            System.err.println("Erro no metodo read: " + ex);
        }finally{
             ModuloConexao.closeConnection(con, stmt, rs);
        }
        
        return listaProdutos;
    }
    
    public Produto umProduto(String id) {//
        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Produto produto = new Produto(); //instanciado fora pra poder retornar
        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE id LIKE ? AND qtd > 0");
            stmt.setString(1, id+"%");
            rs = stmt.executeQuery();

            if(rs.next()) {//quando nao tiver mais resultado ele retorna false e o loop para
                
                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setTipo(rs.getInt("tipo"));
                produto.setQtd(rs.getInt("qtd"));
                produto.setPreco(rs.getDouble("preco"));
                
            }else{
                JOptionPane.showMessageDialog(null, "Produto não encontrado ou não há no estoque.");
            }
        } catch (SQLException ex) {
            System.err.println("Erro no metodo umProduto: " + ex);
        } finally {
            ModuloConexao.closeConnection(con, stmt, rs);
        }

        return produto;
    }
    
    public Produto umProdutoQtd(String id) {//
        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Produto produto = new Produto(); //instanciado fora pra poder retornar
        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE id LIKE ? AND qtd > 0");
            stmt.setString(1, "%"+id+"%");
            rs = stmt.executeQuery();

            if(rs.next()) {//quando nao tiver mais resultado ele retorna false e o loop para
                
                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setTipo(rs.getInt("tipo"));
                produto.setQtd(rs.getInt("qtd"));
                produto.setPreco(rs.getDouble("preco"));
                
            }else{
                JOptionPane.showMessageDialog(null, "Produto não encontrado ou não há no estoque.");
            }
        } catch (SQLException ex) {
            System.err.println("Erro no metodo umProduto: " + ex);
        } finally {
            ModuloConexao.closeConnection(con, stmt, rs);
        }

        return produto;
    }
    
    public void updateQtd(Produto p) {//alterando produto dentro do BD

        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE produto SET qtd = ? WHERE id = ?");//? = parametros
            stmt.setInt(1, p.getQtd());
            stmt.setInt(2, p.getId());

            stmt.executeUpdate();

            System.out.println( "Quantidade atualizada com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar: " + ex);
        } finally {
            ModuloConexao.closeConnection(con, stmt);
        }
    }
}//fim da classe
