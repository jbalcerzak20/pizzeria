package pl.pizzeria.pizzeria.method;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@Component
public class StartHibernate {

	public StartHibernate() {

	}

	@PostConstruct
	public void init() {
		InserToDataBase.insert();
	}
}
