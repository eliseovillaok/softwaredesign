package condiciones;

import candy.Ficha;

public class CondicionEspacio implements Condicion {
	private int espacio;
	public CondicionEspacio(int espacio) {
		this.espacio = espacio;
	}
	@Override
	public boolean cumple(Ficha f) {
		return f.getEspacio() > this.getEspacio();
	}
	public int getEspacio() {
		return espacio;
	}

}
