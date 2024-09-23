package main.java.org.eliseovilla;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.org.eliseovilla.db.Direccion;
import main.java.org.eliseovilla.db.Persona;

import javax.persistence.EntityManager;

public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Example");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Direccion d1 = new Direccion("Azul","San juan 1200");
		em.persist(d1);
		
		Persona p1 = new Persona(44240445, "Eliseo", 22, d1);
		Persona p2 = new Persona(44298732, "Peperoni", 23, d1);
		em.persist(p1);
		em.persist(p2);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
