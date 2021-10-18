package entidad;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import utilidades.Util;
import javax.swing.JLabel;

public class Animacion implements MouseListener {

	public JLabel label;
	public Color color;

//	Constructores
	public Animacion(JLabel label) {
		this.label = label;
		this.color = colorAlAzar();
	}

	public Animacion(JLabel label, Color color) {
		this.label = label;
		this.color = color;
	}

//	Metodos
	public void pintar() {
		label.setForeground(this.color);
	}

	private void pintar(Color color) {
		label.setForeground(color);
	}

	private void pintarAlAzar() {
		pintar(colorAlAzar());
	}

	public Color colorAlAzar() {
		return Util.colorAlAzar();
	}

//	Metodos sobrecargados de MouseListener
	@Override
	public void mouseClicked(MouseEvent e) {
		pintar(Color.BLACK);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		pintarAlAzar();
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
