package com.example.demo;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
@Service
public interface PiloteRepository extends JpaRepository<Pilote, Integer> {
	@Query("select c from Pilote c where c.nom like :nom")
	public Page<Pilote> piloteByNom(@Param("nom") String n, Pageable pageable);
	   
}
