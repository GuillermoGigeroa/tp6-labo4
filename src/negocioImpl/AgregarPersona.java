package negocioImpl;

import daoImpl.PersonaDao;
import entidad.Persona;
import negocio.Agregar;

public class AgregarPersona implements Agregar {

	@Override
	public Boolean insertar(Persona p) {
		if (ValidarCarga.dniExistente(p.getDni())) {
			return false;
		} else {
			(new PersonaDao()).agregar(p);
			return true;
		}
	}

}
