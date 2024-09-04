package criterios;
import streaming.Pelicula;

public class CriterioTitulo implements Criterio {
	private String titulo;
	
	public CriterioTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean cumple(Pelicula p) {
		return p.getTitulo() == this.titulo;
	}
}
