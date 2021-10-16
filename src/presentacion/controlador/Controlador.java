package presentacion.controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JLabel;

import entidad.Animacion;
import presentacion.vista.VentanaPrincipal;

public class Controlador implements ActionListener {
	
	private VentanaPrincipal ventana;
	
	public Controlador(VentanaPrincipal ventana) {
		this.ventana = ventana;
		agregarAnimacionGrupo3();
		agregarAnimacionMenu();
	}
	
	public void agregarAnimacionGrupo3 () {
		ArrayList<JLabel> lista = new ArrayList<JLabel>();
		lista.add(ventana.getLetraG());
		lista.add(ventana.getLentraR());
		lista.add(ventana.getLetraU());
		lista.add(ventana.getLetraP());
		lista.add(ventana.getLetraO());
		lista.add(ventana.getNum3());
		Iterator<JLabel> iterador = lista.iterator();
		while(iterador.hasNext()) {
			JLabel label = iterador.next();
			label.addMouseListener(new Animacion(label));
		}
	}
	
	public void agregarAnimacionMenu () {
		ventana.getMenuAgregar().addActionListener(a->pintarAgregar(a));
		ventana.getMenuModificar().addActionListener(a->pintarModificar(a));
		ventana.getMenuEliminar().addActionListener(a->pintarEliminar(a));
		ventana.getMenuListar().addActionListener(a->pintarListar(a));
	}
	
	public void pintarAgregar(ActionEvent a) {
		ventana.getMenuAgregar().setForeground(Color.BLACK);
		ventana.getMenuModificar().setForeground(Color.GRAY);
		ventana.getMenuEliminar().setForeground(Color.GRAY);
		ventana.getMenuListar().setForeground(Color.GRAY);
	}
	
	public void pintarModificar(ActionEvent a) {
		ventana.getMenuAgregar().setForeground(Color.GRAY);
		ventana.getMenuModificar().setForeground(Color.BLACK);
		ventana.getMenuEliminar().setForeground(Color.GRAY);
		ventana.getMenuListar().setForeground(Color.GRAY);
	}
	
	public void pintarEliminar(ActionEvent a) {
		ventana.getMenuAgregar().setForeground(Color.GRAY);
		ventana.getMenuModificar().setForeground(Color.GRAY);
		ventana.getMenuEliminar().setForeground(Color.BLACK);
		ventana.getMenuListar().setForeground(Color.GRAY);
	}
	
	public void pintarListar(ActionEvent a) {
		ventana.getMenuAgregar().setForeground(Color.GRAY);
		ventana.getMenuModificar().setForeground(Color.GRAY);
		ventana.getMenuEliminar().setForeground(Color.GRAY);
		ventana.getMenuListar().setForeground(Color.BLACK);
	}

	public void mostrarVentana() {
		ventana.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) { }

}
