package pl.pizzeria.pizzeria.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="dodatki")
public class Supplement implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2849866794893413427L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nazwa;
	private String opis;
	private double cena;
	private Date data;
	@ManyToMany(mappedBy="dodatki")
	private List<Order> zamowienia;
	
	public Supplement()
	{
		super();
	}

	public Supplement(String nazwa, String opis, double cena, Date data) {
		this();
		this.nazwa = nazwa;
		this.opis = opis;
		this.cena = cena;
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

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Supplement [id=" + id + ", nazwa=" + nazwa + ", opis=" + opis + ", cena=" + cena + ", data=" + data
				+ "]";
	}
	
	

}
