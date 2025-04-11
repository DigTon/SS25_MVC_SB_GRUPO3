package com.grupo3.projeto.ss25_mvc_sb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.grupo3.projeto.ss25_mvc_sb.models.Usuario;

public class UsuarioDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/banco1";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    public void addUsuario(String user, String password) {
        String sql = "INSERT INTO usuario (user, password) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user);
            pstmt.setString(2, password);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Usuario> listarUsuarios() {
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuario";

        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {
                Long id = rs.getLong("id");
                String user = rs.getString("user");
                String password = rs.getString("password");
                lista.add(new Usuario(id, user, password));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}