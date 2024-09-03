package futbol;


public class Cancha {
	private int idCancha;
	private int precioCancha;
	
	public Cancha(int idCancha, int precioCancha) {
		this.idCancha = idCancha;
		this.precioCancha = precioCancha;
	}
	
	public Cancha(Cancha otro) {
		this.idCancha = otro.getIdCancha();
		this.precioCancha = otro.getPrecioCancha();
	}
	
	public int getIdCancha() {
		return idCancha;
	}
	public int getPrecioCancha() {
		return precioCancha;
	}
	public void setIdCancha(int idCancha) {
		this.idCancha = idCancha;
	}
	public void setPrecioCancha(int precioCancha) {
		this.precioCancha = precioCancha;
	}
}
