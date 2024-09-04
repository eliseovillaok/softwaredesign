package streaming;
import java.util.List;
import java.util.ArrayList;

public class Pelicula extends Prototype {
	private String titulo;
	private String sinopsis;
	private String genero;
	private String director;
	private int anioEstreno;
	private int duracion;
	private int edadMinima;
	private List<String> actores;

	public Pelicula(String titulo, String sinopsis, String genero, String director, int anioEstreno, int duracion, int edadMinima) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.genero = genero;
		this.director = director;
		this.anioEstreno = anioEstreno;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.actores = new ArrayList<String>();
	}
	
	public Pelicula(Pelicula original) {
		super(original);
		if (original != null) {
			this.titulo = original.getTitulo();
			this.director = original.getDirector();
			this.genero = original.getGenero();
			this.sinopsis = original.getSinopsis();
			this.actores = original.getActores();
			this.anioEstreno = original.getAnioEstreno();
			this.duracion = original.getDuracion();
			this.edadMinima = original.getEdadMinima();
		}
	}
	
	public List<String> getActores() {
		return this.actores; // Porque los String son de naturaleza inmutables.
	}
	public int getAnioEstreno() {
		return anioEstreno;
	}
	public String getDirector() {
		return director;
	}
	public int getDuracion() {
		return duracion;
	}
	public int getEdadMinima() {
		return edadMinima;
	}
	public String getGenero() {
		return genero;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public String getTitulo() {
		return titulo;
	}
	
	
	@Override
	public Prototype clone() {
		return new Pelicula(this); // En el cliente hay que castearlo as (Pelicula) p.clone()
	}

}
