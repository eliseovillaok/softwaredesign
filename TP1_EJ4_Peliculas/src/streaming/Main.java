package streaming;
import java.util.*;
import criterios.*;
public class Main {

	public static void main(String[] args) {
		Plataforma plataforma = Plataforma.getInstance();
		Pelicula peli_1 = new Pelicula("Harry Potter","Magos en Howgartz","Ciencia ficcion","No se",2010,160,18); // Prototipo
		Pelicula peli_2 = (Pelicula) peli_1.clone();
		System.out.println(peli_1);
		System.out.println(peli_2); // Son distintos objetos
		
		// Inserción del criterio en ejecución
		Criterio c1 = new CriterioAnio(2020);
		plataforma.setCriterioLicencia(c1);
		if (plataforma.adquirirPelicula(peli_1))
			System.out.println("Pelicula agregada correctamente");
		else
			System.out.println("No se agregó la pelicula "+ peli_1.getTitulo());
		
		// Busqueda
		Criterio c2 = new CriterioAnio(1970);
		List<Pelicula> busqueda = plataforma.buscar(c1);
		System.out.println("Peliculas que cumplen el criterio de busqueda: " + busqueda); // Como vemos también, se hizo una "Deep copy", clonando todas las peliculas internas.
	
		// Cambio del criterio de licencia
		plataforma.setCriterioLicencia(c2);
		if (plataforma.adquirirPelicula(peli_1))
			System.out.println("Pelicula agregada correctamente");
		else
			System.out.println("No se agregó la pelicula "+ peli_1.getTitulo());
	}

}
