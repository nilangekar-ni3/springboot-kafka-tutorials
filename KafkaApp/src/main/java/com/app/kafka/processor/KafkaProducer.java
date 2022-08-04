package com.app.kafka.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendOnTopic(String inputString) {
		
		kafkaTemplate.send("topic_kafka-demo",inputString);
		
	}
	
}
