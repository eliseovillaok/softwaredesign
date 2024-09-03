package futbol;
import java.util.*;

public class Socio {
	private String nombre;
	private String apellido;
	private int edad;
	private boolean ultimaCuotaPaga;
	private List<Alquiler> ultimosAlquileres;
	
	public Socio(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.ultimaCuotaPaga = true;
		this.ultimosAlquileres = new ArrayList<Alquiler>();
	}
	
	public Socio(Socio otro) { // Constructor copia
		this.nombre = otro.getNombre();
		this.apellido = otro.getApellido();
		this.edad = otro.getEdad();
		this.ultimaCuotaPaga = otro.getUltimaCuotaPaga();
		this.ultimosAlquileres = new ArrayList<Alquiler>(otro.getUltimosAlquileres());
	}
	
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	public String getNombre() {
		return nombre;
	}
	public boolean getUltimaCuotaPaga() {
		return this.ultimaCuotaPaga;
	}
	public void agregarAlquiler(Alquiler a) {
		this.ultimosAlquileres.add(a);
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setUltimaCuotaPaga(boolean ultimaCuotaPaga) {
		this.ultimaCuotaPaga = ultimaCuotaPaga;
	}
	public List<Alquiler> getUltimosAlquileres() { // Solo Lectura
		return Collections.unmodifiableList(this.ultimosAlquileres);
	}
	public int cantidadAlquileres(int idCancha) {
		int cont = 0;
		for (Alquiler a : ultimosAlquileres) {
			if (a.getCancha().getIdCancha() == idCancha)
				cont = cont + 1;
		}
		return cont;
	}
}
