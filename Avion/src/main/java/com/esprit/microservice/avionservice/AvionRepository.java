package com.esprit.microservice.avionservice;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AvionRepository extends JpaRepository<Avion, Integer> {
	@Query("select a from Avion a where a.type like :type")
	public Page<Avion> avionByType(@Param("type") String n, Pageable pageable);
	   
}
