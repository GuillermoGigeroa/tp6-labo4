package utilidades;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import entidad.Persona;

public abstract class Util {

//	Metodo para enviar un mensaje a la pantalla
	public static void mensajeEnPantalla(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

// 	Metodo para recibir la lista de colores
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

//	Metodo para recibir un color al azar
	public static Color colorAlAzar() {
		ArrayList<Color> listaColores = getListaColores();
		int cantidadColores = listaColores.size();
		ThreadLocalRandom tlr = ThreadLocalRandom.current();
		int numero = tlr.nextInt(0, cantidadColores);
		return listaColores.get(numero);
	}
	
//	Metodo que verifica si un caracter es un numero
	public static boolean validarNumero(char caracterRecibido) {
		int codigo = (int) caracterRecibido;
		return (codigo >= 48 && codigo <= 57);
	}
	
//	Metodo para extraer un DefaultListModel<Pelicula> de un TreeSet<Pelicula>
	public static DefaultListModel<Persona> obtenerDefaultListModel(TreeSet<Persona> origen) {
		DefaultListModel<Persona> dlmPersonas = new DefaultListModel<Persona>();
		dlmPersonas = new DefaultListModel<Persona>();
		Iterator<Persona> lista = origen.iterator();
		while (lista.hasNext()) {
			dlmPersonas.addElement(lista.next());
		}
		return dlmPersonas;
	}
}
