package candy;
import condiciones.Condicion;
import java.util.ArrayList;

public class Tablero {
	private int puntajeMinimo;
	public ArrayList<Ficha> fichas;
	
	public Tablero(int puntajeMinimo) {
		this.fichas = new ArrayList<Ficha>();
		this.setPuntajeMinimo(puntajeMinimo);
	}
	public ArrayList<Ficha> getFichas() {
		ArrayList<Ficha> clonFichas = new ArrayList<Ficha>();
		for (Ficha f : this.fichas) {
			clonFichas.add(f.copia());
		}
		return clonFichas;
		
	}
	public boolean agregarFicha(Ficha f) {
		try {
			this.fichas.add(f.copia());
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public double getDificultad() {
		double dificultad = 0;
		for (Ficha f : fichas) {
			dificultad = dificultad + (f.getFortaleza()/f.getDestruccion());
		};
		return dificultad;
	}
	public void setPuntajeMinimo(int puntajeMinimo) {
		this.puntajeMinimo= puntajeMinimo;
	}
	public int getPuntajeMinimo() {
		return puntajeMinimo;
	}
	
	public ArrayList<Ficha> busqueda(Condicion c){
		ArrayList<Ficha> retorno = new ArrayList<Ficha>();
		for (Ficha f : this.fichas) {
			if (c.cumple(f)) {
				retorno.add(f.copia());
			}
		}
		return retorno;
	}
	
}
