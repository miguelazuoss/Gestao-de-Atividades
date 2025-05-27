/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Telas.Aviso;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class ConexaoBanco {
    Aviso aviso = new Aviso();
    public Connection getConexao() {
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gestaoatividades", "root", "senai");
        } catch (Exception e) {
            aviso.MensagemErro("Erro de conexão com o banco!");
            return null;

        }
    }
}