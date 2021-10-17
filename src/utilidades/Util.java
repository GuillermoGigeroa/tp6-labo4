package utilidades;

import java.awt.Color;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public abstract class Util {
	
	public static void mensajeEnPantalla(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public static ArrayList<Color> getListaColores() {
		ArrayList<Color> listaColores = new ArrayList<Color>();
		listaColores.add(Color.RED);
		listaColores.add(Color.BLACK);
		listaColores.add(Color.BLUE);
		listaColores.add(Color.CYAN);
		listaColores.add(Color.GREEN);
		listaColores.add(Color.MAGENTA);
		listaColores.add(Color.ORANGE);
		listaColores.add(Color.PINK);
		listaColores.add(Color.YELLOW);
		return listaColores;
	}
	
	public static Color colorAlAzar() {
		ArrayList<Color> listaColores = getListaColores();
		int cantidadColores = listaColores.size();
		ThreadLocalRandom tlr = ThreadLocalRandom.current();
		int numero = tlr.nextInt(0, cantidadColores);
		return listaColores.get(numero);
	}
	
//	Metodo que quita los puntos de un String
	
	public static String quitarPuntos(String texto) {
		String resultado = "";
		for (int i = 0; i < texto.length(); i ++) {
			if (texto.charAt(i) != '.') {
				resultado += texto.charAt(i);
			}
		}
		return resultado;
	}
}
