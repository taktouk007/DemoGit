package com.fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.entities.Personne;
import com.fr.adaming.service.IPersonneService;

@RestController
public class PersonneController {
	
	
	@Autowired
	private IPersonneService personneDao;
	
	@GetMapping("/api/get/{id}")
	public Personne findOneById(@PathVariable Long id) {
		return personneDao.findOneById(id);
	}

	@PostMapping("/api/save")
	public Personne save(@RequestBody Personne p) {
		return personneDao.save(p);
	}

	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Personne p) {
		personneDao.delete(p);
	}

	@GetMapping("/api/getall")
	public List<Personne> getAll() {
		return personneDao.getAll();
	}

}
