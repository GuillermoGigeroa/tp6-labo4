package utilidades;

import javax.swing.JOptionPane;

public abstract class Util {
	public static void mensajeEnPantalla(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
