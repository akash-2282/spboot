package com.zura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zura.model.Software;
import com.zura.service.SoftwareService;

@RestController
public class SoftwareController {

	@Autowired
	SoftwareService service;

	@PostMapping("/saveSoftware")
	public Software saveSoftware(@RequestBody Software software) {
		
		return service.saveSoftware(software);
	}
	
	@GetMapping("/getAllSoftwares")
	public List<Software> getAllSoftwares(){
	
		return service.getAllSoftwares();
	}
}
