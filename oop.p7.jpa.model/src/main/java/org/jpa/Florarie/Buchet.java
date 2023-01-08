package org.jpa.Florarie;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Buchet {
	// Atribute private
	@Id
	private Integer cod;
	
	private String denumire;
	
	private String um;
	
	private Double pretUnitar;
	
	private List<Floare> flori;

	// Constructori	
	public Buchet(Integer cod, String denumire, String um, Double pretUnitar, List<Floare> flori) {
		super();
		this.cod = cod;
		this.denumire = denumire;
		this.um = um;
		this.pretUnitar = pretUnitar;
		this.flori = flori;
	}
	
	public Buchet(){}
	
	// Getteri si setteri
	
	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public String getUm() {
		return um;
	}

	public void setUm(String um) {
		this.um = um;
	}

	public Double getPretUnitar() {
		return pretUnitar;
	}

	public void setPretUnitar(Double pretUnitar) {
		this.pretUnitar = pretUnitar;
	}

	@Override
	public int hashCode() {
		return Objects.hash(denumire, pretUnitar);
	}

	// Criteriu de egalitate
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Buchet other = (Buchet) obj;
		return Objects.equals(denumire, other.denumire) && Objects.equals(pretUnitar, other.pretUnitar);
	}	

	
	// Operatii specifice logicii modelului afacerii	
	
	public String toString(){
		return "Buchet: cod:" + this.cod + ", denumire:"  + this.denumire;
	}

	public List<Floare> getFlori() {
		return flori;
	}

	public void setFlori(List<Floare> flori) {
		this.flori = flori;
	}	
}