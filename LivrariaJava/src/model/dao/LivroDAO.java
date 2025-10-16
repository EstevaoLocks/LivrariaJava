/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

// Local
import connection.ConnectionFactory;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Livro;

/**
 *
 * @author estev
 */
public class LivroDAO {
    
    public void create(Livro l) {
        
        // Conecta com o banco chamando classe de conexao do projeto
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            // Prepara comando sql
            stmt = con.prepareStatement("INSERT INTO livro (nome, autor, num_paginas, id_genero) VALUES (?, ?, ?, ?,)");
            stmt.setString(1, l.getNome());
            stmt.setString(2, l.getAutor());
            stmt.setInt(3, l.getNumPaginas());
            stmt.setInt(4, l.getIdGenero());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
}
