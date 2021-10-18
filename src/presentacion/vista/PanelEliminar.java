package presentacion.vista;

import javax.swing.JPanel;
import entidad.Persona;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JList;
import java.awt.Insets;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

public class PanelEliminar extends JPanel {
	private static final long serialVersionUID = 1L;
	private GridBagLayout gridBagLayout;
	private JLabel lblEliminar;
	private JButton btnEliminar;
	private JList<Persona> listaPersonas;
	private GridBagConstraints gbc_listaPersonas;
	private GridBagConstraints gbc_lblEliminar;
	private GridBagConstraints gbc_btnEliminar;

	public PanelEliminar() {
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 114, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblEliminar = new JLabel("Eliminar usuarios");
		gbc_lblEliminar = new GridBagConstraints();
		gbc_lblEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_lblEliminar.gridx = 2;
		gbc_lblEliminar.gridy = 1;
		add(lblEliminar, gbc_lblEliminar);
		
		listaPersonas = new JList<Persona>(new DefaultListModel<Persona>());
		gbc_listaPersonas = new GridBagConstraints();
		gbc_listaPersonas.gridwidth = 3;
		gbc_listaPersonas.insets = new Insets(0, 0, 5, 5);
		gbc_listaPersonas.fill = GridBagConstraints.BOTH;
		gbc_listaPersonas.gridx = 1;
		gbc_listaPersonas.gridy = 2;
		add(listaPersonas, gbc_listaPersonas);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setEnabled(false);
		gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.fill = GridBagConstraints.BOTH;
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 2;
		gbc_btnEliminar.gridy = 3;
		add(btnEliminar, gbc_btnEliminar);
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public JList<Persona> getListaPersonas() {
		return listaPersonas;
	}
	
}
