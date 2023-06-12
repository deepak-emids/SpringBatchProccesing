package com.emids.springbatch.service.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "emids2",groupId = "myGroup")
	public void consumeFromTopic(String message) {
		System.out.println("Consumed Message:"+message);
	}
	
}
