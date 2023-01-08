package org.jpa.Florarie;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client extends Persoana { 
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	private String nume;
	
	private Boolean clientFidel;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
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
