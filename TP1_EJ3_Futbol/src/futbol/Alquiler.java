package futbol;
import java.time.LocalDateTime;


public class Alquiler{
	private static int contAlquileres = 0;	
	private int idAlquiler;
	private double precioAlquiler;
	private Cancha cancha;
	private Socio socio;
	private LocalDateTime fecha;
	
	public Alquiler(Cancha c, Socio s) {
		contAlquileres = contAlquileres + 1;
		this.idAlquiler = contAlquileres;
		this.cancha = c;
		this.socio = s;
		this.precioAlquiler = c.getPrecioCancha(); // Porque podria cambiar el precio de la cancha pero el alquiler mantiene el precio puesto en el momento.
		this.fecha = LocalDateTime.now();
	}
	
	public int getIdAlquiler() {
		return idAlquiler;
	}
	public double getPrecioAlquiler() {
		return precioAlquiler;
	}
	public Cancha getCancha() {
		return new Cancha(this.cancha);
	}
	public Socio getSocio() {
		return new Socio(this.socio);
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
}
