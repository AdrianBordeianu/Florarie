package org.jpa.Florarie;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

public class Test {
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		List<Client> clienti = new ArrayList<Client>();
		clienti.add(new Client(101, "Popescu Ioana"));
		clienti.add(new Client(102, "Dobrescu Marius"));
		clienti.add(new Client(103, "Petrescu Bogdan"));
		clienti.add(new Client(104, "Savescu Andrian"));
		clienti.add(new Client(105, "Popovici Matei"));
		clienti.add(new Client(106, "Antonescu Andrei"));
		
		EntityManagerFactory emf = Persistence.
				createEntityManagerFactory("ProduseJPA");
		EntityManager em = emf.createEntityManager();
		
		//Transactie pentru Update
		em.getTransaction().begin();
		
		//Read-Update
		Client c103 = em.find(Client.class, 102);
		if(c103 != null) {
			c103.setNume("Dumitrescu Razvan");
		}
		
		//Tranzactie de sincronizare cu baza de date
		em.getTransaction().commit();
	}
}


