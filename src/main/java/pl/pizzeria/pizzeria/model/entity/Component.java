package pl.pizzeria.pizzeria.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="skladniki")
public class Component implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1378811328221835433L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nazwa;
	private double ilosc;
	private double cena;
	private String jednostka;
	private Date data;
	@ManyToMany(mappedBy="skladniki")
	private List<Product> produkty;

	public Component() {
		super();
	}

	public Component(String nazwa, double ilosc, double cena, String jednostka, Date data) {
		this();
		this.nazwa = nazwa;
		this.ilosc = ilosc;
		this.cena = cena;
		this.jednostka = jednostka;
		this.data = data;
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

	public double getIlosc() {
		return ilosc;
	}

	public void setIlosc(double ilosc) {
		this.ilosc = ilosc;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public String getJednostka() {
		return jednostka;
	}

	public void setJednostka(String jednostka) {
		this.jednostka = jednostka;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	
}
