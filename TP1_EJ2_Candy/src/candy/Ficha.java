package candy;

public abstract class Ficha {
	private int fortaleza;
	private int espacio;
	
	public abstract double getDestruccion();
	public abstract Ficha copia(); // Factory Method
	public int getFortaleza(){
		return this.fortaleza;
	};
	public int getEspacio() {
		return this.espacio;
	}
	public void setEspacio(int espacio) {
		this.espacio = espacio;
	}
	public void setFortaleza(int fortaleza) {
		this.fortaleza = fortaleza;
	}
}
