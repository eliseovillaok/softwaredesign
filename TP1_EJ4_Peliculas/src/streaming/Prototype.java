package streaming;

public abstract class Prototype {
	// Demas atributos
	public Prototype() {
		// TODO Auto-generated constructor stub
	}
	public Prototype(Prototype original) {
		if (original != null) {
			// this.atributo_1 = original.getAtributo_1() por ejemplo
		}
	}
	public abstract Prototype clone();
}
