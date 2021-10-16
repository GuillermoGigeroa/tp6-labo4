package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import entidad.Animacion;
import presentacion.vista.VentanaPrincipal;

public class Controlador implements ActionListener {
	
	private VentanaPrincipal ventana;
	public Controlador(VentanaPrincipal ventana) {
		this.ventana = ventana;
		agregarAnimaciones();
	}
	
	public void agregarAnimaciones() {
		agregarAnimacion(ventana.getLblG());
		agregarAnimacion(ventana.getLblR());
		agregarAnimacion(ventana.getLblU());
		agregarAnimacion(ventana.getLblP());
		agregarAnimacion(ventana.getLblO());
		agregarAnimacion(ventana.getLbl3());
	}
	
	public void agregarAnimacion(JLabel label) {
		label.addMouseListener(new Animacion(label));
	}
	
	public void mostrarVentana() {
		ventana.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) { }

}
