/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;

/**
 *
 * @author miguel_a_andrade
 */
public class Atividade {
   private int codigo, usuario_codigo, prazo;
   private String nome, obj, andamento,dificuldade,status;
   private LocalDate data_criacao, data_finalizacao;
   
   public Atividade(){}

    public Atividade(int codigo, int usuario_codigo, int prazo, String nome, String obj, String andamento, String dificuldade, String status, LocalDate data_criacao, LocalDate data_finalizacao) {
        this.codigo = codigo;
        this.usuario_codigo = usuario_codigo;
        this.prazo = prazo;
        this.nome = nome;
        this.obj = obj;
        this.andamento = andamento;
        this.dificuldade = dificuldade;
        this.status = status;
        this.data_criacao = data_criacao;
        this.data_finalizacao = data_finalizacao;
    }

    public Atividade(int usuario_codigo, int prazo, String nome, String obj, String dificuldade, String status, LocalDate data_criacao) {
        this.usuario_codigo = usuario_codigo;
        this.prazo = prazo;
        this.nome = nome;
        this.obj = obj;
        this.dificuldade = dificuldade;
        this.status = status;
        this.data_criacao = data_criacao;
    }

    public Atividade(int usuario_codigo, int prazo, String nome, String obj, String andamento, String dificuldade, String status, LocalDate data_criacao) {
        this.usuario_codigo = usuario_codigo;
        this.prazo = prazo;
        this.nome = nome;
        this.obj = obj;
        this.andamento = andamento;
        this.dificuldade = dificuldade;
        this.status = status;
        this.data_criacao = data_criacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getUsuario_codigo() {
        return usuario_codigo;
    }

    public void setUsuario_codigo(int usuario_codigo) {
        this.usuario_codigo = usuario_codigo;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObj() {
        return obj;
    }

    public void setObj(String obj) {
        this.obj = obj;
    }

    public String getAndamento() {
        return andamento;
    }

    public void setAndamento(String andamento) {
        this.andamento = andamento;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(LocalDate data_criacao) {
        this.data_criacao = data_criacao;
    }

    public LocalDate getData_finalizacao() {
        return data_finalizacao;
    }

    public void setData_finalizacao(LocalDate data_finalizacao) {
        this.data_finalizacao = data_finalizacao;
    }
   
   
}
