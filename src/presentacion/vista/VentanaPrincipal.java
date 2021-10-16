package presentacion.vista;

import presentacion.animaciones.ControladorDeAnimaciones;
import entidad.Animacion;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import java.awt.SystemColor;

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

	public VentanaPrincipal() {
		
		lblG = new JLabel("G");
		lblG.setFont(new Font("Monospaced", Font.BOLD, 60));
		lblG.setForeground(new Color(192, 192, 192));
		lblG.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblR = new JLabel("R");
		lblR.setHorizontalAlignment(SwingConstants.CENTER);
		lblR.setForeground(Color.LIGHT_GRAY);
		lblR.setFont(new Font("Monospaced", Font.BOLD, 60));
		
		lblU = new JLabel("U");
		lblU.setHorizontalAlignment(SwingConstants.CENTER);
		lblU.setForeground(Color.LIGHT_GRAY);
		lblU.setFont(new Font("Monospaced", Font.BOLD, 60));
		
		lblP = new JLabel("P");
		lblP.setHorizontalAlignment(SwingConstants.CENTER);
		lblP.setForeground(Color.LIGHT_GRAY);
		lblP.setFont(new Font("Monospaced", Font.BOLD, 60));

		lblO = new JLabel("O");
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		lblO.setForeground(Color.LIGHT_GRAY);
		lblO.setFont(new Font("Monospaced", Font.BOLD, 60));
		
		lblEspacio = new JLabel(" ");
		lblEspacio.setHorizontalAlignment(SwingConstants.CENTER);
		lblEspacio.setForeground(Color.LIGHT_GRAY);
		lblEspacio.setFont(new Font("Monospaced", Font.BOLD, 60));
		
		lbl3 = new JLabel("3");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setForeground(Color.LIGHT_GRAY);
		lbl3.setFont(new Font("Monospaced", Font.BOLD, 60));

		addWindowListener(new ControladorDeAnimaciones(lblG,lblR,lblU,lblP,lblO,lbl3));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 150, 450, 300);
		
		menu = new JMenuBar();
		setJMenuBar(menu);
		
		mnPersona = new JMenu("Persona");
		mnPersona.setForeground(new Color(128, 0, 0));
		mnPersona.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menu.add(mnPersona);
		
		mntmAgregar = new JMenuItem("Agregar");
		mntmAgregar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmAgregar.setForeground(new Color(0, 128, 0));
		mnPersona.add(mntmAgregar);
		
		mntmModificar = new JMenuItem("Modificar");
		mntmModificar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmModificar.setForeground(new Color(128, 0, 128));
		mnPersona.add(mntmModificar);
		
		mntmEliminar = new JMenuItem("Eliminar");
		mntmEliminar.setForeground(new Color(255, 0, 0));
		mntmEliminar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnPersona.add(mntmEliminar);
		
		mntmListar = new JMenuItem("Listar");
		mntmListar.setForeground(new Color(0, 0, 255));
		mntmListar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnPersona.add(mntmListar);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
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
	
	// Getters y Setters
	
	public JLabel getLblG() {
		return lblG;
	}

	protected void setLblG(JLabel lblG) {
		this.lblG = lblG;
	}

	public JLabel getLblR() {
		return lblR;
	}

	protected void setLblR(JLabel lblR) {
		this.lblR = lblR;
	}

	public JLabel getLblU() {
		return lblU;
	}

	protected void setLblU(JLabel lblU) {
		this.lblU = lblU;
	}

	public JLabel getLblP() {
		return lblP;
	}

	protected void setLblP(JLabel lblP) {
		this.lblP = lblP;
	}

	public JLabel getLblO() {
		return lblO;
	}

	protected void setLblO(JLabel lblO) {
		this.lblO = lblO;
	}

	public JLabel getLbl3() {
		return lbl3;
	}

	protected void setLbl3(JLabel lbl3) {
		this.lbl3 = lbl3;
	}

}
