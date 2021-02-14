 
package br.edu.ifsp.tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.OverlayLayout;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

public class TelaPrincipal extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JCheckBoxMenuItem jCheckBoxMenuItem1;
    private JFrame jFrame1;
    private JInternalFrame jInternalFrame2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenu menuPrincipal;
    private JMenuBar jMenuBar2;
    private JMenuItem itemGerenciarPaciente;
    private JMenuItem itemEstatisticas;
    private JMenuItem itemAplicarVacina;
   
    public TelaPrincipal() {
        initComponents(); 	
    }

   
    private void initComponents() {
        jFrame1 = new JFrame();
        jMenu1 = new JMenu();
        jCheckBoxMenuItem1 = new JCheckBoxMenuItem();
        jInternalFrame2 = new JInternalFrame();
        jLabel1 = new JLabel();
        String path = FileSystems.getDefault().getPath("").toAbsolutePath()+""+File.separatorChar+"sus-background.jpg";
        try {
			jLabel2 = new JLabel(new ImageIcon(ImageIO.read(new File(path))));
		} catch (IOException e) {
			e.printStackTrace();
		}
        jMenuBar2 = new JMenuBar();
        menuPrincipal = new JMenu();
        itemGerenciarPaciente = new JMenuItem();
        itemAplicarVacina = new JMenuItem();
        itemEstatisticas = new JMenuItem();
        jMenu2 = new JMenu();

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

        jMenu1.setText("jMenu1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new OverlayLayout(getContentPane()));

        jInternalFrame2.setVisible(true);

        jLabel1.setText("jLabel1");

        menuPrincipal.setText("File");

        itemGerenciarPaciente.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        itemGerenciarPaciente.setText("Gerenciar Paciente ");
        itemGerenciarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				telaCrudAction(evt);
			}
		});
        menuPrincipal.add(itemGerenciarPaciente);

        itemAplicarVacina.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        itemAplicarVacina.setText("Aplicar Vacina");
        itemAplicarVacina.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                telaVacinaAction(evt);
            }
        });
        menuPrincipal.add(itemAplicarVacina);

        itemEstatisticas.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        itemEstatisticas.setText("Estatísticas");
        itemEstatisticas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                telaHistoricoAction(evt);
            }
        });
        menuPrincipal.add(itemEstatisticas);

        jMenuBar2.add(menuPrincipal);

        jMenu2.setText("Ajuda");
        jMenuBar2.add(jMenu2);

        jInternalFrame2.setJMenuBar(jMenuBar2);

        GroupLayout jInternalFrame2Layout = new GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel2)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(112, 112, 112))
        );

        getContentPane().add(jInternalFrame2);
        
        
        pack();
    }
	private void telaCrudAction(ActionEvent evt) {
		try {
			new TelaCRUD().setVisible(true);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
    
    private void telaHistoricoAction(ActionEvent evt) {
        new TelaHistorico().setVisible(true);

    }

    private void telaVacinaAction(ActionEvent evt) {
        new TelaVacina().setVisible(true);

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
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

}
