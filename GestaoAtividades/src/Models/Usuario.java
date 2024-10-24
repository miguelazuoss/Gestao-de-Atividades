/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author user
 */
public class Usuario {
    private int codigo;
    private String user, pass, email;
    
    public Usuario(){}
    
    public Usuario(Integer codigo, String user, String pass, String email){
       this.codigo = codigo;
       this.user = user;
       this.pass = pass;
       this.email = email;
    }
    
    public Usuario(String user, String pass, String email) {
        this.user = user;
        this.pass = pass;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
