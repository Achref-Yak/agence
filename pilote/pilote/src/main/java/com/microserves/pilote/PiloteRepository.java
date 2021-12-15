package com.microserves.pilote;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PiloteRepository extends JpaRepository<Pilote, Integer> {
	@Query("select c from Pilote c where c.nom like :nom")
	public Page<Pilote> piloterByNom(@Param("nom") String n, Pageable pageable);
	   
}
