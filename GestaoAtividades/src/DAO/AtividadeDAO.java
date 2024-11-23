/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.Atividade;
import Models.StatusType;
import Telas.Aviso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AtividadeDAO {

    Aviso aviso = new Aviso();
    private Connection con;
    ResultSet rs;
    PreparedStatement pstm;

    public AtividadeDAO() {
        this.con = new ConexaoBanco().getConexao();
    }

    public void cadastrarAtividade(Atividade ativ) {
        String sql = "insert into atividade(usuario_codigo,nome,obj,dificuldade,status,prazo,data_criacao) values(?,?,?,?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, ativ.getUsuario_codigo());
            ps.setString(2, ativ.getNome());
            ps.setString(3, ativ.getObj());
            ps.setString(4, ativ.getDificuldade());
            ps.setString(5, ativ.getStatus().toString());
            ps.setInt(6, ativ.getPrazo());
            ps.setDate(7, java.sql.Date.valueOf(ativ.getData_criacao()));
            ps.execute();
            ps.close();
            aviso.MensagemSucesso("Atividade " + ativ.getNome() + " cadastrada com sucesso!");
        } catch (Exception e) {
            aviso.MensagemErro("Erro ao cadastrar Atividade! " + e);
        }
    }

    // Achar todos os carros!!!    
    public ArrayList<Atividade> getAtividades(Integer usuarioCodigo) {
        String sql = "select * from atividade where usuario_codigo=?";
        ArrayList<Atividade> atividades = new ArrayList<>();
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, usuarioCodigo);
            ResultSet rs = ps.executeQuery(); 
           
            while (rs.next()) {
                if (atividades == null) {
                    atividades = new ArrayList<>();
                }
                String statusString = rs.getString("status");
                StatusType status = StatusType.valueOf(statusString);
                Atividade atividade = new Atividade(rs.getInt("codigo"),
                        rs.getInt("usuario_codigo"),
                        rs.getInt("prazo"),
                        rs.getString("nome"),
                        rs.getString("obj"),
                        rs.getString("andamento") != null ? rs.getString("andamento") : null,
                        rs.getString("dificuldade"),
                        status,
                        rs.getDate("data_criacao") != null ? rs.getDate("data_criacao").toLocalDate() : null,
                        rs.getDate("data_finalizacao") != null ? rs.getDate("data_finalizacao").toLocalDate() : null);
                   
                atividades.add(atividade);
            }
            return atividades;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
