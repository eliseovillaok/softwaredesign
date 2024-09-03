package condiciones;

import candy.Ficha;

public class CondicionNOT implements Condicion {
	private Condicion c1;
	
	public CondicionNOT(Condicion c1) {
		this.c1 = c1;
	}
	@Override
	public boolean cumple(Ficha f) {
		return !c1.cumple(f);
	}

}
