package criterios;
import java.util.Comparator;
import futbol.*;

public abstract class ComparadorCompuesto implements Comparator<Socio> {
	private Comparator<Socio> siguienteComparador;
	
	public ComparadorCompuesto() {
		this.siguienteComparador = null;
	}
	
	public ComparadorCompuesto(Comparator<Socio> siguiente) {
		this.siguienteComparador = siguiente;
	}
	
	public abstract int comparar(Socio s1, Socio s2);

	public int compare(Socio s1, Socio s2) {
		int resultado = comparar(s1,s2);
		if ( (resultado == 0) && (this.siguienteComparador != null)) // resultado == 0 significa que el comparador no puedo determinar el orden
			return this.siguienteComparador.compare(s1, s2);
		return resultado;
	}
}
