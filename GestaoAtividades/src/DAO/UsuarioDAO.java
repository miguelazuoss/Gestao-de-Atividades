/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.Usuario;
import Telas.Aviso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

    public Boolean verificarEmail(String email) {
        String sqlSelect = "select * from usuario where email=?";
        try (PreparedStatement ps2 = con.prepareStatement(sqlSelect)) {
            ps2.setString(1, email);
            ResultSet rs = ps2.executeQuery();
            if (!rs.next()) {
                aviso.MensagemErro("E-mail não existente!");
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
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
    
    public void cadastrarUsuario(Usuario user){
        String sql = "insert into usuario(user,pass,email) values(?,?,?)";
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, user.getUser());
            ps.setString(2, user.getPass());
            ps.setString(3, user.getEmail());
            
            ps.execute();
            ps.close();
            aviso.MensagemSucesso("Usuario " + user.getUser() + " cadastrado com sucesso!");
        } catch (Exception e) {
            if(e.toString().equalsIgnoreCase("java.sql.SQLIntegrityConstraintViolationException: Duplicate entry 'miguel@hotmail.com' for key 'email'")){
            aviso.MensagemErro("E-mail já existente cadastrado!");
            } else{
                aviso.MensagemErro("Erro ao cadastrar usuario! " + e);
            }
        }
    }
    
    public void alterarSenha(String email,String pass) {
        if(verificarEmail(email) == true){
            String sql = "update usuario set pass=? where email=?";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, pass);
                ps.setString(2, email);
                ps.execute();
                ps.close();
                aviso.MensagemSucesso(" Senha redefinida com sucesso!");
            } catch (Exception e) {
                aviso.MensagemErro("Erro ao redefinir senha do usuario! " + e);
            }
        }
    }
}
