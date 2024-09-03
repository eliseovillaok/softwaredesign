package candy;

public class FichaEspecial extends Ficha {

	public FichaEspecial(int fortaleza, int espacio) {
		this.setFortaleza(fortaleza);
		this.setEspacio(espacio);
	}
	@Override
	public double getDestruccion() {
		return this.getFortaleza()/this.getEspacio();
	}
	@Override
	public Ficha copia() { // Factory Method implementacion
		return new FichaEspecial(this.getFortaleza(),this.getEspacio());
	}
	
}
