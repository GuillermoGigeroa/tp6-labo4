package entidad;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import utilidades.Util;

import javax.swing.JLabel;

public class Animacion implements MouseListener {

	private static ArrayList<Color> listaColores;
	public JLabel label;
	
	public Animacion(JLabel label) {
		this.label = label;
	}
	
	public static void iniciarListaColores() {
		listaColores = Util.getListaColores();		
	}
	
	public void pintar() {
		pintarAlAzar(label);
	}
	
	public void pintar(Color color) {
		label.setForeground(color);
	}
	
	private void pintarAlAzar(JLabel este) {
		int cantidadColores = listaColores.size();
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        int numero = tlr.nextInt(0, cantidadColores);
		pintar(este,listaColores.get(numero));
	}
	
	private void pintar(JLabel este, Color color) {
		este.setForeground(color);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		pintar(Color.BLACK);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		pintar();
	}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

}
