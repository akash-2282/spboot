package com.zura.service;

import java.util.List;

import com.zura.model.Software;

public interface SoftwareService {

	Software saveSoftware(Software software);
	
	public List<Software> getAllSoftwares();

}
