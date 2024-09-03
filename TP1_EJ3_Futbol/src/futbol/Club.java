package futbol;
import java.util.*;
import criterios.*;

public class Club{
	private static volatile Club unicaInstancia = null; // Singleton
	private List<Socio> socios; 
	private List<Cancha> canchas;
	private List<Alquiler> alquileres;

	private Club() {
		this.socios = new ArrayList<Socio>();
		this.canchas = new ArrayList<Cancha>();
		this.alquileres = new ArrayList<Alquiler>();
	}
	
	public static Club obtenerInstancia() { // Singleton
		if (unicaInstancia == null) {
			synchronized(unicaInstancia){
				if (unicaInstancia == null) {
					unicaInstancia = new Club();
				}
			}
		}
		return unicaInstancia;
	}
	
	public void agregarSocio(Socio s) {
		this.socios.add(s); // Deberia ser la copia del socio asi no se puede editar desde afuera
	}
	public void agregarCancha(Cancha c) {
		this.canchas.add(c); // Idem arriba
	}
	public void nuevoAlquiler(Cancha c, Socio s) {
		// No tiene control de errores
		Alquiler nuevo = new Alquiler(c,s);
		this.alquileres.add(nuevo); // Idem arriba
		s.agregarAlquiler(nuevo);
		
	}
	
	public List<Socio> busquedaSocio(CriterioBusqueda cb, Comparator<Socio> co){
		List<Socio> retorno = new ArrayList<Socio>();
		for (Socio s : this.socios) {
			if (cb.cumple(s))
				retorno.add(s);
		}
		Collections.sort(retorno,co);
		return retorno;
	}

}
