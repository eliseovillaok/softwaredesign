package main.java.org.eliseovilla.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Direccion {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(nullable = false)
	private String ciudad;
	
	@Column(nullable=false)
	private String calle;

	public Direccion(String ciudad, String calle) {
		super();
		this.ciudad = ciudad;
		this.calle = calle;
	}

	public Direccion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Direccion [id=" + id + ", ciudad=" + ciudad + ", calle=" + calle + "]";
	}
	
	
}
