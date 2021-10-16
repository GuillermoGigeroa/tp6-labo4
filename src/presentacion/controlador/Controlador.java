package presentacion.controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.JPanel;
import entidad.Animacion;
import presentacion.vista.*;

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
		ventana.getMenuAgregar().addActionListener(a->accionBotonAgregar(a));
		ventana.getMenuModificar().addActionListener(a->accionBotonModificar(a));
		ventana.getMenuEliminar().addActionListener(a->accionBotonEliminar(a));
		ventana.getMenuListar().addActionListener(a->accionBotonListar(a));
	}
	
	public void accionBotonAgregar(ActionEvent a) {
		JPanel panel = new PanelAgregar();
		cambiarPanel(panel);
		ventana.getLlbMenu().setText("Menu agregar");
		ventana.getMenuAgregar().setForeground(Color.BLACK);
		ventana.getMenuModificar().setForeground(Color.GRAY);
		ventana.getMenuEliminar().setForeground(Color.GRAY);
		ventana.getMenuListar().setForeground(Color.GRAY);
	}
	
	public void accionBotonModificar(ActionEvent a) {
		JPanel panel = new PanelModificar();
		cambiarPanel(panel);
		ventana.getLlbMenu().setText("Menu modificar");
		ventana.getMenuAgregar().setForeground(Color.GRAY);
		ventana.getMenuModificar().setForeground(Color.BLACK);
		ventana.getMenuEliminar().setForeground(Color.GRAY);
		ventana.getMenuListar().setForeground(Color.GRAY);
	}
	
	public void accionBotonEliminar(ActionEvent a) {
		JPanel panel = new PanelEliminar();
		cambiarPanel(panel);
		ventana.getLlbMenu().setText("Menu eliminar");
		ventana.getMenuAgregar().setForeground(Color.GRAY);
		ventana.getMenuModificar().setForeground(Color.GRAY);
		ventana.getMenuEliminar().setForeground(Color.BLACK);
		ventana.getMenuListar().setForeground(Color.GRAY);
	}
	
	public void accionBotonListar(ActionEvent a) {
		JPanel panel = new PanelListar();
		cambiarPanel(panel);
		ventana.getLlbMenu().setText("Menu listar");
		ventana.getMenuAgregar().setForeground(Color.GRAY);
		ventana.getMenuModificar().setForeground(Color.GRAY);
		ventana.getMenuEliminar().setForeground(Color.GRAY);
		ventana.getMenuListar().setForeground(Color.BLACK);
	}
	
	private void cambiarPanel(JPanel estePanel) {
		ventana.getContentPane().removeAll();
		ventana.setContentPane(estePanel);
		ventana.getContentPane().repaint();
		ventana.getContentPane().revalidate();
	}

	public void mostrarVentana() {
		ventana.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) { }

}
