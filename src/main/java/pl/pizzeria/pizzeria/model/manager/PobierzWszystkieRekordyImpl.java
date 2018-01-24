package pl.pizzeria.pizzeria.model.manager;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import pl.pizzeria.pizzeria.model.entity.Address;
import pl.pizzeria.pizzeria.model.entity.Component;
import pl.pizzeria.pizzeria.model.entity.Favourite;
import pl.pizzeria.pizzeria.model.entity.Order;
import pl.pizzeria.pizzeria.model.entity.Product;
import pl.pizzeria.pizzeria.model.entity.Supplement;
import pl.pizzeria.pizzeria.model.entity.User;

public class PobierzWszystkieRekordyImpl implements PobierzWszystkieRekordy {

	private Session session;
	private SessionFactory factory;
	
	public PobierzWszystkieRekordyImpl()
	{
		init();
	}
	
	private void init()
	{		
		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session = factory.openSession();
	}
	
	@Override
	public List<User> getUserAll() {
		Query q = session.createQuery("SELECT u from User u"); 
		List<User> lista = q.list(); 
		return lista;
	}

	@Override
	public List<Address> getAddressAll() {
		Query q = session.createQuery("SELECT a from Address a"); 
		List<Address> lista = q.list(); 
		return lista;
	}

	@Override
	public List<Component> getComponentAll() {
		Query q = session.createQuery("SELECT c from Component c"); 
		List<Component> lista = q.list(); 
		return lista;
	}

	@Override
	public List<Order> getOrderAll() {
		Query q = session.createQuery("SELECT o from Order o"); 
		List<Order> lista = q.list(); 
		return lista;
	}

	@Override
	public List<Supplement> getSupplementAll() {
		Query q = session.createQuery("SELECT s from Supplement s"); 
		List<Supplement> lista = q.list(); 
		return lista;
	}

	@Override
	public List<Product> getProductAll() {
		Query q = session.createQuery("SELECT p from Product p"); 
		List<Product> lista = q.list(); 
		return lista;
	}

	@Override
	public List<Favourite> getFavouriteAll() {
		Query q = session.createQuery("SELECT f from Favourite f"); 
		List<Favourite> lista = q.list(); 
		return lista;
	}
	
	public void close()
	{
		factory.close();
		session.close();
	}

}
