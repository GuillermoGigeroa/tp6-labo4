package entidad;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import utilidades.Util;

import javax.swing.JLabel;

public class Animacion {

	private static ArrayList<ColorLetra> listaColores;
	public JLabel label;
	
	public Animacion(JLabel label) {
		this.label = label;
	}
	
	public static void iniciarListaColores() {
		listaColores = Util.getListaColores();		
	}

	public static void esperar() {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void pintar() {
		pintarAlAzar(label);
	}
	
	public void pintarAlAzar(JLabel este) {
		int cantidadColores = listaColores.size();
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        int numero = tlr.nextInt(0, cantidadColores);
        while (listaColores.get(numero).getUsado()) {
        	numero = tlr.nextInt(0, cantidadColores);
        }
        listaColores.get(numero).setUsado(true);
		pintar(este,listaColores.get(numero));
	}
	
	
	private void pintar(JLabel este, ColorLetra color) {
		este.setForeground(color.getColor());
	}

}
