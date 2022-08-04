package com.app.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.kafka.processor.KafkaProducer;

@RestController
@RequestMapping("/rest/")
public class KafkaResource {
	
	@Autowired
	KafkaProducer kafkaProducer;
	
	@GetMapping("/message")
	public void apiRequests(@RequestParam("input") String input) {
		
		System.out.println("Sending input to the Topic");
		kafkaProducer.sendOnTopic(input);
		
	}

}
