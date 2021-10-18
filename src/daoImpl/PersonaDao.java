package daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import entidad.Persona;
import dao.AccesoDatos;

public class PersonaDao implements AccesoDatos {
	private String host = "localhost/";
	private String user = "root";
	private String pass = "root";
	private String dbName = "bdpersonas";
	private String url = "jdbc:mysql://" + host + dbName;
	private Connection conectar;

	// Constructor
	public PersonaDao() {

	}

	// Metodo conectar
	public Connection conexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			this.conectar = DriverManager.getConnection(this.url, this.user, this.pass);
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Error en la base" + e.getMessage());
		}
		return this.conectar;
	}

	// Metodo cerrar coneccion

	public void cerrar() {
		if (this.conectar != null) {
			try {
				this.conectar.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// Metodo agregar persona

	public int agregar(Persona persona) {
		String query = "insert into Personas (Dni, Nombre, Apellido) values ('" + persona.getDni() + "','"
				+ persona.getNombre() + "','" + persona.getApellido() + "')";

		int filas = 0;

		try {
			Statement st = conexion().createStatement();
			filas = st.executeUpdate(query);

		} catch (Exception e) {
			e.printStackTrace();
		}

		cerrar();

		return filas;
	}

	// Metodo mostrar persona

	public Persona mostrar(String dni) {

		Persona entidad = new Persona();
		try {
			Statement st = conexion().createStatement();
			String query = "Select * from Personas where Dni like '" + dni + "'";
			ResultSet resultado = st.executeQuery(query);

			if (resultado.next()) {

				entidad.setDni(resultado.getString("Dni"));
				entidad.setNombre(resultado.getString("Nombre"));
				entidad.setApellido(resultado.getString("Apellido"));

			}

		} catch (SQLException er) {
			er.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		cerrar();

		return entidad;
	}

	// Metodo listar personas

	public ArrayList<Persona> listar() {
		ArrayList<Persona> listar = new ArrayList<>();

		try {
			Statement st = conexion().createStatement();
			String query = "Select * from Personas";
			ResultSet resultado = st.executeQuery(query);

			while (resultado.next()) {

				Persona entidad = new Persona();
				entidad.setDni(resultado.getString("Dni"));
				entidad.setNombre(resultado.getString("Nombre"));
				entidad.setApellido(resultado.getString("Apellido"));
				listar.add(entidad);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		cerrar();

		return listar;

	}

	@Override
	public Boolean modificar(String dni, String nombre, String apellido) {

		boolean hecho = false;

		try {
			Statement st = conexion().createStatement();
			String query = "Update personas set Nombre = '" + nombre + "', Apellido = '" + apellido + "'  where Dni = '"
					+ dni + "'";
			hecho = st.execute(query);

		} catch (Exception e) {
			e.printStackTrace();
		}

		cerrar();

		return hecho;
	}

	@Override
	public Boolean eliminar(String dni) {

		boolean hecho = false;

		try {
			Statement st = conexion().createStatement();
			String query = "Delete from Personas where Dni = '" + dni + "'";

			hecho = st.execute(query);

		} catch (Exception e) {
			e.printStackTrace();
		}

		cerrar();

		return hecho;
	}

}
