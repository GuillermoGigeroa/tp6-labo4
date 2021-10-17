package main;

import entidad.Persona;
import presentacion.controlador.Controlador;
import presentacion.vista.VentanaPrincipal;
import daoImpl.PersonaDao;

public class Principal {
	public static void main(String[] args){
		Controlador controlador = new Controlador(new VentanaPrincipal());
		controlador.mostrarVentana();
		PersonaDao dao = new PersonaDao();
		Persona persona = new Persona();
		
		persona.setDni("3534842");
		persona.setNombre("Maria Eugenia");
		persona.setApellido("Milla");
		int filas = dao.agregar(persona);
		
		if(filas > 0) {
			System.out.println("Agregado");
		} else {
			System.out.println("No cargo");
		}
	}
}
