/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import DAO.AtividadeDAO;
import Models.Atividade;
import Models.StatusType;
import Models.Usuario;
import java.awt.Color;
import java.awt.Dimension;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author miguel_a_andrade
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    Usuario usuarioLogado;
    AtividadeDAO atividadeDAO = new AtividadeDAO();
    String filtroCard = "";
    String filtro = "";
    String filtroSearch = "";
    String stringFiltroCombo = "";
    Aviso aviso = new Aviso();
ArrayList<Atividade> listaAtividade;
    public Principal(Usuario usuario) {
        usuarioLogado = usuario;
        initComponents();
        carregarElementos();
        listaAtividade = atividadeDAO.getAtividades(usuarioLogado.getCodigo(), filtro, filtroSearch, stringFiltroCombo);
        atualizarLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        panelBorderWithRadius = new Components.PanelBorder();
        jbtExit = new javax.swing.JButton();
        jbtMinimize = new javax.swing.JButton();
        cardButtonPendentes = new Components.CardButton();
        cardButtonAndamento = new Components.CardButton();
        cardButtonConcluida = new Components.CardButton();
        jlBemVindo = new javax.swing.JLabel();
        jbtAccount = new javax.swing.JButton();
        buttonPersonalizadoLimpar = new Components.ButtonPersonalizado();
        buttonPersonalizadoOrdPrazo = new Components.ButtonPersonalizado();
        buttonPersonalizadoOrdDif = new Components.ButtonPersonalizado();
        jtfSearchBar = new javax.swing.JTextField();
        jcbFiltro = new javax.swing.JComboBox<>();
        jbtSearch = new javax.swing.JButton();
        jspTable = new javax.swing.JScrollPane();
        tablePersonalizadoAtividades = new Components.TablePersonalizado();
        menuPrincipal1 = new Components.MenuPrincipal(this, usuarioLogado);

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorderWithRadius.setBackground(new java.awt.Color(250, 250, 250));

        jbtExit.setBackground(new java.awt.Color(250, 250, 250));
        jbtExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/IconClose.png"))); // NOI18N
        jbtExit.setBorder(null);
        jbtExit.setContentAreaFilled(false);
        jbtExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtExitmouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtExitmouseExited(evt);
            }
        });
        jbtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExitActionPerformed(evt);
            }
        });

        jbtMinimize.setBackground(new java.awt.Color(250, 250, 250));
        jbtMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Minimize.png"))); // NOI18N
        jbtMinimize.setBorder(null);
        jbtMinimize.setContentAreaFilled(false);
        jbtMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtMinimizemouseMinimizeEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtMinimizemouseMinimizeExited(evt);
            }
        });
        jbtMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMinimizeActionPerformed(evt);
            }
        });

        cardButtonPendentes.setColor(new java.awt.Color(255, 153, 153));
        cardButtonPendentes.setColorClick(new java.awt.Color(255, 204, 102));
        cardButtonPendentes.setGradient(true);
        cardButtonPendentes.setGradientFinalColor(new java.awt.Color(243, 115, 53));
        cardButtonPendentes.setGradientFinalColorHover(new java.awt.Color(231, 103, 0));
        cardButtonPendentes.setGradientStartColor(new java.awt.Color(253, 200, 48));
        cardButtonPendentes.setGradientStartColorHover(new java.awt.Color(253, 170, 97));
        cardButtonPendentes.setRadius(15);
        cardButtonPendentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardButtonPendentesMouseClicked(evt);
            }
        });

        cardButtonAndamento.setColor(new java.awt.Color(0, 143, 249));
        cardButtonAndamento.setColorClick(new java.awt.Color(102, 255, 255));
        cardButtonAndamento.setGradient(true);
        cardButtonAndamento.setGradientFinalColor(new java.awt.Color(0, 131, 176));
        cardButtonAndamento.setGradientFinalColorHover(new java.awt.Color(0, 161, 220));
        cardButtonAndamento.setGradientStartColor(new java.awt.Color(0, 180, 219));
        cardButtonAndamento.setGradientStartColorHover(new java.awt.Color(0, 215, 246));
        cardButtonAndamento.setRadius(15);
        cardButtonAndamento.setValorTituloCard1("Atividades em andamento");
        cardButtonAndamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardButtonAndamentoMouseClicked(evt);
            }
        });

        cardButtonConcluida.setBackground(new java.awt.Color(250, 250, 250));
        cardButtonConcluida.setColorClick(new java.awt.Color(51, 255, 153));
        cardButtonConcluida.setGradient(true);
        cardButtonConcluida.setGradientFinalColor(new java.awt.Color(17, 153, 142));
        cardButtonConcluida.setGradientFinalColorHover(new java.awt.Color(17, 207, 168));
        cardButtonConcluida.setGradientStartColor(new java.awt.Color(56, 239, 125));
        cardButtonConcluida.setGradientStartColorHover(new java.awt.Color(56, 235, 189));
        cardButtonConcluida.setRadius(15);
        cardButtonConcluida.setValorTituloCard1("Atividades concluídas");
        cardButtonConcluida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardButtonConcluidaMouseClicked(evt);
            }
        });

        jlBemVindo.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jlBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlBemVindo.setText("Bem vindo (Usuario)!");

        jbtAccount.setBackground(new java.awt.Color(250, 250, 250));
        jbtAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Account.png"))); // NOI18N
        jbtAccount.setBorder(null);
        jbtAccount.setBorderPainted(false);
        jbtAccount.setContentAreaFilled(false);
        jbtAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseAccountEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseAccountExited(evt);
            }
        });
        jbtAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAccountActionPerformed(evt);
            }
        });

        buttonPersonalizadoLimpar.setForeground(new java.awt.Color(255, 255, 255));
        buttonPersonalizadoLimpar.setText("Limpar filtro");
        buttonPersonalizadoLimpar.setBorderPainted(false);
        buttonPersonalizadoLimpar.setColor(new java.awt.Color(0, 0, 0));
        buttonPersonalizadoLimpar.setColorClick(new java.awt.Color(153, 153, 153));
        buttonPersonalizadoLimpar.setColorOver(new java.awt.Color(102, 102, 102));
        buttonPersonalizadoLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonPersonalizadoLimpar.setRadius(15);
        buttonPersonalizadoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPersonalizadoLimparActionPerformed(evt);
            }
        });

        buttonPersonalizadoOrdPrazo.setForeground(new java.awt.Color(255, 255, 255));
        buttonPersonalizadoOrdPrazo.setText("Ordenar por Prazo");
        buttonPersonalizadoOrdPrazo.setBorderPainted(false);
        buttonPersonalizadoOrdPrazo.setColor(new java.awt.Color(0, 0, 0));
        buttonPersonalizadoOrdPrazo.setColorClick(new java.awt.Color(153, 153, 153));
        buttonPersonalizadoOrdPrazo.setColorOver(new java.awt.Color(102, 102, 102));
        buttonPersonalizadoOrdPrazo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonPersonalizadoOrdPrazo.setRadius(15);
        buttonPersonalizadoOrdPrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPersonalizadoOrdPrazoActionPerformed(evt);
            }
        });

        buttonPersonalizadoOrdDif.setForeground(new java.awt.Color(255, 255, 255));
        buttonPersonalizadoOrdDif.setText("Ordenar por dificuldade");
        buttonPersonalizadoOrdDif.setBorderPainted(false);
        buttonPersonalizadoOrdDif.setColor(new java.awt.Color(0, 0, 0));
        buttonPersonalizadoOrdDif.setColorClick(new java.awt.Color(153, 153, 153));
        buttonPersonalizadoOrdDif.setColorOver(new java.awt.Color(102, 102, 102));
        buttonPersonalizadoOrdDif.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonPersonalizadoOrdDif.setRadius(15);
        buttonPersonalizadoOrdDif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPersonalizadoOrdDifActionPerformed(evt);
            }
        });

        jtfSearchBar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jtfSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSearchBarActionPerformed(evt);
            }
        });

        jcbFiltro.setBackground(Color.WHITE);
        jcbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome" }));
        jcbFiltro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        jcbFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFiltroActionPerformed(evt);
            }
        });

        jbtSearch.setBackground(new java.awt.Color(250, 250, 250));
        jbtSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Search.png"))); // NOI18N
        jbtSearch.setBorderPainted(false);
        jbtSearch.setContentAreaFilled(false);
        jbtSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtSearchMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbtSearchMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbtSearchMouseReleased(evt);
            }
        });
        jbtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSearchActionPerformed(evt);
            }
        });

        jspTable.getVerticalScrollBar().setPreferredSize(new Dimension(2, 2));
        jspTable.setBackground(new java.awt.Color(250, 250, 250));
        jspTable.setBorder(null);
        jspTable.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jspTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tablePersonalizadoAtividades.setBackground(new java.awt.Color(235, 235, 235));
        tablePersonalizadoAtividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Ultimo andamento", "Dificuldade", "Data Criação", "Data Finalização", "Prazo (Dias)", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePersonalizadoAtividades.setColumnSelectionAllowed(true);
        tablePersonalizadoAtividades.setGridColor(new java.awt.Color(204, 204, 204));
        tablePersonalizadoAtividades.setShowGrid(false);
        tablePersonalizadoAtividades.setShowHorizontalLines(true);
        tablePersonalizadoAtividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePersonalizadoAtividadesMouseClicked(evt);
            }
        });
        jspTable.setViewportView(tablePersonalizadoAtividades);
        tablePersonalizadoAtividades.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tablePersonalizadoAtividades.getColumnModel().getColumnCount() > 0) {
            tablePersonalizadoAtividades.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablePersonalizadoAtividades.getColumnModel().getColumn(0).setMaxWidth(40);
            tablePersonalizadoAtividades.getColumnModel().getColumn(1).setPreferredWidth(120);
            tablePersonalizadoAtividades.getColumnModel().getColumn(2).setPreferredWidth(220);
            tablePersonalizadoAtividades.getColumnModel().getColumn(3).setPreferredWidth(80);
            tablePersonalizadoAtividades.getColumnModel().getColumn(4).setMinWidth(80);
            tablePersonalizadoAtividades.getColumnModel().getColumn(6).setMinWidth(80);
            tablePersonalizadoAtividades.getColumnModel().getColumn(6).setPreferredWidth(80);
            tablePersonalizadoAtividades.getColumnModel().getColumn(6).setMaxWidth(80);
            tablePersonalizadoAtividades.getColumnModel().getColumn(7).setMinWidth(130);
            tablePersonalizadoAtividades.getColumnModel().getColumn(7).setPreferredWidth(130);
            tablePersonalizadoAtividades.getColumnModel().getColumn(7).setMaxWidth(130);
        }

        javax.swing.GroupLayout panelBorderWithRadiusLayout = new javax.swing.GroupLayout(panelBorderWithRadius);
        panelBorderWithRadius.setLayout(panelBorderWithRadiusLayout);
        panelBorderWithRadiusLayout.setHorizontalGroup(
            panelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderWithRadiusLayout.createSequentialGroup()
                .addComponent(menuPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorderWithRadiusLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jbtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jbtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorderWithRadiusLayout.createSequentialGroup()
                        .addGroup(panelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBorderWithRadiusLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonPersonalizadoOrdDif, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonPersonalizadoOrdPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonPersonalizadoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorderWithRadiusLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(cardButtonPendentes, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(cardButtonAndamento, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cardButtonConcluida, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addGap(18, 18, 18))
                    .addGroup(panelBorderWithRadiusLayout.createSequentialGroup()
                        .addGroup(panelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorderWithRadiusLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jspTable, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorderWithRadiusLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jcbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBorderWithRadiusLayout.setVerticalGroup(
            panelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderWithRadiusLayout.createSequentialGroup()
                .addGroup(panelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorderWithRadiusLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jbtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtAccount)
                    .addGroup(panelBorderWithRadiusLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jlBemVindo)))
                .addGap(18, 18, 18)
                .addGroup(panelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorderWithRadiusLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(cardButtonConcluida, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cardButtonAndamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardButtonPendentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(panelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelBorderWithRadiusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPersonalizadoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPersonalizadoOrdPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPersonalizadoOrdDif, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jspTable, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
            .addComponent(menuPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorderWithRadius, javax.swing.GroupLayout.PREFERRED_SIZE, 1338, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorderWithRadius, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   private void carregarElementos() {
        cardButtonPendentes.setTemp1(cardButtonPendentes.getGradientStartColor());
        cardButtonPendentes.setTemp2(cardButtonPendentes.getGradientFinalColor());
        cardButtonAndamento.setTemp1(cardButtonAndamento.getGradientStartColor());
        cardButtonAndamento.setTemp2(cardButtonAndamento.getGradientFinalColor());
        cardButtonConcluida.setTemp1(cardButtonConcluida.getGradientStartColor());
        cardButtonConcluida.setTemp2(cardButtonConcluida.getGradientFinalColor());
        setBackground(new Color(0, 0, 0, 0));
        panelBorderWithRadius.initMoving(this);
        jlBemVindo.setText("Bem vindo " + usuarioLogado.getUser() + "!");
    }

    public void atualizarLista() {
        listaAtividade = atividadeDAO.getAtividades(usuarioLogado.getCodigo(), filtro, filtroSearch, stringFiltroCombo);
        calcularPrazosFinalizados(listaAtividade);
        getAtividades();
        atualizarContadores(listaAtividade);
    }

    private void jbtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSearchActionPerformed
        // TODO add your handling code here:
        Object selecionadoAtualFiltro = jcbFiltro.getSelectedItem();
        stringFiltroCombo = (String) selecionadoAtualFiltro;
        filtroSearch = jtfSearchBar.getText();
        getAtividades();
    }//GEN-LAST:event_jbtSearchActionPerformed

    private void jbtSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtSearchMouseReleased
        // TODO add your handling code here:
        jbtSearch.setIcon(new ImageIcon(getClass().getResource("/Icon/Search.png")));
    }//GEN-LAST:event_jbtSearchMouseReleased

    private void jbtSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtSearchMousePressed
        // TODO add your handling code here:
        jbtSearch.setIcon(new ImageIcon(getClass().getResource("/Icon/SearchClick.png")));
    }//GEN-LAST:event_jbtSearchMousePressed

    private void jbtSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtSearchMouseExited
        // TODO add your handling code here:
        jbtSearch.setIcon(new ImageIcon(getClass().getResource("/Icon/Search.png")));
    }//GEN-LAST:event_jbtSearchMouseExited

    private void jbtSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtSearchMouseEntered
        // TODO add your handling code here:
        jbtSearch.setIcon(new ImageIcon(getClass().getResource("/Icon/SearchHover.png")));
    }//GEN-LAST:event_jbtSearchMouseEntered

    private void jcbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbFiltroActionPerformed

    private void jtfSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSearchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSearchBarActionPerformed

    private void buttonPersonalizadoOrdDifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPersonalizadoOrdDifActionPerformed
        // TODO add your handling code here:
        if (filtro.equals("dificuldadeASC")) {
            filtro = "dificuldadeDSC";
        } else if (filtro.equals("dificuldadeDSC")) {
            filtro = "dificuldadeASC";
        } else {
            filtro = "dificuldadeASC";
        }
        getAtividades();
    }//GEN-LAST:event_buttonPersonalizadoOrdDifActionPerformed

    private void buttonPersonalizadoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPersonalizadoLimparActionPerformed
        // TODO add your handling code here:
        filtroCard = "";
        filtro = "";
        filtroSearch = "";
        jtfSearchBar.setText("");
        jcbFiltro.setSelectedIndex(0);
        getAtividades();
    }//GEN-LAST:event_buttonPersonalizadoLimparActionPerformed

    private void jbtAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAccountActionPerformed
        // TODO add your handling code here:
        Login telaLogin = new Login();
        this.dispose();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_jbtAccountActionPerformed

    private void mouseAccountExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseAccountExited
        // TODO add your handling code here:
        jbtAccount.setIcon(new ImageIcon(getClass().getResource("/Icon/Account.png")));
        jlBemVindo.setText("Bem vindo " + usuarioLogado.getUser() + "!");
        jlBemVindo.setForeground(Color.BLACK);
    }//GEN-LAST:event_mouseAccountExited

    private void mouseAccountEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseAccountEntered
        // TODO add your handling code here:
        jbtAccount.setIcon(new ImageIcon(getClass().getResource("/Icon/AccountHover.png")));
        Color corAzulHover = new Color(89, 133, 225);
        jlBemVindo.setText("Deslogar da conta: (" + usuarioLogado.getUser() + ")?");
        jlBemVindo.setForeground(corAzulHover);
    }//GEN-LAST:event_mouseAccountEntered

    private void jbtMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMinimizeActionPerformed
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jbtMinimizeActionPerformed

    private void jbtMinimizemouseMinimizeExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtMinimizemouseMinimizeExited
        // TODO add your handling code here:
        jbtMinimize.setIcon(new ImageIcon(getClass().getResource("/Icon/Minimize.png")));
    }//GEN-LAST:event_jbtMinimizemouseMinimizeExited

    private void jbtMinimizemouseMinimizeEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtMinimizemouseMinimizeEntered
        // TODO add your handling code here:
        jbtMinimize.setIcon(new ImageIcon(getClass().getResource("/Icon/MinimizeHover.png")));
    }//GEN-LAST:event_jbtMinimizemouseMinimizeEntered

    private void jbtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbtExitActionPerformed

    private void jbtExitmouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtExitmouseExited
        // TODO add your handling code here:
        jbtExit.setIcon(new ImageIcon(getClass().getResource("/Icon/IconClose.png")));
    }//GEN-LAST:event_jbtExitmouseExited

    private void jbtExitmouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtExitmouseEntered
        // TODO add your handling code here:
        jbtExit.setIcon(new ImageIcon(getClass().getResource("/Icon/IconCloseHover.png")));
    }//GEN-LAST:event_jbtExitmouseEntered

    private void cardButtonPendentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardButtonPendentesMouseClicked
        // TODO add your handling code here:
        filtroCard = "Pendente";
        getAtividades();
    }//GEN-LAST:event_cardButtonPendentesMouseClicked

    private void cardButtonAndamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardButtonAndamentoMouseClicked
        // TODO add your handling code here:
        filtroCard = "Fazendo";
        getAtividades();
    }//GEN-LAST:event_cardButtonAndamentoMouseClicked

    private void cardButtonConcluidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardButtonConcluidaMouseClicked
        // TODO add your handling code here:
        filtroCard = "Concluido";
        getAtividades();
    }//GEN-LAST:event_cardButtonConcluidaMouseClicked

    private void buttonPersonalizadoOrdPrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPersonalizadoOrdPrazoActionPerformed
        // TODO add your handling code here:
        if (filtro.equals("prazoASC")) {
            filtro = "prazoDSC";
        } else if (filtro.equals("prazoDSC")) {
            filtro = "prazoASC";
        } else {
            filtro = "prazoASC";
        }
        getAtividades();
    }//GEN-LAST:event_buttonPersonalizadoOrdPrazoActionPerformed

    private void tablePersonalizadoAtividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePersonalizadoAtividadesMouseClicked
        if (evt.getClickCount() == 2) { // Verifica se o clique foi duplo
            int linhaSelecionada = tablePersonalizadoAtividades.getSelectedRow(); // Obtém a linha selecionada

            if (linhaSelecionada != -1) { // Garante que há uma linha selecionada
                // Obtém o modelo da tabela
                DefaultTableModel model = (DefaultTableModel) tablePersonalizadoAtividades.getModel();

                // Captura o ID da atividade da coluna correspondente (assumindo que o ID está na coluna 0)
                int idAtividade = (int) model.getValueAt(linhaSelecionada, 0);

                // Chama o método editarAtividade passando o ID da atividade
                EditarAtividade telaEditar = new EditarAtividade(usuarioLogado, idAtividade);
                telaEditar.setVisible(true);
                this.dispose();
            } else {
                aviso.MensagemErro("Nenhuma linha selecionada!");
            }
        }
    }//GEN-LAST:event_tablePersonalizadoAtividadesMouseClicked

    private void getAtividades() {
        DefaultTableModel model = (DefaultTableModel) tablePersonalizadoAtividades.getModel();
        model.setRowCount(0);
        listaAtividade = atividadeDAO.getAtividades(usuarioLogado.getCodigo(), filtro, filtroSearch, stringFiltroCombo);
        for (Atividade atividadeE : listaAtividade) {
            String dataFormatadaFinal = formatarData(atividadeE.getData_finalizacao());
            String dataFormatada = formatarData(atividadeE.getData_criacao());
            long diasRestantes = calcularDiasPrazo(atividadeE);

            boolean adicionarLinha = filtroCard == null || filtroCard.isEmpty()
                    || atividadeE.getStatus().toString().equals(filtroCard);

            if (adicionarLinha) {
                adicionarAtividadeNaTabela(model, atividadeE, dataFormatada, dataFormatadaFinal, diasRestantes);
            }
        }
    }

    private String formatarData(LocalDate data) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return (data != null) ? data.format(formato) : "";
    }

    private void calcularPrazosFinalizados(ArrayList <Atividade> atividade){
        for (Atividade atividadeE : listaAtividade) {
        LocalDate dataFinal = atividadeE.getData_criacao().plusDays(atividadeE.getPrazo());
        LocalDate dataAgora = LocalDate.now();
        long dias = ChronoUnit.DAYS.between(dataAgora, dataFinal);
        if (dias <= 0 && atividadeE.getStatus() != StatusType.Concluido) {
            atividadeDAO.tempoEsgotado(usuarioLogado.getCodigo(), atividadeE.getCodigo());
            listaAtividade = atividadeDAO.getAtividades(usuarioLogado.getCodigo(), filtro, filtroSearch, stringFiltroCombo);
        }}
    }
    private long calcularDiasPrazo(Atividade atividade) {
        LocalDate dataFinal = atividade.getData_criacao().plusDays(atividade.getPrazo());
        LocalDate dataAgora = LocalDate.now();
        long dias = ChronoUnit.DAYS.between(dataAgora, dataFinal);
        return Math.max(dias, 0); // Garante que o valor não seja negativo
    }

    private void adicionarAtividadeNaTabela(DefaultTableModel model, Atividade atividade, String dataFormatada, String dataFormatadaFinal, long diasRestantes) {
        Object[] linha = {
            atividade.getCodigo(),
            atividade.getNome(),
            atividade.getAndamento(),
            atividade.getDificuldade(),
            dataFormatada,
            dataFormatadaFinal,
            diasRestantes,
            atividade.getStatus()
        };
        model.addRow(linha);
    }

    private void atualizarContadores(ArrayList<Atividade> listaAtividade) {
        int contadorPendente = 0, contadorAtivo = 0, contadorConcluido = 0;
        for (Atividade atividadeE : listaAtividade) {

            if (atividadeE.getStatus().toString().equals("Pendente")) {
                contadorPendente += 1;
            } else if (atividadeE.getStatus().toString().equals("Fazendo")) {
                contadorAtivo += 1;
            } else {
                contadorConcluido += 1;
            }
        }
        cardButtonPendentes.setValorTituloCard2(String.valueOf(contadorPendente));
        cardButtonAndamento.setValorTituloCard2(String.valueOf(contadorAtivo));
        cardButtonConcluida.setValorTituloCard2(String.valueOf(contadorConcluido));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.ButtonPersonalizado buttonPersonalizadoLimpar;
    private Components.ButtonPersonalizado buttonPersonalizadoOrdDif;
    private Components.ButtonPersonalizado buttonPersonalizadoOrdPrazo;
    private Components.CardButton cardButtonAndamento;
    private Components.CardButton cardButtonConcluida;
    private Components.CardButton cardButtonPendentes;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtAccount;
    private javax.swing.JButton jbtExit;
    private javax.swing.JButton jbtMinimize;
    private javax.swing.JButton jbtSearch;
    private javax.swing.JComboBox<String> jcbFiltro;
    private javax.swing.JLabel jlBemVindo;
    private javax.swing.JScrollPane jspTable;
    private javax.swing.JTextField jtfSearchBar;
    private Components.MenuPrincipal menuPrincipal1;
    private Components.PanelBorder panelBorderWithRadius;
    private Components.TablePersonalizado tablePersonalizadoAtividades;
    // End of variables declaration//GEN-END:variables
}
