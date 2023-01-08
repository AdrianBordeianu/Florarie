package org.jpa.Florarie;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Manager extends Persoana {

	public Manager(Integer id, String nume) {
		super(id, nume);
		this.rol = Role.MANAGER;
	}
	
	public Manager() {
		super();
		this.rol = Role.MANAGER;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Role rol;

	public Role getRol() {
		return rol;
	}

	public void setRol(Role rol) {
		this.rol = rol;
	}
	
}
