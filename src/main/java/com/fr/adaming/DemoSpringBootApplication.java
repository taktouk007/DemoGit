package com.fr.adaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.fr.adaming.dao.IPersonneDao;
import com.fr.adaming.entities.Personne;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(DemoSpringBootApplication.class, args);
		IPersonneDao pdao = ctx.getBean(com.fr.adaming.dao.IPersonneDao.class);
		Personne p = new Personne(null, "Ben ali", "Ibrahim");
		pdao.save(p);
	}

}
