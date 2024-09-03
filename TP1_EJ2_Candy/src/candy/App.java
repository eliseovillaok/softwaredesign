package candy;

public class App {

	public static void main(String[] args) {
		Tablero t = new Tablero(100);
		Ficha f1 = new FichaSimple(20, 3, 40);
		Ficha f2 = new FichaEspecial(20, 10);
		
		t.agregarFicha(f1);
		t.agregarFicha(f2);
		
		System.out.println("Tablero t: "+ t);
		System.out.println("Ficha f1: "+ f1);
		System.out.println("Ficha f2: "+ f2);
		System.out.println("Arreglo del tablero: "+ t.fichas); // hay que hacer fichas public
		System.out.println("Arreglo del tablero clonado: "+ t.getFichas());
		

	}

}
