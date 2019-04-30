package com.fr.adaming.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fr.adaming.entities.Personne;

@Repository
public interface IPersonneDao extends JpaRepository<Personne, Long>{

	List<Personne> findByNom(String nom);
	List<Personne> findByPrenom(String prenom);
}
