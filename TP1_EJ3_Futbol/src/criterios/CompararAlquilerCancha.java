package criterios;
import java.util.*;
import futbol.Socio;

public class CompararAlquilerCancha extends ComparadorCompuesto {
	private int idCancha;
	public CompararAlquilerCancha(int idCancha) {
		super();
		this.idCancha = idCancha;
	}
	public CompararAlquilerCancha(Comparator<Socio> siguiente, int idCancha) {
		super(siguiente);
		this.idCancha = idCancha;
	}
	
	@Override
	public int comparar(Socio s1, Socio s2) {
		return Integer.compare(s1.cantidadAlquileres(this.idCancha), s2.cantidadAlquileres(this.idCancha));
	}

}
