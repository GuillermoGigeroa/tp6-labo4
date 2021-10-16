package utilidades;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import entidad.ColorLetra;

public abstract class Util {
	public static void mensajeEnPantalla(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	public static ArrayList<ColorLetra> getListaColores() {
		ArrayList<ColorLetra> listaColores = new ArrayList<ColorLetra>();
		listaColores.add(new ColorLetra(Color.RED));
		listaColores.add(new ColorLetra(Color.BLACK));
		listaColores.add(new ColorLetra(Color.BLUE));
		listaColores.add(new ColorLetra(Color.CYAN));
		listaColores.add(new ColorLetra(Color.GREEN));
		listaColores.add(new ColorLetra(Color.MAGENTA));
		listaColores.add(new ColorLetra(Color.ORANGE));
		listaColores.add(new ColorLetra(Color.PINK));
		listaColores.add(new ColorLetra(Color.WHITE));
		listaColores.add(new ColorLetra(Color.YELLOW));
		return listaColores;
	}
}
