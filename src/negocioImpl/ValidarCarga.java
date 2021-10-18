package negocioImpl;

import negocio.CargaDatos;
import negocio.Validacion;
import utilidades.Util;
import entidad.*;
import javax.swing.JTextField;
import daoImpl.PersonaDao;

public abstract class ValidarCarga implements CargaDatos, Validacion {

	// Metodo datos vacios o sin datos
	public static Boolean camposVacios(JTextField txtTexto) {
		if (txtTexto.getText().trim().isEmpty()) {
			Util.mensajeEnPantalla("Campo vacío.");
			return true;
		} else {
			return false;
		}
	}

	// Metodo datos vacios o sin datos
	public static Boolean camposVacios(JTextField txtTexto, String nombre) {
		if (txtTexto.getText().trim().isEmpty()) {
			Util.mensajeEnPantalla(nombre + " no valido.");
			return true;
		} else {
			return false;
		}
	}

	// Metodo dni existente que recibe un JTextField
	public static Boolean dniExistente(JTextField txtDni) {
		PersonaDao pDao = new PersonaDao();
		Persona persona = new Persona();
		persona = pDao.mostrar(txtDni.getText());
		return persona.getDni().hashCode() == txtDni.getText().hashCode();
	}
	
	// Metodo dni existente que recibe un DNI en String
	public static Boolean dniExistente(String dni) {
		Persona persona = new Persona();
		persona = (new PersonaDao()).mostrar(dni);
		return persona.getDni().hashCode() == dni.hashCode();
	}
}
