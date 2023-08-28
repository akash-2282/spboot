package com.zura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zura.model.Software;
import com.zura.repository.SoftwareRepository;

@Service
public class SoftwareServiceImpl implements SoftwareService {

	@Autowired
	SoftwareRepository softwareRepository;

	@Override
	public Software saveSoftware(Software software) {

		return softwareRepository.save(software);
	}
	
	
	public List<Software> getAllSoftwares(){
		
		return softwareRepository.findAll();
	}

}
