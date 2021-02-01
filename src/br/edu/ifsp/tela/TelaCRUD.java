package br.edu.ifsp.tela;

import br.edu.ifsp.dao.UsuarioDAO;
import br.edu.ifsp.modelo.Usuario;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class TelaCRUD extends javax.swing.JFrame {

    Usuario u = new Usuario();
    UsuarioDAO ud = new UsuarioDAO();
    DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/uuuu");
    Calendar c = Calendar.getInstance();

    public TelaCRUD() {
        initComponents();
        atualizarGrid();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jTabbedAtualizar = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        areaNomeCadastar = new javax.swing.JTextField();
        radioHomemCadastar = new javax.swing.JRadioButton();
        radioMulherCadastar = new javax.swing.JRadioButton();
        checkGestanteCadastar = new javax.swing.JCheckBox();
        areaCPFCadastar = new javax.swing.JTextField();
        jComboBoxUFCadastar = new javax.swing.JComboBox<>();
        lblLimparCadastar = new javax.swing.JButton();
        btnCadastrarUsuario = new javax.swing.JButton();
        txtDataCadastrar = new javax.swing.JSpinner();
        jPanel12 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        btnRemover = new javax.swing.JButton();
        lblLimparRemover = new javax.swing.JButton();
        areaCPFRemover = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        pnDadosRemover = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNomeRemover = new javax.swing.JLabel();
        lblFaixaRemover = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblIdadeRemover = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblSexoRemover = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblEstadoRemover = new javax.swing.JLabel();
        btnConsultarCPFRemover = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        areaNomeAtualizar = new javax.swing.JTextField();
        radioHomemAtualizar = new javax.swing.JRadioButton();
        radioMulherAtualizar = new javax.swing.JRadioButton();
        checkGestanteAtualizar = new javax.swing.JCheckBox();
        areaCPFAtualizar = new javax.swing.JTextField();
        jComboBoxUFAtualizar = new javax.swing.JComboBox<>();
        btnAtualizar = new javax.swing.JButton();
        limparAtualizar = new javax.swing.JButton();
        txtDataAtualizar = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelTodosUsuarios = new javax.swing.JTable();

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

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

        checkGestanteCadastar.setText("GESTANTE");

        areaCPFCadastar.setText(" ");

        jComboBoxUFCadastar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));

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

        txtDataCadastrar.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(-1577907720000L), new java.util.Date(), java.util.Calendar.DAY_OF_YEAR));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblLimparCadastar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxUFCadastar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(areaCPFCadastar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel22))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(areaNomeCadastar, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDataCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(radioHomemCadastar)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioMulherCadastar)
                                        .addGap(18, 18, 18)
                                        .addComponent(checkGestanteCadastar))))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel19)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(areaNomeCadastar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtDataCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(radioHomemCadastar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioMulherCadastar)
                    .addComponent(checkGestanteCadastar))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(areaCPFCadastar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jComboBoxUFCadastar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarUsuario)
                    .addComponent(lblLimparCadastar))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedAtualizar.addTab("CADASTRAR", jPanel1);

        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

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

        pnDadosRemover.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setText("NOME: ");

        jLabel4.setText("FAIXA");

        lblNomeRemover.setText("XXXXXXXXXXXXXX");

        lblFaixaRemover.setText("YYYYYYYYYYYYYY");

        jLabel5.setText("IDADE");

        lblIdadeRemover.setText("AAAAAAAAAAAA");

        jLabel6.setText("SEXO");

        lblSexoRemover.setText("BBBBBBBBBBBBBB");

        jLabel7.setText("UF");

        lblEstadoRemover.setText("PPPPPPPPPPPPPP");

        javax.swing.GroupLayout pnDadosRemoverLayout = new javax.swing.GroupLayout(pnDadosRemover);
        pnDadosRemover.setLayout(pnDadosRemoverLayout);
        pnDadosRemoverLayout.setHorizontalGroup(
            pnDadosRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDadosRemoverLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnDadosRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(32, 32, 32)
                .addGroup(pnDadosRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdadeRemover)
                    .addComponent(lblNomeRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFaixaRemover)
                    .addGroup(pnDadosRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblEstadoRemover, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSexoRemover, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
        );
        pnDadosRemoverLayout.setVerticalGroup(
            pnDadosRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosRemoverLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnDadosRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNomeRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnDadosRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblIdadeRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDadosRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblFaixaRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDadosRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblSexoRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDadosRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel64))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel69)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblLimparRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addComponent(pnDadosRemover, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(areaCPFRemover, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(btnConsultarCPFRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64)
                .addGap(32, 32, 32)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaCPFRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultarCPFRemover)
                .addGap(28, 28, 28)
                .addComponent(pnDadosRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemover)
                    .addComponent(lblLimparRemover))
                .addGap(52, 52, 52))
        );

        jTabbedAtualizar.addTab("REMOVER", jPanel12);

        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

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

        checkGestanteAtualizar.setText("GESTANTE");

        areaCPFAtualizar.setText(" ");

        jComboBoxUFAtualizar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));

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

        txtDataAtualizar.setModel(new javax.swing.SpinnerDateModel());

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel33))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(areaCPFAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(radioHomemAtualizar)
                                                .addGap(22, 22, 22)
                                                .addComponent(radioMulherAtualizar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(checkGestanteAtualizar))
                                            .addComponent(areaNomeAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDataAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jComboBoxUFAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(limparAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel28)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addGap(19, 19, 19)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaCPFAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtDataAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioHomemAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioMulherAtualizar)
                    .addComponent(checkGestanteAtualizar)
                    .addComponent(jLabel31))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaNomeAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxUFAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(48, 48, 48)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar)
                    .addComponent(limparAtualizar))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedAtualizar.addTab("ATUALIZAR", jPanel8);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("LISTA DE USUARIOS");

        pnLista.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tabelTodosUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "NOME", "CPF", "SEXO", "IDADE", "UF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelTodosUsuarios);

        javax.swing.GroupLayout pnListaLayout = new javax.swing.GroupLayout(pnLista);
        pnLista.setLayout(pnListaLayout);
        pnListaLayout.setHorizontalGroup(
            pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnListaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnListaLayout.setVerticalGroup(
            pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel3))
                    .addComponent(pnLista, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(pnLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedAtualizar.addTab("HISTÓRICO", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLimparCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblLimparCadastarActionPerformed
        areaCPFCadastar.setText(null);
        areaNomeCadastar.setText(null);
        jComboBoxUFCadastar.setSelectedIndex(0);

    }//GEN-LAST:event_lblLimparCadastarActionPerformed

    private void lblLimparRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblLimparRemoverActionPerformed
        areaCPFRemover.setText(null);
        lblNomeRemover.setText(null);
        lblFaixaRemover.setText(null);
        lblIdadeRemover.setText(null);
        lblSexoRemover.setText(null);
        lblEstadoRemover.setText(null);
    }//GEN-LAST:event_lblLimparRemoverActionPerformed

    public void atualizarGrid() {

        DefaultTableModel modelo = (DefaultTableModel) tabelTodosUsuarios.getModel();
        modelo.setNumRows(0);

        tabelTodosUsuarios.getColumnModel().getColumn(0);
        tabelTodosUsuarios.getColumnModel().getColumn(1);
        tabelTodosUsuarios.getColumnModel().getColumn(2);
        tabelTodosUsuarios.getColumnModel().getColumn(3);
        tabelTodosUsuarios.getColumnModel().getColumn(4);
        try {
            for (Usuario p : ud.consultarTodos()) {
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
        String flagDataNascimento = txtDataCadastrar.getValue().toString();
        int flagIdade = 0;
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

        ud.cadastrarUsuario(u);
        atualizarGrid();
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed


    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        String flagCPF = areaCPFRemover.getText();

        u.setCPF(flagCPF);
        ud.removerUsuarioCPF(u);

        atualizarGrid();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnConsultarCPFRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCPFRemoverActionPerformed
        String flagCPF = areaCPFRemover.getText();

        String faixa;
        int idade = 75;

        if (idade >= 0 && idade < 14) {
            faixa = "CRIANÇA";
        } else if (idade >= 14 && idade < 18) {
            faixa = "ADOLESCENTE";
        } else if (idade >= 18 && idade < 60) {
            faixa = "ADAULTO";
        } else {
            faixa = "IDOSO";
        }

        u = ud.consultarUsuarioCPF(flagCPF);
        lblNomeRemover.setText(u.getNome());
        lblIdadeRemover.setText("" + u.getIdade());
        lblSexoRemover.setText(u.getSexo());
        lblEstadoRemover.setText(u.getEstado());
        lblFaixaRemover.setText(faixa);
        atualizarGrid();
    }//GEN-LAST:event_btnConsultarCPFRemoverActionPerformed

    private void limparAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparAtualizarActionPerformed

        areaCPFAtualizar.setText(null);
        areaCPFAtualizar.setText(null);
        areaNomeAtualizar.setText(null);
        jComboBoxUFAtualizar.setSelectedIndex(0);
    }//GEN-LAST:event_limparAtualizarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        String flagNome = areaNomeAtualizar.getText();
        String flagCPF = areaCPFAtualizar.getText();
        String flagDataNascimento = txtDataAtualizar.getValue().toString();
        String flagEstado = jComboBoxUFAtualizar.getSelectedItem().toString();
        String flagSexo = "";
        int flagIdade = 0;

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

        ud.updateUsuarioCPF(u);
        atualizarGrid();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaCPFAtualizar;
    private javax.swing.JTextField areaCPFCadastar;
    private javax.swing.JTextField areaCPFRemover;
    private javax.swing.JTextField areaNomeAtualizar;
    private javax.swing.JTextField areaNomeCadastar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrarUsuario;
    private javax.swing.JButton btnConsultarCPFRemover;
    private javax.swing.JButton btnRemover;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JCheckBox checkGestanteAtualizar;
    private javax.swing.JCheckBox checkGestanteCadastar;
    private javax.swing.JComboBox<String> jComboBoxUFAtualizar;
    private javax.swing.JComboBox<String> jComboBoxUFCadastar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedAtualizar;
    private javax.swing.JLabel lblEstadoRemover;
    private javax.swing.JLabel lblFaixaRemover;
    private javax.swing.JLabel lblIdadeRemover;
    private javax.swing.JButton lblLimparCadastar;
    private javax.swing.JButton lblLimparRemover;
    private javax.swing.JLabel lblNomeRemover;
    private javax.swing.JLabel lblSexoRemover;
    private javax.swing.JButton limparAtualizar;
    private javax.swing.JPanel pnDadosRemover;
    private javax.swing.JPanel pnLista;
    private javax.swing.JRadioButton radioHomemAtualizar;
    private javax.swing.JRadioButton radioHomemCadastar;
    private javax.swing.JRadioButton radioMulherAtualizar;
    private javax.swing.JRadioButton radioMulherCadastar;
    private javax.swing.JTable tabelTodosUsuarios;
    private javax.swing.JSpinner txtDataAtualizar;
    private javax.swing.JSpinner txtDataCadastrar;
    // End of variables declaration//GEN-END:variables
}
