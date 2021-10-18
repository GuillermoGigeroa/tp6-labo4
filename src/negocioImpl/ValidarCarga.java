package negocioImpl;

import negocio.CargaDatos;
import negocio.Validacion;
import utilidades.Util;
import entidad.*;
import java.awt.Color;
import javax.swing.JTextField;
import daoImpl.PersonaDao;

public abstract class ValidarCarga implements CargaDatos, Validacion {

	// Metodo datos vacios o sin datos
	public static Boolean camposVacios(JTextField txtTexto) {
		if (txtTexto.getText().trim().isEmpty()) {
			txtTexto.setBackground(Color.RED);
			Util.mensajeEnPantalla("Campo vacío.");
			return true;
		} else {
			txtTexto.setBackground(Color.WHITE);
			return false;
		}
	}

	// Metodo datos vacios o sin datos
	public static Boolean camposVacios(JTextField txtTexto, String nombre) {
		if (txtTexto.getText().trim().isEmpty()) {
			txtTexto.setBackground(Color.RED);
			Util.mensajeEnPantalla(nombre + " no valido.");
			return true;
		} else {
			txtTexto.setBackground(Color.WHITE);
			return false;
		}
	}

	// Metodo dni existente
	public static Boolean dniExistente(JTextField txtDni) {
		PersonaDao pDao = new PersonaDao();
		Persona persona = new Persona();
		persona = pDao.mostrar(txtDni.getText());
		return persona.getDni().hashCode() == txtDni.getText().hashCode();
	}
}
