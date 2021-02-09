package br.edu.ifsp.tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import br.edu.ifsp.dao.VacinaUsuarioDAO;
import br.edu.ifsp.dto.HistoricoRegiaoDTO;

public class TelaHistorico extends JFrame {
    private JButton btnListarHistorico;
    private JComboBox<String> jComboBoxImunobiologico;
    private JFrame jFrame1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JTable tabelaHistorico;
    private VacinaUsuarioDAO vacinaUsuarioDAO;
 
	private static final long serialVersionUID = 1L;
	public TelaHistorico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
    	vacinaUsuarioDAO = new VacinaUsuarioDAO();
        jFrame1 = new JFrame();
        jScrollPane1 = new JScrollPane();
        tabelaHistorico = new JTable();
        jLabel2 = new JLabel();
        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        jComboBoxImunobiologico = new JComboBox<>();
        btnListarHistorico = new JButton();

        GroupLayout jFrame1Layout = new GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tabelaHistorico.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "REGIÃO", "IMUNOBIOLÓGICO", "TOTAL"
            }
        ) 
        {
			private static final long serialVersionUID = 1L;
			@SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                String.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, String.class, Object.class
            };

            @SuppressWarnings("rawtypes")
			public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaHistorico);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("HISTÓRICO - SISTEMA DE VACINAÇÃO");

        jPanel2.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setText("LISTAR IMUNOBIOLÓGICO");

        jComboBoxImunobiologico.setModel(new DefaultComboBoxModel<>(new String[] { "TODOS", "CORONAVAC - Butantan", "FEBRE AMARELA", "HIV", "TETRA VIRAL", "HEPATITE A", "POLIOMELITE", "DENGUUE", "INFLUENZA", "MENINGOCÓCICA ACWY", "DTPA" }));

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxImunobiologico, 0, 176, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxImunobiologico, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        btnListarHistorico.setText("LISTAR");
        btnListarHistorico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnListarHistoricoActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnListarHistorico, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGap(481, 481, 481))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(500, 500, 500))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 1214, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarHistorico))
                .addContainerGap())
        );
        pack();
    }

    private void btnListarHistoricoActionPerformed(ActionEvent evt) {
    	String imunobiologico = jComboBoxImunobiologico.getSelectedItem().toString();
		ArrayList<HistoricoRegiaoDTO> historico = vacinaUsuarioDAO.listarHistorico(imunobiologico);
    	listarValores(historico);
    }

    private void listarValores(ArrayList<HistoricoRegiaoDTO> historico) {
    	try {
    		DefaultTableModel model = (DefaultTableModel) tabelaHistorico.getModel();
    		model.setRowCount(0);
    		for(int i = 0; i < historico.size(); i++) {
    			model.addRow(new Object[] {
    				historico.get(i).getRegiao(),
    				historico.get(i).getImunobiologico(),
    				historico.get(i).getTotal()
    			});
    		}
    	}catch (Exception e) {
    		e.printStackTrace();
		}
    	
	}

	public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHistorico().setVisible(true);
            }
        });
    }

}
