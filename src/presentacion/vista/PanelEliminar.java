package presentacion.vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;

public class PanelEliminar extends JPanel {
	private static final long serialVersionUID = 1L;
	private GridBagLayout gridBagLayout;

	public PanelEliminar() {
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0};
		gridBagLayout.rowHeights = new int[]{0};
		gridBagLayout.columnWeights = new double[]{Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE};
		setLayout(gridBagLayout);
	}
}
