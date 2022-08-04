package com.app.kafka.processor;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaReceiver {
	
	@KafkaListener(topics = "topic_kafka-demo", groupId = "group_kafka-demo")
	public void inputReceiver(String receivedInput) {
		
		System.out.println("Received Input as-"+receivedInput);
	}

}
