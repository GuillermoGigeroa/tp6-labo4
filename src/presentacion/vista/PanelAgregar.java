package presentacion.vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextField;

public class PanelAgregar extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDni;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblDni;
	private JButton btnAceptar;
	private GridBagLayout gridBagLayout;
	private GridBagConstraints gbc_lblNombre;
	private GridBagConstraints gbc_txtNombre;
	private GridBagConstraints gbc_lblApellido;
	private GridBagConstraints gbc_txtApellido;
	private GridBagConstraints gbc_lblDni;
	private GridBagConstraints gbc_txtDni;
	private GridBagConstraints gbc_btnAceptar;
	
	public PanelAgregar() {
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblNombre = new JLabel("Nombre");
		gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 1;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		lblApellido = new JLabel("Apellido");
		gbc_lblApellido = new GridBagConstraints();
		gbc_lblApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido.gridx = 1;
		gbc_lblApellido.gridy = 2;
		add(lblApellido, gbc_lblApellido);
		
		txtApellido = new JTextField();
		gbc_txtApellido = new GridBagConstraints();
		gbc_txtApellido.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellido.gridx = 2;
		gbc_txtApellido.gridy = 2;
		add(txtApellido, gbc_txtApellido);
		txtApellido.setColumns(10);
		
		lblDni = new JLabel("Dni");
		gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.gridx = 1;
		gbc_lblDni.gridy = 3;
		add(lblDni, gbc_lblDni);
		
		txtDni = new JTextField();
		gbc_txtDni = new GridBagConstraints();
		gbc_txtDni.insets = new Insets(0, 0, 5, 5);
		gbc_txtDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDni.gridx = 2;
		gbc_txtDni.gridy = 3;
		add(txtDni, gbc_txtDni);
		txtDni.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAceptar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAceptar.gridx = 1;
		gbc_btnAceptar.gridy = 4;
		add(btnAceptar, gbc_btnAceptar);
	}
	
	public JButton getBtnAceptar() {
		return btnAceptar;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}
	
	public JTextField getTxtApellido() {
		return txtApellido;
	}
	
	public JTextField getTxtDni() {
		return txtDni;
	}
}


