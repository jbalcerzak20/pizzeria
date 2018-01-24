package pl.pizzeria.pizzeria.model.manager;

import java.util.List;

import pl.pizzeria.pizzeria.model.entity.*;

public interface PobierzWszystkieRekordy {

	List<User> getUserAll();
	List<Address> getAddressAll();
	List<Component> getComponentAll();
	List<Order> getOrderAll();
	List<Supplement> getSupplementAll();
	List<Product> getProductAll();
	List<Favourite> getFavouriteAll();
	
}
