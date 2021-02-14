package br.edu.ifsp.tela;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerDateModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import br.edu.ifsp.controller.UsuarioController;
import br.edu.ifsp.controller.VacinaUsuarioController;
import br.edu.ifsp.dao.UsuarioDAO;
import br.edu.ifsp.dao.VacinaUsuarioDAO;
import br.edu.ifsp.dto.VacinaDTO;
import br.edu.ifsp.modelo.Usuario;
import br.edu.ifsp.modelo.VacinaUsuario;

public class TelaVacina extends JFrame {
	private static final long serialVersionUID = 1L;
	Usuario u = new Usuario();
	VacinaUsuario vacinaUsuario = new VacinaUsuario();
	UsuarioController usuarioController = new UsuarioController();
	VacinaUsuarioController vacinaUsuarioController = new VacinaUsuarioController();
	DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/uuuu");
	
	private JFormattedTextField areaCPFAplicarVacina;
	private JButton btnAplicarVacina;
	private JButton btnLimparDadosAplicarVacina;
	private JComboBox<String> jComboBoxImunobiologicoAplicarVacina;
	private JComboBox<String> jComboBoxUFAplicarVacina;
	private JLabel jLabel1;
	private JLabel jLabel10;
	private JLabel jLabel11;
	private JLabel jLabel2;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JScrollPane jScrollPane1;
	private JTabbedPane jTabbedPane1;
	private JTable tabelaVacina;
	private JTable jTable2;
	private JLabel lblNomeAplicarVacina;
	private JSpinner txtDataAplicarVacina;
	private JSpinner txtProximaVacina2;
	private JSpinner txtNextVacina;
	private SpinnerDateModel modelDataAplicar;
	private SpinnerDateModel modelDataProxima;

	public TelaVacina() {
		initComponents();
	}

	@SuppressWarnings({ "unchecked", "serial" })
	private void initComponents() {

		jPanel1 = new JPanel();
		jLabel1 = new JLabel();
		try {
			areaCPFAplicarVacina = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		jLabel2 = new JLabel();
		lblNomeAplicarVacina = new JLabel();
		lblNomeAplicarVacina.setFont(new Font("Tahoma", Font.BOLD, 12));
		jLabel6 = new JLabel();
		jComboBoxImunobiologicoAplicarVacina = new JComboBox<>();
		jLabel7 = new JLabel();
		btnAplicarVacina = new JButton();
		btnLimparDadosAplicarVacina = new JButton();
		jLabel11 = new JLabel();
		jComboBoxUFAplicarVacina = new JComboBox<>();
		modelDataAplicar = new SpinnerDateModel(new Date(), new java.util.Date(-1577907720000L), new Date(),
				Calendar.DAY_OF_YEAR);
		txtDataAplicarVacina = new JSpinner();
		txtDataAplicarVacina.setModel(modelDataAplicar);
		txtDataAplicarVacina.setLocale(new Locale("pt", "BR"));
		txtDataAplicarVacina.setEditor(new JSpinner.DateEditor(txtDataAplicarVacina, "dd/MM/yyyy"));
		txtProximaVacina2 = new JSpinner();
		modelDataProxima = new SpinnerDateModel(new Date(), new java.util.Date(-1577907720000L), new Date(),
				Calendar.DAY_OF_YEAR);
		txtProximaVacina2.setLocale(new Locale("pt", "BR"));
		txtProximaVacina2.setModel(modelDataProxima);
		txtProximaVacina2.setEditor(new JSpinner.DateEditor(txtProximaVacina2, "dd/MM/yyyy"));
		jPanel2 = new JPanel();
		jTabbedPane1 = new JTabbedPane();
		jScrollPane1 = new JScrollPane();
		tabelaVacina = new JTable();
		jTable2 = new JTable();
		jLabel10 = new JLabel();

		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		jPanel1.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1, true));

		jLabel1.setText("CPF:");

		areaCPFAplicarVacina.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				areaCPFAplicarVacinaActionPerformed(evt);
			}
		});

		jLabel2.setText("NOME:");
		jLabel6.setText("IMUNOBIOLÓGICO:  ");
		jComboBoxImunobiologicoAplicarVacina
				.setModel(new DefaultComboBoxModel<>(new String[] { "FEBRE AMARELA", "HIV", "TETRA VIRAL",
						"HEPATITE A", "POLIOMELITE", "DENGUE", "INFLUENZA", "MENINGOCÓCICA ACWY", "DTPA" }));
		jLabel7.setText("DATA-APLICAÇÃO:");
		btnAplicarVacina.setText("APLICAR");
		btnAplicarVacina.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnAplicarVacinaActionPerformed(evt);
			}
		});

		btnLimparDadosAplicarVacina.setText("LIMPAR DADOS");
		btnLimparDadosAplicarVacina.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnLimparDadosAplicarVacinaActionPerformed(evt);
			}
		});

		jLabel11.setText("UF-APLICAÇÃO:");
		jComboBoxUFAplicarVacina.setModel(new DefaultComboBoxModel<>(
				new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR",
						"PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));
		JLabel jLabel8 = new JLabel("PROXIMA-APLICAÇÃO:");
		JButton btnBuscarCpf = new JButton("BUSCAR");

		btnBuscarCpf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String consutaCpf = areaCPFAplicarVacina.getText();
				u = usuarioController.consultarUsuarioCPF(consutaCpf);
				lblNomeAplicarVacina.setText(u.getNome());
				;

				listarValores();
			}

		});

		txtNextVacina = new JSpinner();
		txtNextVacina.setLocale(new Locale("pt", "BR"));
		SpinnerDateModel modelNext = new SpinnerDateModel(new Date(1612404000000L), null, null, Calendar.DAY_OF_YEAR);
		txtNextVacina.setModel(modelNext);
		txtNextVacina.setEditor((new JSpinner.DateEditor(txtProximaVacina2, "dd/MM/yyyy")));

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup()
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(0, 697, Short.MAX_VALUE)
								.addComponent(btnAplicarVacina, GroupLayout.PREFERRED_SIZE, 107,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnLimparDadosAplicarVacina))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(20)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel6)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(jComboBoxImunobiologicoAplicarVacina,
														GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel2).addGap(18)
												.addComponent(lblNomeAplicarVacina))
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(areaCPFAplicarVacina, GroupLayout.PREFERRED_SIZE, 123,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18).addComponent(btnBuscarCpf))
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel7).addGap(18)
												.addComponent(txtDataAplicarVacina, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGap(49).addComponent(jLabel8).addGap(18).addComponent(txtNextVacina,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel11)
												.addGap(32).addComponent(jComboBoxUFAplicarVacina,
														GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
								.addGap(411)))
				.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addGap(24)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel1)
						.addComponent(areaCPFAplicarVacina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBuscarCpf))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel2)
						.addComponent(lblNomeAplicarVacina))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel6).addComponent(
						jComboBoxImunobiologicoAplicarVacina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel7)
						.addComponent(jLabel8)
						.addComponent(txtDataAplicarVacina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNextVacina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel11).addComponent(
						jComboBoxUFAplicarVacina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE))
				.addGap(18).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLimparDadosAplicarVacina).addComponent(btnAplicarVacina))
				.addContainerGap()));
		jPanel1.setLayout(jPanel1Layout);

		jPanel2.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1, true));

		tabelaVacina.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null } },
				new String[] { "NOME", "SEXO", "IMUNOBIOLÓGICO", "UF-APLICAÇÃO", "DATA DE APLICAÇÃO",
						"PRÓXIMA APLICAÇÃO" }) {
			@SuppressWarnings("rawtypes")
			Class[] types = new Class[] { String.class, String.class, String.class, String.class, String.class,
					String.class, String.class };

			@SuppressWarnings("rawtypes")
			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});

		jScrollPane1.setViewportView(tabelaVacina);

		jTabbedPane1.addTab("HISTÓRICO VACINAÇÃO", jScrollPane1);

		jTable2.setModel(new DefaultTableModel(
				new Object[][] 
					{ 
						{ null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, 
						{ null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }
					}
				,
				new String[] { "NOME", "CPF", "SEXO", "IMUNOBIOLÓGICO", "UF-APLICAÇÃO", "DATA DE APLICAÇÃO",
						"PRÓXIMA APLICAÇÃO" }) {
			private static final long serialVersionUID = 1L;
			@SuppressWarnings("rawtypes")
			Class[] types = new Class[] { String.class, java.lang.Object.class, String.class, String.class,
					String.class, String.class, String.class };

			@SuppressWarnings("rawtypes")
			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});

		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(GroupLayout.Alignment.TRAILING,
						jPanel2Layout.createSequentialGroup()
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 1000,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jTabbedPane1,
						GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
						.addGap(0, 22, Short.MAX_VALUE)));

		jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel10.setForeground(new java.awt.Color(153, 153, 153));
		jLabel10.setText("APLICAR VACINA - SISTEMA DE VACINAÇÃO");

		GroupLayout layout = new GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jPanel2,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap())
				.addGroup(layout.createSequentialGroup().addContainerGap(343, Short.MAX_VALUE).addComponent(jLabel10)
						.addGap(337)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(10).addComponent(jLabel10).addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(18).addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGap(40)));
		getContentPane().setLayout(layout);

		pack();
	}
	
	private void areaCPFAplicarVacinaActionPerformed(ActionEvent evt) {
		// DESENVOLVER LÓGICA AQUI!!
	}

	private void btnAplicarVacinaActionPerformed(ActionEvent evt) {
		vacinaUsuario.setCpf(areaCPFAplicarVacina.getText());
		vacinaUsuario.setImunobiologico(jComboBoxImunobiologicoAplicarVacina.getSelectedItem().toString());

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		try {
			txtDataAplicarVacina.commitEdit();
			txtNextVacina.commitEdit();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String dataAplicacaoFormat = dateFormat.format((Date) txtDataAplicarVacina.getValue());
		vacinaUsuario.setDtaplicacao(LocalDate.parse(dataAplicacaoFormat, formato));
		String dataProxAplicacaoFormat = dateFormat.format((Date) txtNextVacina.getValue());
		vacinaUsuario.setDtproximaaplicacao(LocalDate.parse(dataProxAplicacaoFormat, formato));
		System.out.println(vacinaUsuario.getDtaplicacao());
		System.out.println(vacinaUsuario.getDtproximaaplicacao());
		vacinaUsuario.setUfaplicacao(jComboBoxUFAplicarVacina.getSelectedItem().toString());
		vacinaUsuarioController.aplicarVacinaUsuario(vacinaUsuario);
		
		listarValores();
	}

	private void listarValores() {
		try {
			DefaultTableModel model = (DefaultTableModel) tabelaVacina.getModel();
			model.setNumRows(0);
			ArrayList<VacinaDTO> lista = vacinaUsuarioController.pesquisarVacina(areaCPFAplicarVacina.getText());
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			for (int num = 0; num < lista.size(); num++) {
				model.addRow(new Object[] { lista.get(num).getNomeUsuario(), lista.get(num).getSexoUsuario(),
						lista.get(num).getImunobiologico(), lista.get(num).getUfaplicacao(),
						lista.get(num).getDtaplicacao().format(formato),
						lista.get(num).getDtproximaaplicacao().format(formato) });
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Listar valores" + erro);
		}
	}

	private void btnLimparDadosAplicarVacinaActionPerformed(ActionEvent evt) {
		limparCamposVacina();
	}

	public void limparCamposVacina() {
		areaCPFAplicarVacina.setText("");
		lblNomeAplicarVacina.setText("");
		((DefaultTableModel) tabelaVacina.getModel()).setRowCount(0);
	}

	public static void main(String args[]) {
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(TelaVacina.class.getName()).log(Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(TelaVacina.class.getName()).log(Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(TelaVacina.class.getName()).log(Level.SEVERE, null,
					ex);
		} catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(TelaVacina.class.getName()).log(Level.SEVERE, null,
					ex);
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaVacina().setVisible(true);
			}
		});
	}
}
