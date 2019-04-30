package com.fr.adaming.service;

import java.util.List;

import com.fr.adaming.entities.Personne;


public interface IPersonneService {

	Personne findOneById(Long id);
	Personne save(Personne p);
	void delete(Personne p);
	List<Personne> getAll();
}
