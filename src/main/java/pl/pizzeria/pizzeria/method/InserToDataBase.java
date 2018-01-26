package pl.pizzeria.pizzeria.method;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import pl.pizzeria.pizzeria.model.entity.Address;
import pl.pizzeria.pizzeria.model.entity.Component;
import pl.pizzeria.pizzeria.model.entity.Order;
import pl.pizzeria.pizzeria.model.entity.Product;
import pl.pizzeria.pizzeria.model.entity.Supplement;
import pl.pizzeria.pizzeria.model.entity.User;

public class InserToDataBase {

	private static SessionFactory factory;
	private static Session session;
	
	
	public static void insert()
	{
		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session = factory.openSession();
		
		session.beginTransaction();

		
		Component s1 = new Component("Ser",10,0.55,"g",new Date());
		Component s2 = new Component("Szynka",100,0.50,"g",new Date());
		Component s3 = new Component("Cebula",50,0.25,"g",new Date());
		
		Supplement su1 = new Supplement("Pepsi","",4.0,new Date());
		Supplement su2 = new Supplement("Cola","",4.0,new Date());
		Supplement su3 = new Supplement("Sok pomarańczowy","200ml",3.50,new Date());
		
		Address a1 = new Address("Kielce","Warszawska","134/2");
		Address a2 = new Address("Kielce","Żytnia","10");
		Address a3 = new Address("Kielce","Łódzka","20/6");	
		
		User u1 = new User("Jan","Kowalski","example@gmail.com","jan","","",a1);
		User u2 = new User("Maciek","Ostrowski","example2@gmail.com","maciek","","",a2);
		User u3 = new User("Kasia","Majczak","example3@gmail.com","kasia","","",a3);	
		
		List<Component> comp = new ArrayList<>();
		List<Component> comp2 = new ArrayList<>();
		comp.add(s1);
		comp.add(s3);
		comp2.add(s2);	
		
		Product p1 = new Product("Pizza max",comp,new Date(),3.20);
		Product p2 = new Product("Pizza hat",comp2,new Date(),3.20);	
		
		List<Product> plist1 = new ArrayList<>();
		List<Product> plist2 = new ArrayList<>();
		plist1.add(p2);
		plist2.add(p2);
		plist2.add(p2);
		
		List<Supplement> slist1 = new ArrayList<>();
		List<Supplement> slist2 = new ArrayList<>();	
		slist1.add(su1);		
		
		
		Order o1 = new Order(a2,u1,u3,34.20,23,plist1,slist1,new Date());
		Order o2 = new Order(a3,u2,u3,70.28,23,plist2,slist2,new Date());	

		
		session.save(s1);
		session.save(s2);		
		session.save(s3);	
		
		session.save(su1);
		session.save(su2);
		session.save(su3);

		session.save(u1);
		session.save(u2);
		session.save(u3);
		
		session.save(p1);
		session.save(p2);		
		
		session.save(o1);
		session.save(o2);
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
	
}
