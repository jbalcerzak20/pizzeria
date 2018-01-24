package pl.pizzeria.pizzeria.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="produkty")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7694599471257093934L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nazwa;
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(name="produkt_skladniki",joinColumns= {@JoinColumn(name="produkt_id")},inverseJoinColumns={@JoinColumn(name="skladnik_id")})
	private List<Component> skladniki;
	private Date data;
	private double kosztWykonania;
	@ManyToMany(mappedBy="produkty")
	private List<Order> zamowienia;

	public Product()
	{
		super();
		skladniki = new ArrayList<Component>();
	}

	public Product(String nazwa, List<Component> skladniki, Date data, double kosztWykonania) {
		this();
		this.nazwa = nazwa;
		this.skladniki = skladniki;
		this.data = data;
		this.kosztWykonania = kosztWykonania;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public List<Component> getSkladniki() {
		return skladniki;
	}

	public void setSkladniki(List<Component> skladniki) {
		this.skladniki = skladniki;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getKosztWykonania() {
		return kosztWykonania;
	}

	public void setKosztWykonania(double kosztWykonania) {
		this.kosztWykonania = kosztWykonania;
	}
	
	
	
	
	
	
	
}
