package com.ftninfowrmatika.jwd48.hardi.testback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftninfowrmatika.jwd48.hardi.testback.model.Prijava;

@Repository
public interface PrijavaRepository extends JpaRepository<Prijava, Long> {

	Prijava findOneById(Long id);
}
