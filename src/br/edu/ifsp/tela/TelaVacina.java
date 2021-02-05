package br.edu.ifsp.tela;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.text.MaskFormatter;

import br.edu.ifsp.dao.UsuarioDAO;
import br.edu.ifsp.modelo.Usuario;
import br.edu.ifsp.modelo.VacinaDTO;
import br.edu.ifsp.modelo.VacinaUsuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Locale;
import java.awt.Font;

public class TelaVacina extends javax.swing.JFrame {
	
	 Usuario u = new Usuario();
	 VacinaUsuario vu = new VacinaUsuario();
	 UsuarioDAO ud = new UsuarioDAO();
	 DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/uuuu");
	 //Calendar c = Calendar.getInstance();

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
        lblNomeAplicarVacina.setFont(new Font("Tahoma", Font.BOLD, 12));
        jLabel6 = new javax.swing.JLabel();
        jComboBoxImunobiologicoAplicarVacina = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnAplicarVacina = new javax.swing.JButton();
        btnLimparDadosAplicarVacina = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxUFAplicarVacina = new javax.swing.JComboBox<>();
        txtDataAplicarVacina = new javax.swing.JSpinner();
        txtDataAplicarVacina.setLocale(new Locale("pt", "BR"));
        txtProximaVacina2 = new javax.swing.JSpinner();
        txtProximaVacina2.setLocale(new Locale("pt", "BR"));
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVacina = new javax.swing.JTable();
        //jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setText("CPF:");

        areaCPFAplicarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaCPFAplicarVacinaActionPerformed(evt);
            }
        });

        jLabel2.setText("NOME:");

        //lblNomeAplicarVacina.setText("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        

        jLabel6.setText("IMUNOBIOLÓGICO:  ");

        jComboBoxImunobiologicoAplicarVacina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FEBRE AMARELA", "HIV", "TETRA VIRAL", "HEPATITE A", "POLIOMELITE", "DENGUUE", "INFLUENZA", "MENINGOCÓCICA ACWY", "DTPA" }));

        jLabel7.setText("DATA-APLICAÇÃO:");

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

        jLabel11.setText("UF-APLICAÇÃO:");

        jComboBoxUFAplicarVacina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));

        txtDataAplicarVacina.setModel(new SpinnerDateModel(new Date(1612447200959L), null, null, Calendar.DAY_OF_YEAR));
        
        JLabel jLabel8 = new JLabel("PROXIMA-APLICAÇÃO:");
        
        JButton btnBuscarCpf = new JButton("BUSCAR");
        btnBuscarCpf.addActionListener(new ActionListener() {
        	
        	public void actionPerformed(ActionEvent e) {
        		       			
        			String consutaCpf = areaCPFAplicarVacina.getText();
        			u = ud.consultarUsuarioCPF(consutaCpf);
        			lblNomeAplicarVacina.setText(u.getNome());;
        			
        			ListarValores();
        		}
 
        });
        
        txtNextVacina = new JSpinner();
        txtNextVacina.setLocale(new Locale("pt", "BR"));
        txtNextVacina.setModel(new SpinnerDateModel(new Date(1612404000000L), null, null, Calendar.DAY_OF_YEAR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(0, 697, Short.MAX_VALUE)
        					.addComponent(btnAplicarVacina, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnLimparDadosAplicarVacina))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(20)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel6)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(jComboBoxImunobiologicoAplicarVacina, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel2)
        							.addGap(18)
        							.addComponent(lblNomeAplicarVacina))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel1)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(areaCPFAplicarVacina, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(btnBuscarCpf))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel7)
        							.addGap(18)
        							.addComponent(txtDataAplicarVacina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addGap(49)
        							.addComponent(jLabel8)
        							.addGap(18)
        							.addComponent(txtNextVacina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel11)
        							.addGap(32)
        							.addComponent(jComboBoxUFAplicarVacina, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
        					.addGap(411)))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(24)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(areaCPFAplicarVacina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnBuscarCpf))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(lblNomeAplicarVacina))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(jComboBoxImunobiologicoAplicarVacina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7)
        				.addComponent(jLabel8)
        				.addComponent(txtDataAplicarVacina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtNextVacina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel11)
        				.addComponent(jComboBoxUFAplicarVacina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnLimparDadosAplicarVacina)
        				.addComponent(btnAplicarVacina))
        			.addContainerGap())
        );
        jPanel1.setLayout(jPanel1Layout);

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tabelaVacina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NOME", "SEXO", "IMUNOBIOLÓGICO", "UF-APLICAÇÃO", "DATA DE APLICAÇÃO", "PRÓXIMA APLICAÇÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        
        
        jScrollPane1.setViewportView(tabelaVacina);

        jTabbedPane1.addTab("HISTÓRICO VACINAÇÃO", jScrollPane1);

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
        //jScrollPane2.setViewportView(jTable2);

        //jTabbedPane1.addTab("HISTÓRICO DE VACINAÇÃO", jScrollPane2);
        

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

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("APLICAR VACINA - SISTEMA DE VACINAÇÃO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(0, 0, Short.MAX_VALUE)
        					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(343, Short.MAX_VALUE)
        			.addComponent(jLabel10)
        			.addGap(337))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(10)
        			.addComponent(jLabel10)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGap(40))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areaCPFAplicarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaCPFAplicarVacinaActionPerformed
        // DESENVOLVER LÓGICA AQUI!!
    }//GEN-LAST:event_areaCPFAplicarVacinaActionPerformed

    private void btnAplicarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarVacinaActionPerformed
    	       vu.setCpf(areaCPFAplicarVacina.getText());
    	       vu.setImunobiologico(jComboBoxImunobiologicoAplicarVacina.getSelectedItem().toString());
    	       
    	       SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    	       DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    	       
    	       String dataAplicacaoFormat = dateFormat.format((Date)txtDataAplicarVacina.getValue());
    	       vu.setDtaplicacao(LocalDate.parse(dataAplicacaoFormat, formato));
    	       
    	       String dataProxAplicacaoFormat = dateFormat.format((Date)txtNextVacina.getValue());
    	       vu.setDtproximaaplicacao(LocalDate.parse(dataProxAplicacaoFormat, formato));
    	        
    	       System.out.println(vu.getDtaplicacao());
    	       System.out.println(vu.getDtproximaaplicacao());
    
    	       vu.setUfaplicacao(jComboBoxUFAplicarVacina.getSelectedItem().toString());
           		
               ud.aplicarVacinaUsuario(vu);
               ListarValores();
               

    }
    
	private void ListarValores() {

		try {
			
			VacinaUsuario vacinaUsuario = new VacinaUsuario();
			//vu.setCpf(areaCPFAplicarVacina.getText());
			
			DefaultTableModel model = (DefaultTableModel) tabelaVacina.getModel();
			model.setNumRows(0);
			
			VacinaDTO vacinadto = new VacinaDTO();
			
			ArrayList<VacinaDTO> lista = ud.PesquisarVacina(areaCPFAplicarVacina.getText());
			 DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			

			for(int num = 0; num < lista.size(); num ++ ) {
				
				model.addRow(new Object[] {
						//lista.get(num).getId(),
						lista.get(num).getNomeUsuario(),
						lista.get(num).getSexoUsuario(),
						lista.get(num).getImunobiologico(),
						lista.get(num).getUfaplicacao(),
						lista.get(num).getDtaplicacao().format(formato),
						lista.get(num).getDtproximaaplicacao().format(formato)
					
				});
			}
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Listar valores" + erro);
		}
	}

    private void btnLimparDadosAplicarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparDadosAplicarVacinaActionPerformed
               limparCamposVacina();
               
    }
    
    public void limparCamposVacina() {
    	
    	areaCPFAplicarVacina.setText("");
        lblNomeAplicarVacina.setText("");
        ((DefaultTableModel) tabelaVacina.getModel()).setRowCount(0);
    }
 
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> jComboBoxImunobiologicoAplicarVacina;
    private javax.swing.JComboBox<String> jComboBoxUFAplicarVacina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    //private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelaVacina;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblNomeAplicarVacina;
    private javax.swing.JSpinner txtDataAplicarVacina;
    private javax.swing.JSpinner txtProximaVacina2;
    private JSpinner txtNextVacina;
}
