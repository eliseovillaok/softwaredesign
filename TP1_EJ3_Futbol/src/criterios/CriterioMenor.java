package criterios;

import futbol.Socio;

public class CriterioMenor implements CriterioBusqueda {
	private int edadMaxima;
	
	public CriterioMenor(int edadMaxima) {
		this.edadMaxima = edadMaxima;
	}
	@Override
	public boolean cumple(Socio s) {
		return s.getEdad()<this.edadMaxima;
	}

}
