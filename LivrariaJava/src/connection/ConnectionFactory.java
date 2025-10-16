/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author estevao locks
 */
public class ConnectionFactory {
    
    // Atributos (dados de conexao com o banco de dados)
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/livraria";
    private static final String USER = "root";
    private static final String PASS = "";
    
    // Metodos
    public static Connection getConnection() {
        
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: ", ex);
        }
        
    }// end getConnection method
    
    // Metodo para fechar conexao com banco
    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                // fecha secao
                con.close();
            }
        } catch (SQLException ex) {
            System.getLogger(ConnectionFactory.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }// end closeConnection method
    
    // Metodo para fechar parametro sql preparado
    public static void closeConnection(Connection con, PreparedStatement stmt) {
        // fecha secao com metodo anterior
        closeConnection(con);
        try {
            // fecha o stmt
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            System.getLogger(ConnectionFactory.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }// end closeConnection method
    
    // Metodo completo para fechar secao
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        // fecha secao e o stmt com metodo anterior
        closeConnection(con, stmt);
        try {
            // fecha o stmt
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            System.getLogger(ConnectionFactory.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }// end closeConnection method
    
}
