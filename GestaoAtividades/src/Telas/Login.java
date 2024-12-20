/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import DAO.UsuarioDAO;
import Models.Usuario;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class Login extends javax.swing.JFrame {

    Aviso aviso = new Aviso();
    Boolean visibility = false;
    UsuarioDAO usuarioDAO = new UsuarioDAO();

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0)); // Atribuindo o fundo para ser transparente ( para aparecer a borda arredondada )
        PanelBorderWithRadius.initMoving(this); // Atribuindo o frame no metodo para o a movimentação da tela
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        PanelBorderWithRadius = new Components.PanelBorder();
        jlTitulo = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jlSenha = new javax.swing.JLabel();
        jbtExit = new javax.swing.JButton();
        jpfSenha = new javax.swing.JPasswordField();
        jbtVisibility = new javax.swing.JButton();
        menuPadraoLogin = new Components.MenuPadrao();
        buttonPersonalizadoEntrar = new Components.ButtonPersonalizado();
        buttonPersonalizadoRedefinirSenha = new Components.ButtonPersonalizado();
        buttonPersonalizadoCadastrar = new Components.ButtonPersonalizado();
        jbtMinimize = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setText("Login");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        PanelBorderWithRadius.setBackground(new java.awt.Color(250, 250, 250));

        jlTitulo.setFont(new java.awt.Font("Segoe UI", 1, 35)); // NOI18N
        jlTitulo.setText("Login");

        jlUsuario.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jlUsuario.setText("Usuario:");

        jtfUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfUsuario.setForeground(new java.awt.Color(51, 51, 51));
        jtfUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });

        jlSenha.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jlSenha.setText("Senha:");

        jbtExit.setBackground(new java.awt.Color(250, 250, 250));
        jbtExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/IconClose.png"))); // NOI18N
        jbtExit.setBorder(null);
        jbtExit.setContentAreaFilled(false);
        jbtExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Login.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Login.this.mouseExited(evt);
            }
        });
        jbtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExitActionPerformed(evt);
            }
        });

        jpfSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jpfSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jbtVisibility.setBackground(new java.awt.Color(250, 250, 250));
        jbtVisibility.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/NoVisibility.png"))); // NOI18N
        jbtVisibility.setBorder(null);
        jbtVisibility.setContentAreaFilled(false);
        jbtVisibility.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtVisibility.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseVisibilityEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseVisibilityExited(evt);
            }
        });
        jbtVisibility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtVisibilityActionPerformed(evt);
            }
        });

        buttonPersonalizadoEntrar.setForeground(new java.awt.Color(255, 255, 255));
        buttonPersonalizadoEntrar.setText("Entrar");
        buttonPersonalizadoEntrar.setBorderColor(new java.awt.Color(250, 250, 250));
        buttonPersonalizadoEntrar.setBorderPainted(false);
        buttonPersonalizadoEntrar.setColor(new java.awt.Color(20, 208, 130));
        buttonPersonalizadoEntrar.setColorClick(new java.awt.Color(204, 255, 204));
        buttonPersonalizadoEntrar.setColorOver(new java.awt.Color(51, 255, 51));
        buttonPersonalizadoEntrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonPersonalizadoEntrar.setRadius(20);
        buttonPersonalizadoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPersonalizadoEntrarActionPerformed(evt);
            }
        });

        buttonPersonalizadoRedefinirSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        buttonPersonalizadoRedefinirSenha.setForeground(new java.awt.Color(255, 255, 255));
        buttonPersonalizadoRedefinirSenha.setText("Esqueceu a senha?");
        buttonPersonalizadoRedefinirSenha.setBorderColor(new java.awt.Color(250, 250, 250));
        buttonPersonalizadoRedefinirSenha.setBorderPainted(false);
        buttonPersonalizadoRedefinirSenha.setColor(new java.awt.Color(0, 0, 0));
        buttonPersonalizadoRedefinirSenha.setColorClick(new java.awt.Color(153, 153, 153));
        buttonPersonalizadoRedefinirSenha.setColorOver(new java.awt.Color(102, 102, 102));
        buttonPersonalizadoRedefinirSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonPersonalizadoRedefinirSenha.setRadius(15);
        buttonPersonalizadoRedefinirSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPersonalizadoRedefinirSenhaActionPerformed(evt);
            }
        });

        buttonPersonalizadoCadastrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        buttonPersonalizadoCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        buttonPersonalizadoCadastrar.setText("Cadastre-se");
        buttonPersonalizadoCadastrar.setBorderColor(new java.awt.Color(250, 250, 250));
        buttonPersonalizadoCadastrar.setBorderPainted(false);
        buttonPersonalizadoCadastrar.setColor(new java.awt.Color(0, 0, 0));
        buttonPersonalizadoCadastrar.setColorClick(new java.awt.Color(153, 153, 153));
        buttonPersonalizadoCadastrar.setColorOver(new java.awt.Color(102, 102, 102));
        buttonPersonalizadoCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonPersonalizadoCadastrar.setRadius(15);
        buttonPersonalizadoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPersonalizadoCadastrarActionPerformed(evt);
            }
        });

        jbtMinimize.setBackground(new java.awt.Color(250, 250, 250));
        jbtMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Minimize.png"))); // NOI18N
        jbtMinimize.setBorder(null);
        jbtMinimize.setContentAreaFilled(false);
        jbtMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseMinimizeEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseMinimizeExited(evt);
            }
        });
        jbtMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMinimizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBorderWithRadiusLayout = new javax.swing.GroupLayout(PanelBorderWithRadius);
        PanelBorderWithRadius.setLayout(PanelBorderWithRadiusLayout);
        PanelBorderWithRadiusLayout.setHorizontalGroup(
            PanelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBorderWithRadiusLayout.createSequentialGroup()
                .addComponent(menuPadraoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBorderWithRadiusLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(PanelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelBorderWithRadiusLayout.createSequentialGroup()
                                .addGroup(PanelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlUsuario)
                                    .addComponent(jlSenha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfUsuario)
                                    .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addComponent(jbtVisibility, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelBorderWithRadiusLayout.createSequentialGroup()
                                .addComponent(buttonPersonalizadoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(buttonPersonalizadoRedefinirSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(67, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBorderWithRadiusLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBorderWithRadiusLayout.createSequentialGroup()
                                .addComponent(buttonPersonalizadoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBorderWithRadiusLayout.createSequentialGroup()
                                .addComponent(jbtMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jbtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBorderWithRadiusLayout.createSequentialGroup()
                                .addComponent(jlTitulo)
                                .addGap(169, 169, 169))))))
        );
        PanelBorderWithRadiusLayout.setVerticalGroup(
            PanelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBorderWithRadiusLayout.createSequentialGroup()
                .addGroup(PanelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBorderWithRadiusLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelBorderWithRadiusLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jbtMinimize)))
                .addGap(169, 169, 169)
                .addComponent(jlTitulo)
                .addGap(18, 18, 18)
                .addGroup(PanelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUsuario))
                .addGap(18, 18, 18)
                .addGroup(PanelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBorderWithRadiusLayout.createSequentialGroup()
                        .addGroup(PanelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSenha)
                            .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(PanelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonPersonalizadoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonPersonalizadoRedefinirSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbtVisibility, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonPersonalizadoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelBorderWithRadiusLayout.createSequentialGroup()
                .addComponent(menuPadraoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelBorderWithRadius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelBorderWithRadius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbtExitActionPerformed

    private void mouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExited
        // TODO add your handling code here:
        jbtExit.setIcon(new ImageIcon(getClass().getResource("/Icon/IconClose.png")));
    }//GEN-LAST:event_mouseExited

    private void mouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEntered
        // TODO add your handling code here:
        jbtExit.setIcon(new ImageIcon(getClass().getResource("/Icon/IconCloseHover.png")));
    }//GEN-LAST:event_mouseEntered

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsuarioActionPerformed

    private void mouseVisibilityEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseVisibilityEntered
        // TODO add your handling code here:
        if (visibility == true) {
            jbtVisibility.setIcon(new ImageIcon(getClass().getResource("/Icon/VisibilityHover.png")));
        } else {
            jbtVisibility.setIcon(new ImageIcon(getClass().getResource("/Icon/NoVisibilityHover.png")));
        }
    }//GEN-LAST:event_mouseVisibilityEntered

    private void jbtVisibilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtVisibilityActionPerformed
        // TODO add your handling code here:
        if (visibility) {
            jpfSenha.setEchoChar('*');
            visibility = false;
        } else {
            jpfSenha.setEchoChar((char) 0);
            visibility = true;
        }
    }//GEN-LAST:event_jbtVisibilityActionPerformed

    private void mouseVisibilityExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseVisibilityExited
        if (visibility == true) {
            jbtVisibility.setIcon(new ImageIcon(getClass().getResource("/Icon/Visibility.png")));
        } else {
            jbtVisibility.setIcon(new ImageIcon(getClass().getResource("/Icon/NoVisibility.png")));
        }
    }//GEN-LAST:event_mouseVisibilityExited

    private void buttonPersonalizadoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPersonalizadoEntrarActionPerformed
// Verifica se o campo de usuário não está vazio nem nulo.
        if (!jtfUsuario.getText().isEmpty() && jtfUsuario.getText() != null) {

            // Verifica se o campo de senha contém algum valor (não está vazio).
            if (jpfSenha.getPassword().length > 0) {

                // Obtém o valor do usuário e remove espaços extras ao redor.
                String login = jtfUsuario.getText().trim();

                // Converte a senha (que está no formato char[]) para uma String.
                String senha = new String(jpfSenha.getPassword());

                // Tenta autenticar o usuário com as credenciais fornecidas.
                Usuario usuario = usuarioDAO.logarUsuario(login, senha);

                // Verifica se a autenticação foi bem-sucedida (usuario não é nulo).
                if (usuario != null) {
                    // Se o login for bem-sucedido, abre a tela principal e passa o objeto usuario.
                    Principal telaPrincipal = new Principal(usuario);
                    telaPrincipal.setVisible(true); // Exibe a tela principal.
                    dispose(); // Fecha a tela de login.
                }
            } else {
                // Se o campo senha estiver vazio, exibe uma mensagem de erro.
                aviso.MensagemErro("Senha está vazia!");
            }
        } else {
            // Se o campo usuário estiver vazio, exibe uma mensagem de erro.
            aviso.MensagemErro("Usuario está vazio!");
        }
    }//GEN-LAST:event_buttonPersonalizadoEntrarActionPerformed

    private void buttonPersonalizadoRedefinirSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPersonalizadoRedefinirSenhaActionPerformed
        // TODO add your handling code here:
        Redefinir telaRedefenir = new Redefinir();
        this.dispose();
        telaRedefenir.setVisible(true);
    }//GEN-LAST:event_buttonPersonalizadoRedefinirSenhaActionPerformed

    private void buttonPersonalizadoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPersonalizadoCadastrarActionPerformed
        // TODO add your handling code here:
        Cadastro telaCadastro = new Cadastro();
        this.dispose();
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_buttonPersonalizadoCadastrarActionPerformed

    private void mouseMinimizeEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMinimizeEntered
        // TODO add your handling code here:
        jbtMinimize.setIcon(new ImageIcon(getClass().getResource("/Icon/MinimizeHover.png")));
    }//GEN-LAST:event_mouseMinimizeEntered

    private void mouseMinimizeExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMinimizeExited
        // TODO add your handling code here:
        jbtMinimize.setIcon(new ImageIcon(getClass().getResource("/Icon/Minimize.png")));
    }//GEN-LAST:event_mouseMinimizeExited

    private void jbtMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMinimizeActionPerformed
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jbtMinimizeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.PanelBorder PanelBorderWithRadius;
    private Components.ButtonPersonalizado buttonPersonalizadoCadastrar;
    private Components.ButtonPersonalizado buttonPersonalizadoEntrar;
    private Components.ButtonPersonalizado buttonPersonalizadoRedefinirSenha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtExit;
    private javax.swing.JButton jbtMinimize;
    private javax.swing.JButton jbtVisibility;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfUsuario;
    private Components.MenuPadrao menuPadraoLogin;
    // End of variables declaration//GEN-END:variables
}
