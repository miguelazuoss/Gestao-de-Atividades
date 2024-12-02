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
import java.time.LocalDate;
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
            ps.setInt(1, usuarioCodigo); 
            ps.setInt(2, idAtividade);  

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

    public void editarAtividade(Atividade atividade) {
        // SQL para atualizar os dados da atividade
        String sql = "update atividade set nome = ?, obj = ?, andamento = ?, dificuldade = ?, status = ?, prazo = ?, data_finalizacao = ? where usuario_codigo = ? and codigo = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, atividade.getNome());
            ps.setString(2, atividade.getObj());
            ps.setString(3, atividade.getAndamento());
            ps.setString(4, atividade.getDificuldade());
            ps.setString(5, atividade.getStatus().toString());
            ps.setInt(6, atividade.getPrazo());

            if (atividade.getData_finalizacao() != null) {
                ps.setDate(7, java.sql.Date.valueOf(atividade.getData_finalizacao())); // Data de finalização
            } else {
                ps.setNull(7, java.sql.Types.DATE); // Define nulo caso não tenha finalização
            }

            ps.setInt(8, atividade.getUsuario_codigo());
            ps.setInt(9, atividade.getCodigo());

            // Executa o update
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                aviso.MensagemSucesso("Atividade " + atividade.getNome() + " atualizada com sucesso!");
            } else {
                aviso.MensagemErro("Nenhuma atividade encontrada para atualizar.");
            }
        } catch (Exception e) {
            aviso.MensagemErro("Erro ao atualizar atividade: " + e.getMessage());
        }
    }

    public Atividade atividadePorID(Integer usuarioCodigo, Integer idAtividade) {
        String sql = "select *, prazo - datediff(curdate(), data_criacao) as prazo_restante from atividade where usuario_codigo = ? and codigo = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, usuarioCodigo); // Define o código do usuário
            ps.setInt(2, idAtividade);  // Define o ID da atividade

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Converte o status de string para o enum StatusType
                String statusString = rs.getString("status");
                StatusType status = StatusType.valueOf(statusString);

                // Cria um novo objeto Atividade com os dados retornados
                return new Atividade(
                        rs.getInt("codigo"),
                        rs.getInt("usuario_codigo"),
                        rs.getInt("prazo_restante"),
                        rs.getString("nome"),
                        rs.getString("obj"),
                        rs.getString("andamento") != null ? rs.getString("andamento") : null,
                        rs.getString("dificuldade"),
                        status,
                        rs.getDate("data_criacao") != null ? rs.getDate("data_criacao").toLocalDate() : null,
                        rs.getDate("data_finalizacao") != null ? rs.getDate("data_finalizacao").toLocalDate() : null
                );
            } else {
                aviso.MensagemErro("Atividade com ID " + idAtividade + " não encontrada.");
                return null;
            }

        } catch (Exception e) {
            aviso.MensagemErro("Erro ao buscar atividade: " + e.getMessage());
            return null;
        }
    }

    public void tempoEsgotado(int usuarioCodigo, int idAtividade) {
        String sql = "UPDATE atividade SET status = ?, data_finalizacao = ? WHERE usuario_codigo = ? AND codigo = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, StatusType.Concluido.toString()); // Define o status como "Concluído"
            ps.setDate(2, java.sql.Date.valueOf(LocalDate.now())); // Adiciona a data atual como data de finalização
            ps.setInt(3, usuarioCodigo); // Código do usuário
            ps.setInt(4, idAtividade);  // ID da atividade

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                aviso.MensagemSucesso("Atividade com ID " + idAtividade + " foi dada como concluida pois o prazo chegou a 0!");
            } else {
                aviso.MensagemErro("Nenhuma atividade encontrada para concluir com o ID " + idAtividade);
            }

        } catch (Exception e) {
            aviso.MensagemErro("Erro ao atualizar a atividade para 'Concluído': " + e.getMessage());
        }
    }

    // Achar todos as Atividades com tabela de prazo_restante a mais!!!    
    public ArrayList<Atividade> getAtividades(Integer usuarioCodigo, String filtro, String filtroSearch, String stringFiltroCombo) {
        // Construção inicial da consulta SQL.
        StringBuilder sql = new StringBuilder();
        sql.append("select *, prazo - datediff(curdate(), data_criacao) as prazo_restante from atividade where usuario_codigo=?");

        // Se o filtro de pesquisa não estiver vazio, modifica a consulta para incluir o filtro.
        if (!filtroSearch.isEmpty()) {
            // Verifica se o filtro de pesquisa é por ID ou por nome.
            if (stringFiltroCombo.equals("ID")) {
                try {
                    // Tenta converter o filtro de pesquisa para um número, para pesquisa por ID.
                    int searchNumber = Integer.parseInt(filtroSearch);
                    sql.append(" and codigo=");
                    sql.append(searchNumber);
                } catch (NumberFormatException e) {
                    // Caso o valor não seja um número válido, exibe uma mensagem de erro.
                    aviso.MensagemErro("O valor da pesquisa do ID não é um número válido!");
                }
            } else {
                // Caso o filtro seja por nome, adiciona o filtro "like" na consulta SQL.
                sql.append(" and nome like '%");
                sql.append(filtroSearch);
                sql.append("%'");
            }
        }

        // Se o filtro de ordenação não estiver vazio, adiciona as cláusulas de ordenação.
        if (!filtro.isEmpty()) {
            // Verifica qual tipo de filtro de ordenação foi selecionado e ajusta a consulta.
            if (filtro.equals("dificuldadeASC")) {
                // Ordena pela dificuldade em ordem crescente.
                sql.append(" order by CASE dificuldade WHEN 'Fácil' THEN 1 WHEN 'Médio' THEN 2  WHEN 'Difícil' THEN 3 ELSE 4 END;");
            } else if (filtro.equals("dificuldadeDSC")) {
                // Ordena pela dificuldade em ordem decrescente.
                sql.append(" order by CASE dificuldade WHEN 'Fácil' THEN 3 WHEN 'Médio' THEN 2  WHEN 'Difícil' THEN 1 ELSE 4 END;");
            } else if (filtro.equals("prazoASC")) {
                // Ordena pela prazo restante em ordem crescente.
                sql.append(" order by prazo_restante asc;");
            } else if (filtro.equals("prazoDSC")) {
                // Ordena pela prazo restante em ordem decrescente.
                sql.append(" order by prazo_restante desc;");
            }
        }

        // Criação da lista de atividades que será retornada.
        ArrayList<Atividade> atividades = new ArrayList<>();
        try (PreparedStatement ps = con.prepareStatement(sql.toString())) {
            // Define o código do usuário na consulta SQL.
            ps.setInt(1, usuarioCodigo);

            // Executa a consulta e obtém o ResultSet com os resultados.
            ResultSet rs = ps.executeQuery();

            // Itera sobre os resultados da consulta e cria os objetos Atividade.
            while (rs.next()) {
                // Verifica se a lista de atividades está vazia e inicializa se necessário.
                if (atividades == null) {
                    atividades = new ArrayList<>();
                }

                // Recupera o status da atividade e converte para o tipo StatusType.
                String statusString = rs.getString("status");
                StatusType status = StatusType.valueOf(statusString);

                // Cria um objeto Atividade com os dados do ResultSet.
                Atividade atividade = new Atividade(
                        rs.getInt("codigo"),
                        rs.getInt("usuario_codigo"),
                        rs.getInt("prazo"),
                        rs.getString("nome"),
                        rs.getString("obj"),
                        rs.getString("andamento") != null ? rs.getString("andamento") : null,
                        rs.getString("dificuldade"),
                        status,
                        rs.getDate("data_criacao") != null ? rs.getDate("data_criacao").toLocalDate() : null,
                        rs.getDate("data_finalizacao") != null ? rs.getDate("data_finalizacao").toLocalDate() : null
                );

                // Adiciona a atividade à lista de atividades.
                atividades.add(atividade);
            }

            // Retorna a lista de atividades encontradas.
            return atividades;
        } catch (Exception e) {
            // Em caso de erro, lança uma exceção em tempo de execução.
            throw new RuntimeException(e);
        }
    }
}
