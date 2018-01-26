package pl.pizzeria.pizzeria.model.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="uzytkownicy")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 911163785184759604L;
	
	@Id
//	@Column(columnDefinition = "serial")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String imie;
	private String nazwisko;
	private String email;
	private String telefon;
	private String login;
	private String haslo;
	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="adres_id")
	private Address adres;	

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getHaslo() {
		return haslo;
	}

	public void setHaslo(String haslo) {
		this.haslo = haslo;
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

	public User() {
		super();
	}

	public User(String imie, String nazwisko, String email, String telefon, String login, String haslo, Address adres) {
		this();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.email = email;
		this.telefon = telefon;
		this.login = login;
		this.haslo = haslo;
		this.adres = adres;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", imie=" + imie + ", nazwisko=" + nazwisko + ", email=" + email + ", telefon="
				+ telefon + ", login=" + login + ", haslo=" + haslo + ", adres=" + adres + "]";
	}
	
	

}
