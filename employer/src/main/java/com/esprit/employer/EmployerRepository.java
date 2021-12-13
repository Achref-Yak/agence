package com.esprit.employer;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployerRepository extends JpaRepository<Employer, Integer> {
	@Query("select c from Employer c where c.nom like :nom")
	public Page<Employer> employerByNom(@Param("nom") String n, Pageable pageable);
	   
}
