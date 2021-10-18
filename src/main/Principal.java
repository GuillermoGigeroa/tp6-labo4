package main;

import presentacion.controlador.Controlador;
import presentacion.vista.VentanaPrincipal;

public class Principal {
	public static void main(String[] args){
		Controlador controlador = new Controlador(new VentanaPrincipal());
		controlador.mostrarVentana();
	}
}
