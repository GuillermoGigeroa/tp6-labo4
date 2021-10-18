package negocioImpl;

import java.util.TreeSet;
import entidad.Persona;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import daoImpl.*;
import utilidades.Util;

public class ListarPersonas {

	private TreeSet<Persona> listaPers = new TreeSet<Persona>();
	
	// Constructor
	public ListarPersonas () {
		listaPers = new TreeSet<Persona>();
	}

	// Metodo que devuelve un DefaultListModel de la lista de personas
	
	public DefaultListModel<Persona> getLista() {
		listaPers.addAll((new PersonaDao()).listar());
		return Util.obtenerDefaultListModel(listaPers);
	}
	
	// Metodo que devuelve un DefaultTableModel de la lista de personas

	public DefaultTableModel getListaTabla() {
		listaPers.addAll((new PersonaDao()).listar());
		return Util.obtenerDefaultTableModel(listaPers);
	}

	// Metodo listar todas las personas
	
	public void mostrarLista(TreeSet<Persona> listaP) {
		Iterator<Persona> listaPersona = listaP.iterator();
		while (listaPersona.hasNext()) {
			System.out.println(listaPersona.next().toString());
		}
	}

	// Metodo listar una persona
	
	public Persona mostrarPersona(JTextField txtDni) {
		Persona persona = new Persona();
		if (ValidarCarga.camposVacios(txtDni) == false) {
			persona = (new PersonaDao()).mostrar(txtDni.getText());
		}
		return persona;
	}
}
