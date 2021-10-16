package entidad;

import java.awt.Color;

public class ColorLetra {
	
	private static final long serialVersionUID = 1L;
	private boolean usado;
	private Color color;
	
	public ColorLetra(Color color) {
		usado = false;
		this.color = color;
	}
	protected boolean getUsado() {
		return usado;
	}
	protected void setUsado(boolean usado) {
		this.usado = usado;
	}
	protected Color getColor() {
		return color;
	}
	protected void setColor(Color color) {
		this.color = color;
	}
	protected static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
