package dao;

import java.sql.Connection;
import java.util.ArrayList;
import entidad.Persona;

public interface AccesoDatos {
	
	public Connection conexion();
	
	public void cerrar ();
	
	public  Persona mostrar(String dni);
	
	public ArrayList<Persona> listar();
	
	public Boolean eliminar(String dni);

	public Boolean modificar(String dni, String nombre, String apellido);
	
}
