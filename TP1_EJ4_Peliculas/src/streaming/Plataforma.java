package streaming;
import java.util.List;
import java.util.ArrayList;
import criterios.Criterio;

public class Plataforma {
	private volatile static Plataforma uniqueInstance = new Plataforma();
	private List<Pelicula> peliculas;
	private Criterio criterioLicencia;
	
	private Plataforma() {
		peliculas = new ArrayList<Pelicula>();
		criterioLicencia = null;
	}

	public static Plataforma getInstance(){
		return uniqueInstance;
	}
	
	public List<Pelicula> buscar(Criterio criterio) {
		List<Pelicula> retorno = new ArrayList<Pelicula>();
		for (Pelicula p : peliculas) {
			if (criterio.cumple(p)) {
				retorno.add((Pelicula) p.clone()); // Agrego un clon, porque sino el cliente puede modificar la pelicula por fuera.
			}
		}
		return retorno;
	}
	
	public List<Pelicula> getPeliculas() {
		List<Pelicula> retorno = new ArrayList<Pelicula>();
		for (Pelicula p : peliculas)
			retorno.add((Pelicula) p.clone()); // Agrego un clon, porque sino el cliente puede modificar la pelicula por fuera.
		return retorno;
	}
	public void setCriterioLicencia(Criterio criterioLicencia) {
		this.criterioLicencia = criterioLicencia;
	}
	
	public boolean analizarRentabilidad(Pelicula p) {
		try {
			return this.criterioLicencia.cumple(p);
		} catch (Exception e) {
			System.out.println("Criterio no establecido");
		}
		return false;
	}
	
	public boolean adquirirPelicula(Pelicula p) {
		if (this.analizarRentabilidad(p)) {
			this.peliculas.add((Pelicula) p.clone()); // Agrego un clon, porque sino el cliente puede modificar la pelicula por fuera.
			return true;
		}
		return false;
	}
}
