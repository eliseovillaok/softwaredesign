package condiciones;

import candy.Ficha;

public class CondicionFortaleza implements Condicion {
	private int fortaleza;
	public CondicionFortaleza(int fortaleza) {
		this.fortaleza = fortaleza;
	}
	
	@Override
	public boolean cumple(Ficha f) {
		return f.getFortaleza() > this.getFortaleza();
	}

	public int getFortaleza() {
		return fortaleza;
	}
}
