package pl.pizzeria.pizzeria.model.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Adres")
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7298720950693306151L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String miasto;
	private String ulica;
	private String nrDomu;
	
	public Address()
	{
		super();
	}
	
	public Address(String miasto, String ulica, String nrDomu) {
		this();
		this.miasto = miasto;
		this.ulica = ulica;
		this.nrDomu = nrDomu;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMiasto() {
		return miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getNrDomu() {
		return nrDomu;
	}

	public void setNrDomu(String nrDomu) {
		this.nrDomu = nrDomu;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", miasto=" + miasto + ", ulica=" + ulica + ", nrDomu=" + nrDomu + "]";
	}

	
	
}
