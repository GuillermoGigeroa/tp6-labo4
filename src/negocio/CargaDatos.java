package negocio;

import java.util.TreeSet;

import entidad.Persona;

public interface CargaDatos {

	public TreeSet<Persona> cargarLista();
	
	public void mostrarLista(TreeSet<Persona> lista);
}
