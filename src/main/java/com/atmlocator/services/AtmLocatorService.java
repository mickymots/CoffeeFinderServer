package com.atmlocator.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.atmlocator.domain.AtmDetails;

@Service
public class AtmLocatorService implements AtmLocatorServiceInterface {

	RestTemplate restTemplate = new RestTemplate();
	
	public AtmDetails[] getAllAtms() {
		AtmDetails[] details = restTemplate.getForObject("http://localhost:3000/data", AtmDetails[].class);
		System.out.println("ATM details list::"+details);
		return details;
	}
	
	
}
