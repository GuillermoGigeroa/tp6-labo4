package presentacion.vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class PanelListar extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTable table;
	private GridBagLayout gridBagLayout;
	private GridBagConstraints gbc_table;

	public PanelListar() {
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{26, 296, 26, 0};
		gridBagLayout.rowHeights = new int[]{26, 160, 26, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		table = new JTable();
		table.setBorder(new LineBorder(Color.GRAY));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Apellido", "Dni"
			}
		));
		gbc_table = new GridBagConstraints();
		gbc_table.insets = new Insets(0, 0, 5, 5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 1;
		gbc_table.gridy = 1;
		add(table, gbc_table);
	}
}
