package modal.dao;

import connection.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modal.bean.Produto;
import modal.bean.Venda;

/**
 * USJ - Centro Universitário de São José
 *
 * @author Matheus Alves Pereira - SC
 */
public class VendaDAO {

    public void create(Venda venda) {//inserindo venda dentro do BD

        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO venda (dataVenda, idCliente, valorTotal) values (?, ?, ?)");//? = parametros
            stmt.setString(1, venda.getDataVenda());
            stmt.setInt(2, venda.getIdCliente());
            stmt.setDouble(3, venda.getValorTotal());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            ModuloConexao.closeConnection(con, stmt);
        }
    }

    public List<Venda> read() {//criando uma lista pra mostrar no jTable, utilizando SELECT do bd
        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Venda> listaVendas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT V.id AS idVenda, C.nome AS Cliente_Nome, V.dataVenda AS Data_Venda, V.valorTotal AS Valor_Total FROM venda V JOIN cliente C ON C.id = V.idCliente");
            rs = stmt.executeQuery();

            while (rs.next()) {//quando nao tiver mais resultado ele retorna false e o loop para
                Venda venda = new Venda();
                venda.setId(rs.getInt("idVenda"));
                venda.setNomeCliente(rs.getString("Cliente_Nome"));
                venda.setDataV(rs.getString("Data_Venda"));
                venda.setValorTotal(rs.getDouble("Valor_Total"));
                listaVendas.add(venda);
            }
        } catch (SQLException ex) {
            System.err.println("Erro no metodo read: " + ex);
        } finally {
            ModuloConexao.closeConnection(con, stmt, rs);
        }

        return listaVendas;
    }


    public List<Venda> find(String desc) {//criando uma lista pra mostrar no jTable, utilizando SELECT do bd
        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Venda> listaVendas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT V.id AS idVenda, C.nome AS Cliente_Nome, V.dataVenda AS Data_Venda, V.valorTotal AS Valor_Total FROM venda V JOIN cliente C ON C.id = V.idCliente WHERE C.nome LIKE ? OR V.id LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            stmt.setString(2, "%" + desc + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {//quando nao tiver mais resultado ele retorna false e o loop para
                Venda venda = new Venda();
                venda.setId(rs.getInt("idVenda"));
                venda.setNomeCliente(rs.getString("Cliente_Nome"));
                venda.setDataV(rs.getString("Data_Venda"));
                venda.setValorTotal(rs.getDouble("Valor_Total"));
                listaVendas.add(venda);
            }
        } catch (SQLException ex) {
            System.err.println("Erro no metodo read: " + ex);
        } finally {
            ModuloConexao.closeConnection(con, stmt, rs);
        }

        return listaVendas;
    }

    
}
