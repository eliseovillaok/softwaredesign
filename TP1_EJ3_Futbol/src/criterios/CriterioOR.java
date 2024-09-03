package criterios;

import futbol.Socio;

public class CriterioOR implements CriterioBusqueda {
	private CriterioBusqueda c1;
	private CriterioBusqueda c2;
	
	public CriterioOR(CriterioBusqueda c1, CriterioBusqueda c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	@Override
	public boolean cumple(Socio s) {
		return c1.cumple(s) || c2.cumple(s);
	}

}
