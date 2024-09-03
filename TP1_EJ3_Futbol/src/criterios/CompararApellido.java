package criterios;
import java.util.*;
import futbol.Socio;

public class CompararApellido extends ComparadorCompuesto {
	public CompararApellido() {
		super();
	}
	public CompararApellido(Comparator<Socio> siguiente) {
		super(siguiente);
	}
	
	@Override
	public int comparar(Socio s1, Socio s2) {
		return s1.getApellido().compareTo(s2.getApellido());
	}

}
