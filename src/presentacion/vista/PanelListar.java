package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.GridBagLayout;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class PanelListar extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTable tablaPersonas;
	private GridBagLayout gridBagLayout;
	private GridBagConstraints gbc_tablaPersonas;

	public PanelListar() {
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{26, 296, 26, 0};
		gridBagLayout.rowHeights = new int[]{26, 160, 26, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		tablaPersonas = new JTable();
		tablaPersonas.setBorder(new LineBorder(Color.GRAY));
		gbc_tablaPersonas = new GridBagConstraints();
		gbc_tablaPersonas.insets = new Insets(0, 0, 5, 5);
		gbc_tablaPersonas.fill = GridBagConstraints.BOTH;
		gbc_tablaPersonas.gridx = 1;
		gbc_tablaPersonas.gridy = 1;
		add(new JScrollPane(tablaPersonas), gbc_tablaPersonas);
	}
	public JTable getTablaPersonas() {
		return tablaPersonas;
	}
}
