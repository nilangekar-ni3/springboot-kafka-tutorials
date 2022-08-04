package com.app.kafka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/")
public class KafkaResource {
	
	@GetMapping("/notification")
	public void apiRequests() {
		
		
		
	}

}
