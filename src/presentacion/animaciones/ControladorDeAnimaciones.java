package presentacion.animaciones;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JLabel;
import entidad.Animacion;

public class ControladorDeAnimaciones implements WindowListener {
	private ArrayList<Animacion> listaLabels;

	// Constructor
	public ControladorDeAnimaciones(JLabel g, JLabel r, JLabel u, JLabel p, JLabel o, JLabel nro3) {
		listaLabels = new ArrayList<Animacion>();
		listaLabels.add(new Animacion(g));
		listaLabels.add(new Animacion(r));
		listaLabels.add(new Animacion(u));
		listaLabels.add(new Animacion(p));
		listaLabels.add(new Animacion(o));
		listaLabels.add(new Animacion(nro3));
	}

	// Metodos
	private void cambiarColores() {
		Iterator<Animacion> listaAnimaciones = listaLabels.iterator();
		Animacion.iniciarListaColores();
		while (listaAnimaciones.hasNext()) {
			listaAnimaciones.next().pintar();
		}
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		cambiarColores();
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
