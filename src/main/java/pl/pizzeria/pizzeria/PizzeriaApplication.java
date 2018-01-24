package pl.pizzeria.pizzeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.pizzeria.pizzeria.method.InserToDataBase;

@RestController
@SpringBootApplication
public class PizzeriaApplication {

	@RequestMapping(value = "/say", method = RequestMethod.GET)
	public String sayHello()
	{
		return "hello hello say";
	}


	public static void main(String[] args)
	{
		SpringApplication.run(PizzeriaApplication.class, args);
	}
}
