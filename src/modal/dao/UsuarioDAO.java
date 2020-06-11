package modal.dao;

import connection.ModuloConexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modal.bean.Usuario;

/**
 * USJ - Centro Universitário de São José
 *
 * @author Matheus Alves Pereira - SC
 */
public class UsuarioDAO {

    public void create(Usuario usuario) {//inserindo usuario dentro do BD

        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO usuario(nome, dataNasc, cpf, funcao, sexo, email, telefone, usuario, senha) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");//? = parametros
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getDataNasc());
            stmt.setString(3, usuario.getCpf());
            stmt.setString(4, usuario.getFuncao());
            stmt.setString(5, usuario.getSexo());
            stmt.setString(6, usuario.getEmail());
            stmt.setString(7, usuario.getTelefone());
            stmt.setString(8, usuario.getUsuario());
            stmt.setString(9, usuario.getSenha());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            ModuloConexao.closeConnection(con, stmt);
        }
    }
    
    public void delete(Usuario u) {//deletando usuario dentro do BD

        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM usuario WHERE id = ?");//? = parametros a serem preenchidos
            stmt.setInt(1, u.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir: " + ex);
        } finally {
            ModuloConexao.closeConnection(con, stmt);
        }
    }

    public List<Usuario> read() {//criando uma lista pra mostrar no jTable, utilizando SELECT do bd
        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuario> listaUsuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();

            while (rs.next()) {//quando nao tiver mais resultado ele retorna false e o loop para
                Usuario usuario = new Usuario();

                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setNasc(rs.getString("dataNasc"));
                usuario.setFuncao(rs.getString("funcao"));
                usuario.setSexo(rs.getString("sexo"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setUsuario(rs.getString("usuario"));
                listaUsuarios.add(usuario);
            }
        } catch (SQLException ex) {
            System.err.println("Erro no metodo read: " + ex);
        } finally {
            ModuloConexao.closeConnection(con, stmt, rs);
        }

        return listaUsuarios;
    }

    public List<Usuario> find(String desc) {//criando uma lista pra mostrar no jTable, utilizando SELECT do bd
        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuario> listaUsuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE nome LIKE ? OR funcao LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            stmt.setString(2, "%" + desc + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {//quando nao tiver mais resultado ele retorna false e o loop para
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setNasc(rs.getString("dataNasc"));
                usuario.setFuncao(rs.getString("funcao"));
                usuario.setSexo(rs.getString("sexo"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setUsuario(rs.getString("usuario"));
                listaUsuarios.add(usuario);
            }
        } catch (SQLException ex) {
            System.err.println("Erro no metodo read: " + ex);
        } finally {
            ModuloConexao.closeConnection(con, stmt, rs);
        }

        return listaUsuarios;
    }

    public boolean checkLogin(String usuario, String senha) {//criando uma lista pra mostrar no jTable, utilizando SELECT do bd
        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {
            stmt = con.prepareStatement("SELECT usuario, senha FROM usuario WHERE usuario = ? AND senha = ?");
            stmt.setString(1, usuario);//usuario do parametro
            stmt.setString(2, senha);//senha do parametro

            rs = stmt.executeQuery();

            if (rs.next()) {//validação de usuario e senha
                check = true;
            }
        } catch (SQLException ex) {
            System.err.println("Erro no metodo checkLogin: " + ex);
        } finally {
            ModuloConexao.closeConnection(con, stmt, rs);
        }

        return check;
    }

    public boolean existsLogin(String usuario) {//Verificando se existe alguem com esse usuario
        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {
            stmt = con.prepareStatement("SELECT usuario FROM usuario WHERE usuario = ?");
            stmt.setString(1, usuario);//usuario do parametro

            rs = stmt.executeQuery();

            if (rs.next()) {//validação de usuario e senha
                check = true;
            }
        } catch (SQLException ex) {
            System.err.println("Erro no metodo existsLogin: " + ex);
        } finally {
            ModuloConexao.closeConnection(con, stmt, rs);
        }

        return check;
    }

    public boolean existsCPF(String cpf) {//Verificando se existe alguem com esse usuario
        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {
            stmt = con.prepareStatement("SELECT cpf FROM usuario WHERE cpf = ?");
            stmt.setString(1, cpf);//usuario do parametro

            rs = stmt.executeQuery();

            if (rs.next()) {//validação de usuario e senha
                check = true;
            }
        } catch (SQLException ex) {
            System.err.println("Erro no metodo existsLogin: " + ex);
        } finally {
            ModuloConexao.closeConnection(con, stmt, rs);
        }

        return check;
    }

    
    public void update(Usuario u) {//alterando usuario dentro do BD

        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE usuario SET usuario = ?, senha = ? WHERE id = ?");//? = parametros
            stmt.setString(1, u.getUsuario());
            stmt.setString(2, u.getSenha());
            stmt.setInt(3, u.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar: " + ex);
        } finally {
            ModuloConexao.closeConnection(con, stmt);
        }
    }
    
    public Usuario umUsuario(String i) {//criando uma lista pra mostrar no jTable, utilizando SELECT do bd
        Connection con = ModuloConexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Usuario usuario = new Usuario();
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE id LIKE ?");
            stmt.setString(1, "%"+i+"%");
            rs = stmt.executeQuery();

            if(rs.next()) {//quando nao tiver mais resultado ele retorna false e o loop para
                
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setNasc(rs.getString("dataNasc"));
                usuario.setFuncao(rs.getString("funcao"));
                usuario.setSexo(rs.getString("sexo"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setSenha(rs.getString("senha"));
            }else{
                JOptionPane.showMessageDialog(null, "Usuário não encontrado.");
            }
        } catch (SQLException ex) {
            System.err.println("Erro no metodo read: " + ex);
        } finally {
            ModuloConexao.closeConnection(con, stmt, rs);
        }

        return usuario;
    }
    
}//fim da classe
