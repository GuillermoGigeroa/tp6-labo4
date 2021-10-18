package negocioImpl;

import java.util.TreeSet;
import entidad.Persona;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import daoImpl.*;
import utilidades.Util;

public abstract class ListarPersonas {

	private static TreeSet<Persona> listaPers = new TreeSet<Persona>();

	// Constructores

	public static void setListaPers(TreeSet<Persona> listaPers) {
		ListarPersonas.listaPers = listaPers;
	}

	// Metodo que devuelve un DefaultListModel de la lista de personas
	
	public static DefaultListModel<Persona> getLista() {
		listaPers.addAll((new PersonaDao()).listar());
		return Util.obtenerDefaultListModel(listaPers);
	}
	
	// Metodo que devuelve un DefaultTableModel de la lista de personas

	public static DefaultTableModel getListaTabla() {
		listaPers.addAll((new PersonaDao()).listar());
		return Util.obtenerDefaultTableModel(listaPers);
	}

	// Metodo listar todas las personas
	
	public static void mostrarLista(TreeSet<Persona> listaP) {
		Iterator<Persona> listaPersona = listaP.iterator();
		while (listaPersona.hasNext()) {
			System.out.println(listaPersona.next().toString());
		}
	}

	// Metodo listar una persona
	
	public static Persona mostrarPersona(JTextField txtDni) {
		Persona persona = new Persona();
		if (ValidarCarga.camposVacios(txtDni) == false) {
			persona = (new PersonaDao()).mostrar(txtDni.getText());
		}
		return persona;
	}
}
