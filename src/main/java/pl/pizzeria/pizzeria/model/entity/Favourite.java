package pl.pizzeria.pizzeria.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ulubione")
public class Favourite implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8646501194698206131L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private User klient;
	private Product produkt;
	private Supplement dodatek;
	private Date data;
	
	public Favourite()
	{
		super();
	}

	public Favourite(User klient, Product produkt, Supplement dodatek, Date data) {
		this();
		this.klient = klient;
		this.produkt = produkt;
		this.dodatek = dodatek;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getKlient() {
		return klient;
	}

	public void setKlient(User klient) {
		this.klient = klient;
	}

	public Product getProdukt() {
		return produkt;
	}

	public void setProdukt(Product produkt) {
		this.produkt = produkt;
	}

	public Supplement getDodatek() {
		return dodatek;
	}

	public void setDodatek(Supplement dodatek) {
		this.dodatek = dodatek;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Favourite [id=" + id + ", klient=" + klient + ", produkt=" + produkt + ", dodatek=" + dodatek
				+ ", data=" + data + "]";
	}
	
	
	
	

}
