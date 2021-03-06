package entidad;

public class Persona implements Comparable<Persona> {

	// Atributos

	private String dni;
	private String nombre;
	private String apellido;

	// Constructores
	
	public Persona() {
		dni = "Sin numero";
		nombre = "Sin nombre";
		apellido = " No reconocido";
	}

	public Persona(String _dni, String _nombre, String _apellido) {
		this.dni = _dni.trim();
		this.nombre = _nombre.trim();
		this.apellido = _apellido.trim();
	}

	// Getters y Setters
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public int compareTo(Persona p) {
		int comparacion = this.getApellido().toLowerCase().compareTo(p.getApellido().toLowerCase());
		if (comparacion == 0) {
			comparacion = this.getNombre().toLowerCase().compareTo(p.getNombre().toLowerCase());
			if (comparacion == 0) {
				comparacion = this.getDni().compareTo(p.getDni());
			}
		}
		return comparacion;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Apellido: " + apellido + ", DNI: " + dni.toString() + ".";
	}

}
