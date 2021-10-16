package main;
import presentacion.controlador.Controlador;
import presentacion.vista.VentanaPrincipal;

public class Main {
	public static void main(String[] args) {
		VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
		Controlador controlador = new Controlador(ventanaPrincipal);
		controlador.mostrarVentana();
	}
}