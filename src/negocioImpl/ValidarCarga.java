package negocioImpl;

import negocio.CargaDatos;
import negocio.Validacion;
import entidad.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import daoImpl.PersonaDao;

public abstract class ValidarCarga implements CargaDatos, Validacion{
	
//	Atributos
	private  Persona persona;
	private Dni dni;
	
//	Constructor
	public ValidarCarga() {
		persona = new Persona();
		dni = new Dni();
	}
	
//	Getters y Setters
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Dni getDni() {
		return dni;
	}
	public void setDni(Dni dni) {
		this.dni = dni;
	}
	
//	Metodo datos vacios o sin datos
	public static Boolean camposVacios(JTextField txtTexto) {
		if(txtTexto.getText().isEmpty() || txtTexto.getText().equals(" ")) {
			txtTexto.setBackground(Color.RED);
			return true;
		}
		
		return false;
	}
	
// Metodo para enviar alertas en pantalla
	public void alerta(String texto) {
			JOptionPane.showMessageDialog(null, texto);
	}

//	Metodo dni existente
	public static Boolean dniExistente(JTextField txtDni){
		 
			PersonaDao pDao = new PersonaDao();
			Persona persona = new Persona();
			persona = pDao.mostrar(txtDni.getText());
			return (persona.getDni().hashCode() == txtDni.getText().hashCode())?true: false;
			
	}
}
	

