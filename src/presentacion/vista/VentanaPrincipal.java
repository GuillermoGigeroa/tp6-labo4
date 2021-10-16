package presentacion.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;

public class VentanaPrincipal extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JMenuBar menu;
	private JMenu mnPersona;
	private JMenuItem mntmAgregar;
	private JMenuItem mntmModificar;
	private JMenuItem mntmEliminar;
	private JMenuItem mntmListar;
	private JLabel lblG;
	private JLabel lblR;
	private JLabel lblU;
	private JLabel lblP;
	private JLabel lblO;
	private JLabel lblEspacio;
	private JLabel lbl3;
	private GridBagLayout gbl_panel;
	private GridBagConstraints gbc_lblG;
	private GridBagConstraints gbc_lblR;
	private GridBagConstraints gbc_lblU;
	private GridBagConstraints gbc_lblP;
	private GridBagConstraints gbc_lblO;
	private GridBagConstraints gbc_lblEspacio;
	private GridBagConstraints gbc_lbl3;
	private JPanel panelBarra;
	private JLabel lblMenu;

	public VentanaPrincipal() {
		setTitle("Programa");
		
		lblG = new JLabel("G");
		lblG.setFont(new Font("Monospaced", Font.BOLD, 60));
		lblG.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblR = new JLabel("R");
		lblR.setHorizontalAlignment(SwingConstants.CENTER);
		lblR.setFont(new Font("Monospaced", Font.BOLD, 60));
		
		lblU = new JLabel("U");
		lblU.setHorizontalAlignment(SwingConstants.CENTER);
		lblU.setFont(new Font("Monospaced", Font.BOLD, 60));
		
		lblP = new JLabel("P");
		lblP.setHorizontalAlignment(SwingConstants.CENTER);
		lblP.setFont(new Font("Monospaced", Font.BOLD, 60));

		lblO = new JLabel("O");
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		lblO.setFont(new Font("Monospaced", Font.BOLD, 60));
		
		lblEspacio = new JLabel(" ");
		lblEspacio.setHorizontalAlignment(SwingConstants.CENTER);
		lblEspacio.setFont(new Font("Monospaced", Font.BOLD, 60));
		
		lbl3 = new JLabel("3");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setForeground(Color.DARK_GRAY);
		lbl3.setFont(new Font("Monospaced", Font.BOLD, 60));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 150, 450, 300);
		
		menu = new JMenuBar();
		setJMenuBar(menu);
		
		mnPersona = new JMenu("Persona");
		mnPersona.setForeground(Color.BLACK);
		mnPersona.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menu.add(mnPersona);
		
		mntmAgregar = new JMenuItem("Agregar");
		mntmAgregar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmAgregar.setForeground(Color.GRAY);
		mnPersona.add(mntmAgregar);
		
		mntmModificar = new JMenuItem("Modificar");
		mntmModificar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmModificar.setForeground(Color.GRAY);
		mnPersona.add(mntmModificar);
		
		mntmEliminar = new JMenuItem("Eliminar");
		mntmEliminar.setForeground(Color.GRAY);
		mntmEliminar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnPersona.add(mntmEliminar);
		
		mntmListar = new JMenuItem("Listar");
		mntmListar.setForeground(Color.GRAY);
		mntmListar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnPersona.add(mntmListar);
		
		panelBarra = new JPanel();
		menu.add(panelBarra);
		panelBarra.setLayout(new BorderLayout(0, 0));
		
		lblMenu = new JLabel("");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		panelBarra.add(lblMenu, BorderLayout.CENTER);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		setContentPane(panel);
		
		gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 2, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 50, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);

		gbc_lblG = new GridBagConstraints();
		gbc_lblG.insets = new Insets(0, 0, 5, 5);
		gbc_lblG.gridx = 1;
		gbc_lblG.gridy = 1;
		panel.add(lblG, gbc_lblG);

		gbc_lblR = new GridBagConstraints();
		gbc_lblR.insets = new Insets(0, 0, 5, 5);
		gbc_lblR.gridx = 2;
		gbc_lblR.gridy = 1;
		panel.add(lblR, gbc_lblR);

		gbc_lblU = new GridBagConstraints();
		gbc_lblU.insets = new Insets(0, 0, 5, 5);
		gbc_lblU.gridx = 3;
		gbc_lblU.gridy = 1;
		panel.add(lblU, gbc_lblU);

		gbc_lblP = new GridBagConstraints();
		gbc_lblP.insets = new Insets(0, 0, 5, 5);
		gbc_lblP.gridx = 4;
		gbc_lblP.gridy = 1;
		panel.add(lblP, gbc_lblP);
		
		gbc_lblO = new GridBagConstraints();
		gbc_lblO.insets = new Insets(0, 0, 5, 5);
		gbc_lblO.gridx = 5;
		gbc_lblO.gridy = 1;
		panel.add(lblO, gbc_lblO);

		gbc_lblEspacio = new GridBagConstraints();
		gbc_lblEspacio.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspacio.gridx = 6;
		gbc_lblEspacio.gridy = 1;
		panel.add(lblEspacio, gbc_lblEspacio);

		gbc_lbl3 = new GridBagConstraints();
		gbc_lbl3.insets = new Insets(0, 0, 5, 5);
		gbc_lbl3.gridx = 7;
		gbc_lbl3.gridy = 1;
		panel.add(lbl3, gbc_lbl3);
		
	}
	
	public JLabel getLetraG() {
		return lblG;
	}

	public JLabel getLentraR() {
		return lblR;
	}

	public JLabel getLetraU() {
		return lblU;
	}

	public JLabel getLetraP() {
		return lblP;
	}

	public JLabel getLetraO() {
		return lblO;
	}

	public JLabel getNum3() {
		return lbl3;
	}
	
	public JLabel getLlbMenu() {
		return lblMenu;
	}
	
	public JMenuItem getMenuAgregar() {
		return mntmAgregar;
	}

	public JMenuItem getMenuModificar() {
		return mntmModificar;
	}

	public JMenuItem getMenuEliminar() {
		return mntmEliminar;
	}

	public JMenuItem getMenuListar() {
		return mntmListar;
	}
	
}
