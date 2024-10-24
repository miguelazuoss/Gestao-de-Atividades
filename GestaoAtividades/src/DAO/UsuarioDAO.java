/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.Usuario;
import Telas.Aviso;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.UIManager;

/**
 *
 * @author user
 */
public class UsuarioDAO {
    Aviso aviso = new Aviso();
    private Connection con;
    ResultSet rs;
    PreparedStatement pstm;

    public UsuarioDAO() {
        this.con = new ConexaoBanco().getConexao();
    }

    public Usuario logarUsuario(String usuarioText, String senhaText) {
        Usuario usuario = null;
        String sql = "select * from usuario where user=? and pass = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, usuarioText);
            ps.setString(2, senhaText);

            try (ResultSet rs = ps.executeQuery()) {
                // Verifica se encontrou algum registro
                if (rs.next()) {
                    usuario = new Usuario();
                    usuario.setUser(rs.getString("user"));
                    usuario.setPass(rs.getString("pass"));
                    usuario.setEmail(rs.getString("email"));
                    usuario.setCodigo(rs.getInt("codigo"));
                    aviso.MensagemSucesso("Logado com sucesso!");
                } else {
                    aviso.MensagemErro("Usuario ou senha incorretos!");
                }
            }
        } catch (Exception e) {
            // Aqui trata qualquer exceção não esperada
            aviso.MensagemErro("Erro: "+e);
        }

        return usuario; // Retorna null se não encontrar o usuário ou se ocorrer erro
    }
}
