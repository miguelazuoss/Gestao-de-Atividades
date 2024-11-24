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
        String sql = "";
        if (ativ.getData_finalizacao() != null) {
            sql = "insert into atividade(usuario_codigo,nome,obj,dificuldade,status,prazo,data_criacao, data_finalizacao) values(?,?,?,?,?,?,?,?)";
        } else {
            sql = "insert into atividade(usuario_codigo,nome,obj,dificuldade,status,prazo,data_criacao) values(?,?,?,?,?,?,?)";
        }
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, ativ.getUsuario_codigo());
            ps.setString(2, ativ.getNome());
            ps.setString(3, ativ.getObj());
            ps.setString(4, ativ.getDificuldade());
            ps.setString(5, ativ.getStatus().toString());
            ps.setInt(6, ativ.getPrazo());
            ps.setDate(7, java.sql.Date.valueOf(ativ.getData_criacao()));
            if (ativ.getData_finalizacao() != null) {
                ps.setDate(8, java.sql.Date.valueOf(ativ.getData_finalizacao()));
            }
            ps.execute();
            ps.close();
            aviso.MensagemSucesso("Atividade " + ativ.getNome() + " cadastrada com sucesso!");
        } catch (Exception e) {
            aviso.MensagemErro("Erro ao cadastrar Atividade! " + e);
        }
    }

    public void excluirAtividade(Integer usuarioCodigo, Integer idAtividade) {
        String sql = "delete from atividade where usuario_codigo = ? and codigo= ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, usuarioCodigo); // Define o código do usuário
            ps.setInt(2, idAtividade);  // Define o ID da atividade a ser excluída

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                aviso.MensagemSucesso("Atividade com ID " + idAtividade + " excluída com sucesso!");
            } else {
                aviso.MensagemErro("Nenhuma atividade encontrada com o ID " + idAtividade + " para o usuário informado.");
            }

        } catch (Exception e) {
            aviso.MensagemErro("Erro ao excluir atividade: " + e.getMessage());
        }
    }

    // Achar todos as Atividades com tabela de prazo_restante a mais!!!    
    public ArrayList<Atividade> getAtividades(Integer usuarioCodigo, String filtro, String filtroSearch, String stringFiltroCombo) {
        StringBuilder sql = new StringBuilder();
        sql.append("select *, prazo - datediff(curdate(), data_criacao) as prazo_restante from atividade where usuario_codigo=?");

        if (!filtroSearch.isEmpty()) {
            if (stringFiltroCombo.equals("ID")) {
                try {
                    int searchNumber = Integer.parseInt(filtroSearch);
                    sql.append(" and codigo=");
                    sql.append(searchNumber);
                } catch (NumberFormatException e) {
                    aviso.MensagemErro("O valor da pesquisa do ID não é um número válido!");
                }
            } else {
                sql.append(" and nome like '%");
                sql.append(filtroSearch);
                sql.append("%'");
            }
        }
        if (!filtro.isEmpty()) {
            if (filtro.equals("dificuldadeASC")) {
                sql.append(" order by CASE dificuldade WHEN 'Fácil' THEN 1 WHEN 'Médio' THEN 2  WHEN 'Difícil' THEN 3 ELSE 4 END;");
            } else if (filtro.equals("dificuldadeDSC")) {
                sql.append(" order by CASE dificuldade WHEN 'Fácil' THEN 3 WHEN 'Médio' THEN 2  WHEN 'Difícil' THEN 1 ELSE 4 END;");
            } else if (filtro.equals("prazoASC")) {
                sql.append(" order by prazo_restante asc;");
            } else if (filtro.equals("prazoDSC")) {
                sql.append(" order by prazo_restante desc;");
            }
        }

        ArrayList<Atividade> atividades = new ArrayList<>();
        try (PreparedStatement ps = con.prepareStatement(sql.toString())) {
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
