package criterios;
import streaming.Pelicula;

public interface Criterio {
	public abstract boolean cumple(Pelicula p);
}
