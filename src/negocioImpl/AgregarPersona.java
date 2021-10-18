package negocioImpl;

import javax.swing.JTextField;

import daoImpl.PersonaDao;
import entidad.Persona;
import negocio.Agregar;

public class AgregarPersona implements Agregar {

	@Override
	public Boolean insertar(Persona p) {
		JTextField txtDni = new JTextField();
		txtDni.setText(p.getDni());
		if(ValidarCarga.dniExistente(txtDni)) {
				return false;
			}else {
				PersonaDao pDao = new PersonaDao();
				pDao.agregar(p);
				return true;
			}
		}
	
	
}
