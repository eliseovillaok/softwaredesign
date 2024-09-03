package criterios;
import futbol.*;
import java.util.*;

public class CriterioPagoMasDe implements CriterioBusqueda {
	private double precio;
	public CriterioPagoMasDe(double precio) {
		this.precio = precio;
	}
	@Override
	public boolean cumple(Socio s) {
		List<Alquiler> alquileres = s.getUltimosAlquileres();
		for (Alquiler a : alquileres) {
			if (a.getPrecioAlquiler() > this.precio)
				return true;
		}
		return false;
	}

}
