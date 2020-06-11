package connection;

import java.sql.*; //importação necessaria
import javax.swing.JOptionPane;

public class ModuloConexao {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    //esse url ta grande por causa do erro de time zone que estava acontecendo e n deixando conectar o banco
    private static final String URL = "jdbc:mysql://localhost:3306/jloja?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    //traz a conexão com bd
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);

            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            String msg = "Banco de Dados offline";
            JOptionPane.showMessageDialog(null, msg, "Erro Banco de Dados", JOptionPane.OK_OPTION);
            System.exit(0);

            throw new RuntimeException("Erro na conexão: ", ex);
        }

    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao encerrar conexão: " + ex);
        }
    }

    //sobrecarga do metodo
    public static void closeConnection(Connection con, PreparedStatement stmt) {
        closeConnection(con);

        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao encerrar conexão: " + ex);
        }
    }

    //outra sobrecarga do metodo closeConnection
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        closeConnection(con, stmt);

        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao encerrar conexão: " + ex);
        }
    }
}
