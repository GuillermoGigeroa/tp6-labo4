package negocioImpl;

import java.util.TreeSet;
import entidad.Persona;
import java.util.Iterator;
import javax.swing.JTextField;
import daoImpl.*;

public abstract class ListarPersonas {

	private static TreeSet<Persona> listaPers = new TreeSet<Persona>();

	// Constructores

	public static void setListaPers(TreeSet<Persona> listaPers) {
		ListarPersonas.listaPers = listaPers;
	}

	public static TreeSet<Persona> getLista() {
		PersonaDao colleccion = new PersonaDao();
		listaPers.addAll(colleccion.listar());
		return listaPers;
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
		PersonaDao dato = new PersonaDao();

		if (ValidarCarga.camposVacios(txtDni) == false) {
			persona = dato.mostrar(txtDni.getText());
		}

		return persona;

	}
}
