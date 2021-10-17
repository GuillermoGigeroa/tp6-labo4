package entidad;

public class Persona {
	
//	Atributos
	
	private String dni;
	private String nombre;
	private String apellido;
	
//	Constructores
	public Persona() {
		dni = "Sin numero";
		nombre = "Sin nombre";
		apellido = " No reconocido";
	}
	
	public Persona(String _dni, String _nombre, String _apellido) {
		this.dni = _dni;
		this.nombre = _nombre;
		this.apellido = _apellido;
	}

//	Getters y Setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	
}
