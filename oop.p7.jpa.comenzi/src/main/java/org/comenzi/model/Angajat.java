package org.comenzi.model;

import javax.persistence.Entity;

@Entity
public class Angajat extends Persoana {
	public Angajat(Integer id, String nume, Integer salariu) {
		super(id, nume);
		this.salariu = salariu;
		this.rol = Role.ANGAJAT;
	}
	
	public Angajat() {
		super();
		this.rol = Role.ANGAJAT;
	}

	private static final long serialVersionUID = 1L;
	
	private Role rol;
	
	private Integer salariu;

	public Role getRol() {
		return rol;
	}

	public void setRol(Role rol) {
		this.rol = rol;
	}

	public Integer getSalariu() {
		return salariu;
	}

	public void setSalariu(Integer salariu) {
		this.salariu = salariu;
	}

}