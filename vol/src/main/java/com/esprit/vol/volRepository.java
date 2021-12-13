package com.esprit.vol;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface volRepository  extends JpaRepository<vol, Integer> {
	@Query("select a from vol a where a.depart like :depart")
	public Page<vol> volBydepart(@Param("depart") String n, Pageable pageable);
	   
}
