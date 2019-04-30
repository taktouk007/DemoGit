package com.fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.dao.IPersonneDao;
import com.fr.adaming.entities.Personne;

@Service
public class PersonneService implements IPersonneService{

	@Autowired
	private IPersonneDao personneDao;
	
	@Override
	public Personne findOneById(Long id) {
		return personneDao.getOne(id);
	}

	@Override
	public Personne save(Personne p) {
		return personneDao.save(p);
	}

	@Override
	public void delete(Personne p) {
		personneDao.delete(p);
	}

	@Override
	public List<Personne> getAll() {
		return personneDao.findAll();
	}

}
