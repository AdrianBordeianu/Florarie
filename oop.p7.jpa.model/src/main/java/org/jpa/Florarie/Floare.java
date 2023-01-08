package org.jpa.Florarie;

import static javax.persistence.GenerationType.AUTO;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Floare
 *
 */
@Entity
public class Floare implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = AUTO)
	private Integer id;
	
	private String denumire;
	
	private String culoare;
	

	public Floare(Integer id, String denumire, String culoare) {
		this.id = id;
		this.denumire = denumire;
		this.culoare= culoare;
	}
	
	public Floare() {
		super();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Floare other = (Floare) obj;
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
		return "Floare id:" + id + ", denumire:" + denumire;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}	
   
}

