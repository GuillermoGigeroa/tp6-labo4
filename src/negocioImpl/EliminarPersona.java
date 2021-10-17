package negocioImpl;

import javax.swing.JTextField;

import daoImpl.PersonaDao;
import negocio.Eliminar;
import negocioImpl.ValidarCarga;

public class EliminarPersona implements Eliminar {

	@Override
	public Boolean elimina(JTextField txtDni) {
		
		if(ValidarCarga.dniExistente(txtDni)) {
		PersonaDao pDao = new PersonaDao();
			return pDao.eliminar(txtDni.getText());
		}
		return false;

	}

}
