package criterios;
import java.util.*;
import futbol.Socio;

public class CompararNombre extends ComparadorCompuesto {
	public CompararNombre() {
		super();
	}
	public CompararNombre(Comparator<Socio> siguiente) {
		super(siguiente);
	}
	@Override
	public int comparar(Socio s1, Socio s2) {
		return s1.getNombre().compareTo(s2.getNombre());
	}

}
