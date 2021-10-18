package negocioImpl;

import javax.swing.JTextField;

import daoImpl.PersonaDao;
import negocio.ModificarDatos;

public class ModificarPersona implements ModificarDatos{

	public Boolean modificarApenom(JTextField txtDni, JTextField txtNombre, JTextField txtApellido) {
		
		PersonaDao dato = new PersonaDao();
		
		if(dato.modificar(txtDni.getText(), txtNombre.getText(), txtApellido.getText())){		
		
		return true;
	}

	return false;
	}	

}
