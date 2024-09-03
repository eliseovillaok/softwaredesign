package criterios;

import futbol.Socio;

public class CriterioNOT implements CriterioBusqueda {
	private CriterioBusqueda c;
	
	public CriterioNOT(CriterioBusqueda c) {
		this.c = c;
	}
	@Override
	public boolean cumple(Socio s) {
		return !c.cumple(s);
	}

}
