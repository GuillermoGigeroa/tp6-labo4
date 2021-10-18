package presentacion.controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import entidad.Animacion;
import entidad.Persona;
import negocioImpl.AgregarPersona;
import negocioImpl.ListarPersonas;
import negocioImpl.ModificarPersona;
import negocioImpl.ValidarCarga;
import presentacion.vista.*;
import utilidades.Util;

public class Controlador implements ActionListener {
	
	private VentanaPrincipal ventana;
	
//	Constructor
	public Controlador(VentanaPrincipal ventana) {
		this.ventana = ventana;
		agregarAnimacionGrupo3();
		agregarAnimacionMenu();
	}
	
//	Metodo para agregar animacion del texto "Grupo 3"
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
	
//	Metodo para agregar la animacion de los botones al presionarlo
	public void agregarAnimacionMenu () {
		ventana.getMenuAgregar().addActionListener(a->accionBotonAgregar(a));
		ventana.getMenuModificar().addActionListener(a->accionBotonModificar(a));
		ventana.getMenuEliminar().addActionListener(a->accionBotonEliminar(a));
		ventana.getMenuListar().addActionListener(a->accionBotonListar(a));
	}
	
//	Metodo para activar la funcionalidad de Agregar y el PanelAgregar
	public void accionBotonAgregar(ActionEvent a) {
		PanelAgregar panel = new PanelAgregar();
		cambiarPanel(panel);
		ventana.getLlbMenu().setText("Menu agregar");
		ventana.getMenuAgregar().setForeground(Color.BLACK);
		ventana.getMenuModificar().setForeground(Color.GRAY);
		ventana.getMenuEliminar().setForeground(Color.GRAY);
		ventana.getMenuListar().setForeground(Color.GRAY);
		agregar_cargarControladorBoton(panel);
		agregar_cargarKeyListenerDNI(panel);
	}
	
//	Metodo para cargar el controlador del boton Aceptar de PanelAgregar
	public void agregar_cargarControladorBoton (PanelAgregar panel) {
		panel.getBtnAceptar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField nombre = panel.getTxtNombre();
				JTextField apellido  = panel.getTxtApellido();
				JTextField dni = panel.getTxtDni();
				if (ValidarCarga.camposVacios(nombre,"Nombre")) return;
				if (ValidarCarga.camposVacios(apellido,"Apellido")) return;
				if (ValidarCarga.camposVacios(dni, "DNI")) return;
				if (ValidarCarga.dniExistente(dni)) {
					Util.mensajeEnPantalla("DNI ya ha sido ingresado");
					return;
				}
				if ((new AgregarPersona()).insertar(new Persona(dni.getText(),nombre.getText(),apellido.getText()))) {
					nombre.setText(null);
					apellido.setText(null);
					dni.setText(null);
					Util.mensajeEnPantalla("Se cargó correctamente.");
				}
			}
		});
	}
	
//	Metodo para cargar el key listener del JTextField DNI de PanelAgregar
	public void agregar_cargarKeyListenerDNI (PanelAgregar panel) {
		panel.getTxtDni().addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (!Util.validarNumero(e.getKeyChar())) {
					e.consume();
				}
				if (panel.getTxtDni().getText().trim().length() > 7) {
					e.consume();
				}
			}
		});
	}

//	Metodo para activar la funcionalidad de Modificar y el PanelModificar
	public void accionBotonModificar(ActionEvent a) {
		PanelModificar panel = new PanelModificar();
		cambiarPanel(panel);
		ventana.getLlbMenu().setText("Menu modificar");
		ventana.getMenuAgregar().setForeground(Color.GRAY);
		ventana.getMenuModificar().setForeground(Color.BLACK);
		ventana.getMenuEliminar().setForeground(Color.GRAY);
		ventana.getMenuListar().setForeground(Color.GRAY);
		modificar_cargarControladorBoton(panel);
		modificar_cargarEventoClick(panel);
		modificar_cargarPersonas(panel);
	}
	
//	Metodo para cargar la lista de personas
	public void modificar_cargarPersonas(PanelModificar panel) {
		panel.getListaPersonas().setModel(ListarPersonas.getLista());
	}
	
//	Metodo para cargar el evento del JList de PanelModificar
	public void modificar_cargarEventoClick (PanelModificar panel) {
		panel.getListaPersonas().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Persona persona = panel.getListaPersonas().getSelectedValue();
				panel.getBtnModificar().setEnabled(true);
				panel.getTxtNombre().setEditable(true);
				panel.getTxtNombre().setText(persona.getNombre());
				panel.getTxtApellido().setEditable(true);
				panel.getTxtApellido().setText(persona.getApellido());
				panel.getTxtDni().setText(persona.getDni());
			}
		});
	}
	
//	Metodo para cargar el controlador del boton Modificar de PanelModificar
	public void modificar_cargarControladorBoton (PanelModificar panel) {
		panel.getBtnModificar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!(new ModificarPersona()).modificarApenom(panel.getTxtDni(),panel.getTxtNombre(),panel.getTxtApellido())){
					Util.mensajeEnPantalla("Se ha modificado correctamente.");
				}
			}
		});
	}

//	Metodo para activar la funcionalidad de Eliminar y el PanelEliminar
	public void accionBotonEliminar(ActionEvent a) {
		PanelEliminar panel = new PanelEliminar();
		cambiarPanel(panel);
		ventana.getLlbMenu().setText("Menu eliminar");
		ventana.getMenuAgregar().setForeground(Color.GRAY);
		ventana.getMenuModificar().setForeground(Color.GRAY);
		ventana.getMenuEliminar().setForeground(Color.BLACK);
		ventana.getMenuListar().setForeground(Color.GRAY);
	}
	
//	Metodo para cargar el controlador del boton Eliminar de PanelEliminar
	public void eliminar_cargarControladorBoton (PanelEliminar panel) {
		panel.getBtnEliminar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Evento del boton eliminar
			}
		});
	}
	
//	Metodo para activar la funcionalidad de Listar y el PanelListar
	public void accionBotonListar(ActionEvent a) {
		JPanel panel = new PanelListar();
		cambiarPanel(panel);
		ventana.getLlbMenu().setText("Menu listar");
		ventana.getMenuAgregar().setForeground(Color.GRAY);
		ventana.getMenuModificar().setForeground(Color.GRAY);
		ventana.getMenuEliminar().setForeground(Color.GRAY);
		ventana.getMenuListar().setForeground(Color.BLACK);
	}
	
//	Metodo para cargar el panel ingresado en la ventana
	private void cambiarPanel(JPanel estePanel) {
		ventana.getContentPane().removeAll();
		ventana.setContentPane(estePanel);
		ventana.getContentPane().repaint();
		ventana.getContentPane().revalidate();
	}

//	Metodo para mostrar la ventana actual
	public void mostrarVentana() {
		ventana.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {}

}
