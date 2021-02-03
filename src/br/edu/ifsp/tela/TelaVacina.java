package br.edu.ifsp.tela;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class TelaVacina extends javax.swing.JFrame {

    /**
     * Creates new form TelaVacina
     */
    public TelaVacina() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        try {
			areaCPFAplicarVacina = new javax.swing.JFormattedTextField(new MaskFormatter("###.###.###-##"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
        jLabel2 = new javax.swing.JLabel();
        lblNomeAplicarVacina = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        radioCriancaAplicarVacina = new javax.swing.JRadioButton();
        radioAdoslescenteAplicarVacina = new javax.swing.JRadioButton();
        raduiAdultoAplicarVacina = new javax.swing.JRadioButton();
        radioIdosoAplicarVacina = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        radioHomemAplicarVacina = new javax.swing.JRadioButton();
        radioMulherAplicarVacina = new javax.swing.JRadioButton();
        checkGestanteAplicarVacina = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxImunobiologicoAplicarVacina = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnAplicarVacina = new javax.swing.JButton();
        btnLimparDadosAplicarVacina = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxUFAplicarVacina = new javax.swing.JComboBox<>();
        txtDataAplicarVacina = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnLimparTabelaAplicarVacina = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setText("CPF");

        areaCPFAplicarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaCPFAplicarVacinaActionPerformed(evt);
            }
        });

        jLabel2.setText("NOME");

        lblNomeAplicarVacina.setText("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        jLabel4.setText("FAIXA ETÁRIA");

        buttonGroup1.add(radioCriancaAplicarVacina);
        radioCriancaAplicarVacina.setSelected(true);
        radioCriancaAplicarVacina.setText("CRIANÇA");

        buttonGroup1.add(radioAdoslescenteAplicarVacina);
        radioAdoslescenteAplicarVacina.setText("ADOSLENCETE");

        buttonGroup1.add(raduiAdultoAplicarVacina);
        raduiAdultoAplicarVacina.setText("ADULTO");

        buttonGroup1.add(radioIdosoAplicarVacina);
        radioIdosoAplicarVacina.setText("IDOSO");

        jLabel5.setText("SEXO");

        buttonGroup2.add(radioHomemAplicarVacina);
        radioHomemAplicarVacina.setSelected(true);
        radioHomemAplicarVacina.setText("HOMEM");

        buttonGroup2.add(radioMulherAplicarVacina);
        radioMulherAplicarVacina.setText("MULHER");

        checkGestanteAplicarVacina.setText("GESTANTE");

        jLabel6.setText("IMUNOBIOLÓGICO");

        jComboBoxImunobiologicoAplicarVacina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FEBRE AMARELA", "HIV", "TETRA VIRAL", "HEPATITE A", "POLIOMELITE", "DENGUUE", "INFLUENZA", "MENINGOCÓCICA ACWY", "DTPA" }));

        jLabel7.setText("DATA-APLICAÇÃO");

        btnAplicarVacina.setText("APLICAR");
        btnAplicarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarVacinaActionPerformed(evt);
            }
        });

        btnLimparDadosAplicarVacina.setText("LIMPAR DADOS");
        btnLimparDadosAplicarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparDadosAplicarVacinaActionPerformed(evt);
            }
        });

        jLabel11.setText("UF-APLICAÇÃO");

        jComboBoxUFAplicarVacina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));

        txtDataAplicarVacina.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(areaCPFAplicarVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNomeAplicarVacina))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioCriancaAplicarVacina)
                            .addComponent(radioHomemAplicarVacina))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioAdoslescenteAplicarVacina)
                            .addComponent(radioMulherAplicarVacina))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(raduiAdultoAplicarVacina)
                                .addGap(18, 18, 18)
                                .addComponent(radioIdosoAplicarVacina))
                            .addComponent(checkGestanteAplicarVacina)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(107, 107, 107)
                            .addComponent(jComboBoxImunobiologicoAplicarVacina, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel11))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxUFAplicarVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDataAplicarVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(14, 14, 14))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAplicarVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparDadosAplicarVacina)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(areaCPFAplicarVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lblNomeAplicarVacina))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(radioCriancaAplicarVacina)
                    .addComponent(radioAdoslescenteAplicarVacina)
                    .addComponent(raduiAdultoAplicarVacina)
                    .addComponent(radioIdosoAplicarVacina))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(radioHomemAplicarVacina)
                    .addComponent(radioMulherAplicarVacina)
                    .addComponent(checkGestanteAplicarVacina))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxImunobiologicoAplicarVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDataAplicarVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparDadosAplicarVacina)
                    .addComponent(btnAplicarVacina)
                    .addComponent(jLabel11)
                    .addComponent(jComboBoxUFAplicarVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NOME", "CPF", "SEXO", "IMUNOBIOLÓGICO", "UF-APLICAÇÃO", "DATA DE APLICAÇÃO", "PRÓXIMA APLICAÇÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.addTab("APLICAÇÃO", jScrollPane1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NOME", "CPF", "SEXO", "IMUNOBIOLÓGICO", "UF-APLICAÇÃO", "DATA DE APLICAÇÃO", "PRÓXIMA APLICAÇÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTabbedPane1.addTab("HISTÓRICO DE VACINAÇÃO", jScrollPane2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        btnLimparTabelaAplicarVacina.setText("LIMPAR TABELAS");
        btnLimparTabelaAplicarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparTabelaAplicarVacinaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("APLICAR VACINA - SISTEMA DE VACINAÇÃO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(337, 337, 337))
            .addGroup(layout.createSequentialGroup()
                .addGap(408, 408, 408)
                .addComponent(btnLimparTabelaAplicarVacina)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparTabelaAplicarVacina)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areaCPFAplicarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaCPFAplicarVacinaActionPerformed
        // DESENVOLVER LÓGICA AQUI!!
    }//GEN-LAST:event_areaCPFAplicarVacinaActionPerformed

    private void btnAplicarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarVacinaActionPerformed
               // DESENVOLVER LÓGICA AQUI!!

    }//GEN-LAST:event_btnAplicarVacinaActionPerformed

    private void btnLimparDadosAplicarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparDadosAplicarVacinaActionPerformed
               // DESENVOLVER LÓGICA AQUI!!

    }//GEN-LAST:event_btnLimparDadosAplicarVacinaActionPerformed

    private void btnLimparTabelaAplicarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTabelaAplicarVacinaActionPerformed
                // DESENVOLVER LÓGICA AQUI!!

    }//GEN-LAST:event_btnLimparTabelaAplicarVacinaActionPerformed
 
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
            java.util.logging.Logger.getLogger(TelaVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVacina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField areaCPFAplicarVacina;
    private javax.swing.JButton btnAplicarVacina;
    private javax.swing.JButton btnLimparDadosAplicarVacina;
    private javax.swing.JButton btnLimparTabelaAplicarVacina;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox checkGestanteAplicarVacina;
    private javax.swing.JComboBox<String> jComboBoxImunobiologicoAplicarVacina;
    private javax.swing.JComboBox<String> jComboBoxUFAplicarVacina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblNomeAplicarVacina;
    private javax.swing.JRadioButton radioAdoslescenteAplicarVacina;
    private javax.swing.JRadioButton radioCriancaAplicarVacina;
    private javax.swing.JRadioButton radioHomemAplicarVacina;
    private javax.swing.JRadioButton radioIdosoAplicarVacina;
    private javax.swing.JRadioButton radioMulherAplicarVacina;
    private javax.swing.JRadioButton raduiAdultoAplicarVacina;
    private javax.swing.JSpinner txtDataAplicarVacina;
    // End of variables declaration//GEN-END:variables
}
