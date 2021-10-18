package entidad;

import exceptionProject.DniInvalido;

public class Dni implements Comparable<Dni> {

	// Atributos

	private String numero;

	// Constructores

	public Dni() {
		numero = "Sin numero";
	}

	public Dni(String numero) throws DniInvalido {
		this.numero = numero;
		verificarDniInvalido(this.numero);
	}

	// Getters y Setters

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	// Metodo verificarDniInvalido

	public static void verificarDniInvalido(String dni) throws DniInvalido {
		try {
			Integer.valueOf(dni);
		} catch (NumberFormatException e) {
			throw new DniInvalido();
		}
	}

	// Metodo hashCode

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	// Metodo equals

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dni other = (Dni) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

	// Metodo compareTo

	@Override
	public int compareTo(Dni o) {
		return this.getNumero().compareTo(o.getNumero());
	}

	// Metodo toString

	@Override
	public String toString() {
		return "DNI numero" + numero + ".";
	}
}
