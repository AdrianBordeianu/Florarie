package org.jpa.Florarie;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ArticolComanda {
	@Id
	private Integer id;
	
	@ManyToOne
	private Produs produs; 
	
	private Double cantitate;
	
	@ManyToOne
	private Comanda comanda;
	
	
	public ArticolComanda(Integer id, Produs produs, Double cantitate,
			Comanda comanda) {
		this.id = id;
		this.produs = produs;
		this.cantitate = cantitate;
		this.comanda = comanda;
	}
	public ArticolComanda(){}
	
	public Comanda getComanda() {
		return comanda;
	}
	public void setComanda(Comanda comanda) {
		this.comanda = comanda;
	}
	
	public ArticolComanda(Integer id, Produs produs, Double cantitate) {
		this.id = id;
		this.produs = produs;
		this.cantitate = cantitate;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Produs getProdus() {
		return produs;
	}
	public void setProdus(Produs produs) {
		this.produs = produs;
	}
	public Double getCantitate() {
		return cantitate;
	}
	public void setCantitate(Double cantitate) {
		this.cantitate = cantitate;
	}
	public Double getValoareArticol(){
		if (produs == null || cantitate == null)
			return 0.0;
		
		return produs.getPretUnitar() * cantitate;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArticolComanda other = (ArticolComanda) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "ArticolComanda: id:" + id + ", " + produs
				+ ", cantitate:" + cantitate + ", valoare Articol:"
				+ getValoareArticol();
	}	
	
}
