package criterios;
import java.util.Comparator;
import futbol.*;

public class CompararSocioEdad extends ComparadorCompuesto {
	
	public CompararSocioEdad() {
		super();
	}
	public CompararSocioEdad(Comparator<Socio> siguiente) {
		super(siguiente);
	}
	
	@Override
	public int comparar(Socio s1, Socio s2) {
		return Integer.compare(s1.getEdad(), s2.getEdad());
	}
}
