package presentacion.vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JList;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PanelModificar extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDni;
	private GridBagLayout gridBagLayout;
	private GridBagConstraints gbc_lblSeleccione;
	private JLabel lblSeleccione;
	private GridBagConstraints gbc_list;
	private GridBagConstraints gbc_txtNombre;
	private GridBagConstraints gbc_txtApellido;
	private GridBagConstraints gbc_txtDni;
	private GridBagConstraints gbc_btnModificar;
	private JButton btnModificar;
	private JList list;
	
	public PanelModificar() {
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblSeleccione = new JLabel("Seleccione la persona que desea modificar");
		gbc_lblSeleccione = new GridBagConstraints();
		gbc_lblSeleccione.gridwidth = 4;
		gbc_lblSeleccione.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccione.gridx = 1;
		gbc_lblSeleccione.gridy = 1;
		add(lblSeleccione, gbc_lblSeleccione);
		
		list = new JList();
		gbc_list = new GridBagConstraints();
		gbc_list.gridwidth = 4;
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 2;
		add(list, gbc_list);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 1;
		gbc_txtNombre.gridy = 3;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setText("Apellido");
		gbc_txtApellido = new GridBagConstraints();
		gbc_txtApellido.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellido.gridx = 2;
		gbc_txtApellido.gridy = 3;
		add(txtApellido, gbc_txtApellido);
		txtApellido.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.setText("Dni");
		gbc_txtDni = new GridBagConstraints();
		gbc_txtDni.insets = new Insets(0, 0, 5, 5);
		gbc_txtDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDni.gridx = 3;
		gbc_txtDni.gridy = 3;
		add(txtDni, gbc_txtDni);
		txtDni.setColumns(10);
		
		btnModificar = new JButton("Modificar");
		gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 4;
		gbc_btnModificar.gridy = 3;
		add(btnModificar, gbc_btnModificar);
	}
}
