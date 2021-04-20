package com.ftninfowrmatika.jwd48.hardi.testback.service;

import java.util.List;

import com.ftninfowrmatika.jwd48.hardi.testback.model.Prijava;

public interface PrijavaService {

	List<Prijava> findAll();
	
	Prijava findOne(Long id);
	
	Prijava save(Prijava prijava);
}
