package com.ftninfowrmatika.jwd48.hardi.testback.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftninfowrmatika.jwd48.hardi.testback.model.Format;
import com.ftninfowrmatika.jwd48.hardi.testback.repository.FormatRepository;
import com.ftninfowrmatika.jwd48.hardi.testback.service.FormatService;

@Service
public class JpaFormatService implements FormatService {

	@Autowired
	private FormatRepository formatRepository;
	
	@Override
	public List<Format> findAll() {
		return formatRepository.findAll();
	}

	@Override
	public Format findOne(Long id) {
		return formatRepository.findOneById(id);
	}

	@Override
	public Format update(Format format) {
		return formatRepository.save(format);
	}

}
