package com.zura.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.zura.model.Software;
import com.zura.repository.SoftwareRepository;

@ExtendWith(SpringExtension.class)
class SoftwareServiceTest {
	
	@InjectMocks
	SoftwareServiceImpl softwareService;
	
	@Mock
	SoftwareRepository softwareRepository;
	
	@Test
	void getAllSoftwares() {
		//String data="[{\"id\":1,\"name\":\"tomcat\",\"version\":\"9\"},{\"id\":2,\"name\":\"Chrome\",\"version\":\"116.0.5845.111\"}]";
		Software s1=new Software();
		s1.setId(1L);
		s1.setName("JAVA");
		s1.setVersion("19");
		List<Software> listOfSoftwares=new ArrayList<>();
		listOfSoftwares.add(s1);
        when(softwareRepository.findAll()).thenReturn(listOfSoftwares);
        assertEquals("JAVA", softwareService.getAllSoftwares().get(0).getName());
	}
	
	@Test
	void saveSoftware() {
		Software s1=new Software();
		s1.setId(2L);
		s1.setName("JAVA");
		s1.setVersion("19");
		when(softwareRepository.save(s1)).thenReturn(s1);
		assertNotNull(softwareService.saveSoftware(s1).getId());
		
		
	}
	

}
