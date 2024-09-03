package criterios;

import futbol.Socio;

public class CriterioCuotaImpaga implements CriterioBusqueda {

	@Override
	public boolean cumple(Socio s) {
		return !s.getUltimaCuotaPaga();
	}

}
