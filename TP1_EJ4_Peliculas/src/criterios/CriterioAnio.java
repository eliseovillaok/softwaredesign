package criterios;
import streaming.Pelicula;

public class CriterioAnio implements Criterio {
	private int anio;
	
	public CriterioAnio(int anio) {
		this.anio = anio;
	}
	public boolean cumple(Pelicula p) {
		return p.getAnioEstreno() < this.anio;
	};
}
