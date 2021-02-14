package br.edu.ifsp.tela;

import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SpinnerDateModel;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import br.edu.ifsp.controller.UsuarioController;
import br.edu.ifsp.dao.UsuarioDAO;
import br.edu.ifsp.modelo.Usuario;

public class TelaCRUD extends JFrame {
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JFormattedTextField areaCPFAtualizar;
    private JFormattedTextField areaCPFCadastar;
    private JFormattedTextField areaCPFRemover;
    private JTextField areaNomeAtualizar;
    private JTextField areaNomeCadastar;
    private JButton btnAtualizar;
    private JButton btnCadastrarUsuario;
    private JButton btnConsultarCPFRemover;
    private JButton btnRemover;
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;
    private JComboBox<String> jComboBoxUFAtualizar;
    private JComboBox<String> jComboBoxUFCadastar;
    private JLabel jLabel1;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel64;
    private JLabel jLabel69;
    private JLabel jLabel7;
    private JPanel jPanel1;
    private JPanel jPanel12;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JScrollPane jScrollPane1;
    private JTabbedPane jTabbedAtualizar;
    private JLabel lblEstadoRemover;
    private JLabel lblFaixaRemover;
    private JLabel lblIdadeRemover;
    private JButton lblLimparCadastar;
    private JButton lblLimparRemover;
    private JLabel lblNomeRemover;
    private JLabel lblSexoRemover;
    private JButton limparAtualizar;
    private JPanel pnDadosRemover;
    private JPanel pnLista;
    private JRadioButton radioHomemAtualizar;
    private JRadioButton radioHomemCadastar;
    private JRadioButton radioMulherAtualizar;
    private JRadioButton radioMulherCadastar;
    private JTable tabelTodosUsuarios;
    private javax.swing.JSpinner txtDataAtualizar;
    private javax.swing.JSpinner txtDataCadastrar;
	private javax.swing.SpinnerDateModel modelAtualizar;
	private SpinnerDateModel modelCadastrar;

    Usuario u = new Usuario();
    UsuarioController usuarioController = new UsuarioController();
    DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/uuuu");
    Calendar c = Calendar.getInstance();

    public TelaCRUD() throws ParseException {
        initComponents();
        atualizarGrid();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() throws ParseException {

        jLabel2 = new JLabel();
        buttonGroup1 = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();
        jPanel2 = new JPanel();
        jTabbedAtualizar = new JTabbedPane();
        jPanel1 = new JPanel();
        jPanel7 = new JPanel();
        jLabel18 = new JLabel();
        jLabel19 = new JLabel();
        jLabel21 = new JLabel();
        jLabel22 = new JLabel();
        jLabel23 = new JLabel();
        jLabel24 = new JLabel();
        areaNomeCadastar = new JTextField();
        radioHomemCadastar = new JRadioButton();
        radioMulherCadastar = new JRadioButton();
        MaskFormatter maskCadastrar = new MaskFormatter("###.###.###-##");
		areaCPFCadastar = new JFormattedTextField(maskCadastrar);
        jComboBoxUFCadastar = new JComboBox<>();
        lblLimparCadastar = new JButton();
        btnCadastrarUsuario = new JButton();
        txtDataCadastrar = new JSpinner();
        jPanel12 = new JPanel();
        jLabel64 = new JLabel();
        btnRemover = new JButton();
        lblLimparRemover = new JButton();
        MaskFormatter maskRemover = new MaskFormatter("###.###.###-##");
        areaCPFRemover = new JFormattedTextField(maskRemover);
        jLabel69 = new JLabel();
        pnDadosRemover = new JPanel();
        jLabel1 = new JLabel();
        jLabel4 = new JLabel();
        lblNomeRemover = new JLabel();
        lblFaixaRemover = new JLabel();
        jLabel5 = new JLabel();
        lblIdadeRemover = new JLabel();
        jLabel6 = new JLabel();
        lblSexoRemover = new JLabel();
        jLabel7 = new JLabel();
        lblEstadoRemover = new JLabel();
        btnConsultarCPFRemover = new JButton();
        jPanel8 = new JPanel();
        jLabel27 = new JLabel();
        jLabel28 = new JLabel();
        jLabel30 = new JLabel();
        jLabel31 = new JLabel();
        jLabel32 = new JLabel();
        jLabel33 = new JLabel();
        areaNomeAtualizar = new JTextField();
        radioHomemAtualizar = new JRadioButton();
        radioMulherAtualizar = new JRadioButton();
        MaskFormatter maskAtualizar = new MaskFormatter("###.###.###-##");
        areaCPFAtualizar = new JFormattedTextField(maskAtualizar);
        jComboBoxUFAtualizar = new JComboBox<>();
        btnAtualizar = new JButton();
        limparAtualizar = new JButton();
        txtDataAtualizar = new JSpinner();
        jPanel3 = new JPanel();
        jLabel3 = new JLabel();
        pnLista = new JPanel();
        jScrollPane1 = new JScrollPane();
        tabelTodosUsuarios = new JTable();

        jLabel2.setText("jLabel2");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jPanel7.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel18.setText("NOME COMPLETO");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("CADASTRAR PACIENTE - SISTEMA DE VACINAÇÃO");

        jLabel21.setText("DATA DE NASCIMENTO");

        jLabel22.setText("SEXO");

        jLabel23.setText("CPF");

        jLabel24.setText("UF");

        buttonGroup1.add(radioHomemCadastar);
        radioHomemCadastar.setSelected(true);
        radioHomemCadastar.setText("HOMEM");

        buttonGroup1.add(radioMulherCadastar);
        radioMulherCadastar.setText("MULHER");

        areaCPFCadastar.setText(" ");

        jComboBoxUFCadastar.setModel(new DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));

        lblLimparCadastar.setText("LIMPAR");
        lblLimparCadastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblLimparCadastarActionPerformed(evt);
            }
        });

        btnCadastrarUsuario.setText("CADASTRAR");
        btnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuarioActionPerformed(evt);
            }
        });

        modelCadastrar = new SpinnerDateModel(new java.util.Date(), new java.util.Date(-1577907720000L), new java.util.Date(), java.util.Calendar.DAY_OF_YEAR);
		txtDataCadastrar.setModel(modelCadastrar);
        txtDataCadastrar.setEditor(new JSpinner.DateEditor(txtDataCadastrar, "dd/MM/yyyy"));

        GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24))
                                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addComponent(btnCadastrarUsuario, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblLimparCadastar, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxUFCadastar, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(areaCPFCadastar, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel22))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(areaNomeCadastar, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDataCadastrar, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(radioHomemCadastar)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioMulherCadastar)
                                        .addGap(18, 18, 18))))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel19)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(areaNomeCadastar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtDataCadastrar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(radioHomemCadastar, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioMulherCadastar))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(areaCPFCadastar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jComboBoxUFCadastar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarUsuario)
                    .addComponent(lblLimparCadastar))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedAtualizar.addTab("CADASTRAR", jPanel1);

        jPanel12.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(153, 153, 153));
        jLabel64.setText("REMOVER PACIENTE - SISTEMA DE VACINAÇÃO");

        btnRemover.setText("REMOVER");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        lblLimparRemover.setText("LIMPAR");
        lblLimparRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblLimparRemoverActionPerformed(evt);
            }
        });

        areaCPFRemover.setText(" ");

        jLabel69.setText("CPF");

        pnDadosRemover.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setText("NOME: ");

        jLabel4.setText("FAIXA");

        lblNomeRemover.setText("");

        lblFaixaRemover.setText("");

        jLabel5.setText("IDADE");

        lblIdadeRemover.setText("");

        jLabel6.setText("SEXO");

        lblSexoRemover.setText("");

        jLabel7.setText("UF");

        lblEstadoRemover.setText("");

        GroupLayout pnDadosRemoverLayout = new GroupLayout(pnDadosRemover);
        pnDadosRemover.setLayout(pnDadosRemoverLayout);
        pnDadosRemoverLayout.setHorizontalGroup(
            pnDadosRemoverLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, pnDadosRemoverLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnDadosRemoverLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(32, 32, 32)
                .addGroup(pnDadosRemoverLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdadeRemover)
                    .addComponent(lblNomeRemover, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFaixaRemover)
                    .addGroup(pnDadosRemoverLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblEstadoRemover, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSexoRemover, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
        );
        pnDadosRemoverLayout.setVerticalGroup(
            pnDadosRemoverLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosRemoverLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnDadosRemoverLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNomeRemover, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnDadosRemoverLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblIdadeRemover))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDadosRemoverLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblFaixaRemover))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDadosRemoverLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblSexoRemover))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDadosRemoverLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblEstadoRemover))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnConsultarCPFRemover.setText("CONSULTAR");
        btnConsultarCPFRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCPFRemoverActionPerformed(evt);
            }
        });

        GroupLayout jPanel12Layout = new GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel64))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel69)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(btnRemover, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblLimparRemover, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addComponent(pnDadosRemover, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(areaCPFRemover, GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(btnConsultarCPFRemover, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64)
                .addGap(32, 32, 32)
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(areaCPFRemover, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultarCPFRemover)
                .addGap(28, 28, 28)
                .addComponent(pnDadosRemover, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemover)
                    .addComponent(lblLimparRemover))
                .addGap(52, 52, 52))
        );

        jTabbedAtualizar.addTab("REMOVER", jPanel12);

        jPanel8.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel27.setText("NOME COMPLETO");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(153, 153, 153));
        jLabel28.setText("ATUALIZAR PACIENTE - SISTEMA DE VACINAÇÃO");

        jLabel30.setText("DATA DE NASCIMENTO");

        jLabel31.setText("SEXO");

        jLabel32.setText("CPF");

        jLabel33.setText("UF");

        buttonGroup2.add(radioHomemAtualizar);
        radioHomemAtualizar.setSelected(true);
        radioHomemAtualizar.setText("HOMEM");

        buttonGroup2.add(radioMulherAtualizar);
        radioMulherAtualizar.setText("MULHER");

        areaCPFAtualizar.setText(" ");

        jComboBoxUFAtualizar.setModel(new DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));

        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        limparAtualizar.setText("LIMPAR");
        limparAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparAtualizarActionPerformed(evt);
            }
        });
        modelAtualizar = new SpinnerDateModel(new Date(), new java.util.Date(-1577907720000L), new Date(), Calendar.DAY_OF_YEAR);
        txtDataAtualizar.setModel(modelAtualizar);
        txtDataAtualizar.setEditor(new JSpinner.DateEditor(txtDataAtualizar, "dd/MM/yyyy"));

        GroupLayout jPanel8Layout = new GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel33))
                                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(areaCPFAtualizar, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(radioHomemAtualizar)
                                                .addGap(22, 22, 22)
                                                .addComponent(radioMulherAtualizar)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addComponent(areaNomeAtualizar, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDataAtualizar, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jComboBoxUFAtualizar, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAtualizar, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(limparAtualizar, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel28)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addGap(19, 19, 19)
                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(areaCPFAtualizar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtDataAtualizar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(radioHomemAtualizar, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioMulherAtualizar)
                    .addComponent(jLabel31))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(areaNomeAtualizar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxUFAtualizar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(48, 48, 48)
                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar)
                    .addComponent(limparAtualizar))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedAtualizar.addTab("ATUALIZAR", jPanel8);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("LISTA DE USUARIOS");

        pnLista.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tabelTodosUsuarios.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "NOME", "CPF", "SEXO", "IDADE", "UF"
            }
        ) {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelTodosUsuarios);

        GroupLayout pnListaLayout = new GroupLayout(pnLista);
        pnLista.setLayout(pnListaLayout);
        pnListaLayout.setHorizontalGroup(
            pnListaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, pnListaLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 513, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnListaLayout.setVerticalGroup(
            pnListaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnListaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel3))
                    .addComponent(pnLista, GroupLayout.PREFERRED_SIZE, 527, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(pnLista, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedAtualizar.addTab("HISTÓRICO", jPanel3);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedAtualizar, GroupLayout.PREFERRED_SIZE, 541, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedAtualizar, GroupLayout.PREFERRED_SIZE, 417, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLimparCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblLimparCadastarActionPerformed
        areaCPFCadastar.setText(null);
        areaNomeCadastar.setText(null);
        jComboBoxUFCadastar.setSelectedIndex(0);

    }

    private void lblLimparRemoverActionPerformed(java.awt.event.ActionEvent evt) {
        areaCPFRemover.setText(null);
        lblNomeRemover.setText(null);
        lblFaixaRemover.setText(null);
        lblIdadeRemover.setText(null);
        lblSexoRemover.setText(null);
        lblEstadoRemover.setText(null);
    }

    public void atualizarGrid() {

        DefaultTableModel modelo = (DefaultTableModel) tabelTodosUsuarios.getModel();
        modelo.setNumRows(0);

        tabelTodosUsuarios.getColumnModel().getColumn(0);
        tabelTodosUsuarios.getColumnModel().getColumn(1);
        tabelTodosUsuarios.getColumnModel().getColumn(2);
        tabelTodosUsuarios.getColumnModel().getColumn(3);
        tabelTodosUsuarios.getColumnModel().getColumn(4);
        try {
            for (Usuario p : usuarioController.consultarTodos()) {
                modelo.addRow(new Object[]{
                    p.getNome(),
                    p.getCPF(),
                    p.getSexo(),
                    p.getIdade(),
                    p.getEstado(),});
            }
        } catch (Exception e) {
        }
    }

    private void btnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed
        String flagNome = areaNomeCadastar.getText();
        String flagCPF = areaCPFCadastar.getText();
        int flagIdade = 0;
        try {
			txtDataCadastrar.commitEdit();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		flagIdade = calcularIdade(modelCadastrar.getDate());
        String flagEstado = jComboBoxUFCadastar.getSelectedItem().toString();
        String flagSexo = "HOMEM";

        if (radioMulherCadastar.isSelected()) {
            flagSexo = "MULHER";
        }

        u.setNome(flagNome);
        u.setIdade(flagIdade);
        u.setSexo(flagSexo);
        u.setCPF(flagCPF);
        u.setEstado(flagEstado);

        usuarioController.cadastrarUsuario(u);
        atualizarGrid();
        limparCastrar();
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed

    
    private void limparCastrar() {
    	areaNomeCadastar.setText("");		
    	areaCPFCadastar.setText("");
    	txtDataCadastrar.setValue(new Date());
    	radioHomemCadastar.setSelected(true);
    	jComboBoxUFCadastar.setSelectedIndex(0);
	}

	private int calcularIdade(Date flagDataNascimento) {
    	Calendar agora = Calendar.getInstance();
    	agora.setTime(new Date());
    	Calendar nascimento = Calendar.getInstance();
    	nascimento.setTime(flagDataNascimento);
    	return agora.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR);
    }

	private void btnRemoverActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        String flagCPF = areaCPFRemover.getText();

        u.setCPF(flagCPF);
        usuarioController.removerUsuarioCPF(u);

        atualizarGrid();
        limparRemover();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnConsultarCPFRemoverActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnConsultarCPFRemoverActionPerformed
        String flagCPF = areaCPFRemover.getText();

        u = usuarioController.consultarUsuarioCPF(flagCPF);

        String faixa;
        int idade = u.getIdade();

        if (idade >= 0 && idade < 14) {
            faixa = "CRIANÇA";
        } else if (idade >= 14 && idade < 18) {
            faixa = "ADOLESCENTE";
        } else if (idade >= 18 && idade < 60) {
            faixa = "ADULTO";
        } else {
            faixa = "IDOSO";
        }

        lblNomeRemover.setText(u.getNome());
        lblIdadeRemover.setText("" + u.getIdade());
        lblSexoRemover.setText(u.getSexo());
        lblEstadoRemover.setText(u.getEstado());
        lblFaixaRemover.setText(faixa);
        atualizarGrid();
        if(u.getCPF() == null){
        	limparRemover();
        }
    }
    private void limparAtualizarActionPerformed(java.awt.event.ActionEvent evt) {

        areaCPFAtualizar.setText(null);
        areaCPFAtualizar.setText(null);
        areaNomeAtualizar.setText(null);
        jComboBoxUFAtualizar.setSelectedIndex(0);
    }

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {
        String flagNome = areaNomeAtualizar.getText();
        String flagCPF = areaCPFAtualizar.getText();
        try {
			txtDataAtualizar.commitEdit();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String flagEstado = jComboBoxUFAtualizar.getSelectedItem().toString();
        String flagSexo = "";
        int flagIdade = calcularIdade(modelAtualizar.getDate());

        if (radioMulherAtualizar.isSelected()) {
            flagSexo = "MULHER";
        } 
        
        if (radioHomemAtualizar.isSelected()) {
            flagSexo = "HOMEM";
        } 

        u.setNome(flagNome);
        u.setIdade(flagIdade);
        u.setSexo(flagSexo);
        u.setCPF(flagCPF);
        u.setEstado(flagEstado);

        usuarioController.updateUsuarioCPF(u);
        atualizarGrid();
    }
    
    public void limparRemover() {
        lblNomeRemover.setText("");
        lblFaixaRemover.setText("");
        lblIdadeRemover.setText("");
        lblSexoRemover.setText("");
        lblEstadoRemover.setText("");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new TelaCRUD().setVisible(true);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }


}
