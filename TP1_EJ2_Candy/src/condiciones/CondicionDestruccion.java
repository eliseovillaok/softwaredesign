package condiciones;
import candy.Ficha;

public class CondicionDestruccion implements Condicion {
	private double destruccion;
	public CondicionDestruccion(double destruccion) {
		this.destruccion = destruccion;
	}
	@Override
	public boolean cumple(Ficha f) {
		return f.getDestruccion() > this.getDestruccion(); 
	}
	public double getDestruccion() {
		return destruccion;
	}

}
