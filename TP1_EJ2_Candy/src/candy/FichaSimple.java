package candy;

public class FichaSimple extends Ficha {
	private double destruccion;
	
	public FichaSimple(int fortaleza, int espacio, double destruccion) {
		this.setDestruccion(destruccion);
	}
	public void setDestruccion(double destruccion) {
		this.destruccion = destruccion;
	}
	@Override
	public double getDestruccion() {
		return this.destruccion;
	}
	@Override
	public Ficha copia() { // Factory Method implementacion
		return new FichaSimple(this.getFortaleza(),this.getEspacio(),this.getDestruccion());
	}
	
	
}
