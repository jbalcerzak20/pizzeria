package pl.pizzeria.pizzeria;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.pizzeria.pizzeria.model.entity.Address;
import pl.pizzeria.pizzeria.model.entity.Component;
import pl.pizzeria.pizzeria.model.entity.Favourite;
import pl.pizzeria.pizzeria.model.entity.Order;
import pl.pizzeria.pizzeria.model.entity.Product;
import pl.pizzeria.pizzeria.model.entity.Supplement;
import pl.pizzeria.pizzeria.model.entity.User;
import pl.pizzeria.pizzeria.model.manager.PobierzWszystkieRekordyImpl;

@RestController
public class Tabela {

	@RequestMapping("/tabela")
	public String getMsg(@RequestParam(value = "msg", defaultValue = "user") String msg) {

		PobierzWszystkieRekordyImpl p = new PobierzWszystkieRekordyImpl();
		String output = "";

		switch (msg) {
		case "user": {
			List<User> l = p.getUserAll();

			for (User user : l) {
				output += user.toString() + "<br>";
			}
		}
			break;
		case "address": {
			List<Address> l = p.getAddressAll();

			for (Address add : l) {
				output += add.toString() + "<br>";
			}
		}
			break;
		case "supplement": {
			List<Supplement> l = p.getSupplementAll();

			for (Supplement sup : l) {
				output += sup.toString() + "<br>";
			}
		}
			break;
		case "component": {
			List<Component> l = p.getComponentAll();

			for (Component c : l) {
				output += c.toString() + "<br>";
			}
		}
			break;
		case "product": {
			List<Product> l = p.getProductAll();

			for (Product pp : l) {
				output += pp.toString() + "<br>";
			}
		}
			break;
		case "favourite": {
			List<Favourite> l = p.getFavouriteAll();

			for (Favourite f : l) {
				output += f.toString() + "<br>";
			}
		}
			break;
		case "order": {
			List<Order> l = p.getOrderAll();

			for (Order o : l) {
				output += o.toString() + "<br>";
			}
		}
			break;

		default:
			break;
		}

		return output;
	}

	@RequestMapping("/user")
	public User getUser()
	{
		return new User();
	}

}
