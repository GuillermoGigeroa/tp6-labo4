package main;

import presentacion.controlador.Controlador;
import utilidades.Util;

public class Main {
	public static void main(String[] args) {
		Controlador controlador = new Controlador(Util.getVentanaPrincipal());
		controlador.mostrarVentana();
	}
}