package pl.pizzeria.pizzeria.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="zamowienia")
public class Order implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3147943021699886694L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="adres_id")
	private Address adres;
	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="klient_id")
	private User klient;
	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="kasjer_id")
	private User kasjer;
	private double cena;
	private double vat;
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(name="zamowienia_produkty",joinColumns= {@JoinColumn(name="zamowienie_id")},inverseJoinColumns={@JoinColumn(name="produkt_id")})
	private List<Product> produkty;
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(name="zamowienia_dodatki",joinColumns= {@JoinColumn(name="zamowienie_id")},inverseJoinColumns={@JoinColumn(name="dodatek_id")})	
	private List<Supplement> dodatki;
	private Date data;
	
	public Order()
	{
		super();
		produkty = new ArrayList<>();
		dodatki = new ArrayList<>();
	}
	
	public Order(Address adres, User klient, User kasjer, double cena, double vat, List<Product> produkty,
			List<Supplement> dodatki, Date data) {
		
		this();
		this.adres = adres;
		this.klient = klient;
		this.kasjer = kasjer;
		this.cena = cena;
		this.vat = vat;
		this.produkty = produkty;
		this.dodatki = dodatki;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAdres() {
		return adres;
	}

	public void setAdres(Address adres) {
		this.adres = adres;
	}

	public User getKlient() {
		return klient;
	}

	public void setKlient(User klient) {
		this.klient = klient;
	}

	public User getKasjer() {
		return kasjer;
	}

	public void setKasjer(User kasjer) {
		this.kasjer = kasjer;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public double getVat() {
		return vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	public List<Product> getProdukty() {
		return produkty;
	}

	public void setProdukty(List<Product> produkty) {
		this.produkty = produkty;
	}

	public List<Supplement> getDodatki() {
		return dodatki;
	}

	public void setDodatki(List<Supplement> dodatki) {
		this.dodatki = dodatki;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
	

}
