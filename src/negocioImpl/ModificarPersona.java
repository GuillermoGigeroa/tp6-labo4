package negocioImpl;

import javax.swing.JTextField;

import daoImpl.PersonaDao;
import negocio.ModificarDatos;

public class ModificarPersona implements ModificarDatos {

	// Metodo para modificar el apellido y nombre de una persona en BBDD
	public Boolean modificarApeNom(JTextField txtDni, JTextField txtNombre, JTextField txtApellido) {
		if ((new PersonaDao()).modificar(txtDni.getText(), txtNombre.getText(), txtApellido.getText())) {
			return true;
		}
		return false;
	}

}
