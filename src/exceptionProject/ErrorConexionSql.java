package exceptionProject;

import java.sql.SQLException;

public class ErrorConexionSql extends SQLException{

	private static final long serialVersionUID = 1L;

//	Contructor
	public ErrorConexionSql() {
		
	}

	@Override
	public String getMessage() {
		return "Error en la conexion a la base de datos";
	}

	
	
}
