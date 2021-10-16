package presentacion.controlador;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.Iterator;
import entidad.Animacion;
import presentacion.vista.VentanaPrincipal;

public class ControladorAnimaciones implements WindowListener {
	private ArrayList<Animacion> listaLabels;
	private VentanaPrincipal ventana;

	// Constructor
	public ControladorAnimaciones(VentanaPrincipal ventana) {
		this.ventana = ventana;
		inicializarLabels(new Color(204, 204, 255));
	}
	
	private void inicializarLabels(Color color) {
		listaLabels = new ArrayList<Animacion>();
		listaLabels.add(new Animacion(ventana.getLetraG(), color));
		listaLabels.add(new Animacion(ventana.getLentraR(), color));
		listaLabels.add(new Animacion(ventana.getLetraU(), color));
		listaLabels.add(new Animacion(ventana.getLetraP(), color));
		listaLabels.add(new Animacion(ventana.getLetraO(), color));
		listaLabels.add(new Animacion(ventana.getNum3(), color));
	}
	
	private void cambiarColores(ArrayList<Animacion> lista) {
		Iterator<Animacion> listaAnimaciones = lista.iterator();
		while (listaAnimaciones.hasNext()) {
			listaAnimaciones.next().pintar();
		}
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		cambiarColores(listaLabels);
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
