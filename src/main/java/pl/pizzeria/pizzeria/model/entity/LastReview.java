package pl.pizzeria.pizzeria.model.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ostatnio_przegladane")
public class LastReview implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7287989303118000500L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	public LastReview()
	{
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
