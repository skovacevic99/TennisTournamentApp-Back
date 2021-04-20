package com.ftninfowrmatika.jwd48.hardi.testback.service;

import java.util.List;

import com.ftninfowrmatika.jwd48.hardi.testback.model.Format;

public interface FormatService {

	List<Format> findAll();
	
	Format findOne(Long id);
	
	Format update(Format format);
}
