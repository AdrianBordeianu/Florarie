package org.jpa.Florarie;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.AUTO;

@Entity
public class Client extends Persoana { 
	private static final long serialVersionUID = 1L;

	
	private Boolean clientFidel;
	
	public Client(Integer id, String nume, Boolean clientFidel) {
		super(id, nume);
		this.clientFidel = clientFidel;
	}
	
	public Client(Integer id, String nume) {
		super(id, nume);
	}
	
	public Client() {
	}
	

	public Boolean getClientFidel() {
		return clientFidel;
	}

	public void setClientFidel(Boolean clientFidel) {
		this.clientFidel = clientFidel;
	}
	
}
