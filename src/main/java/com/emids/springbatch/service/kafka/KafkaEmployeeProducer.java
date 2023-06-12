package com.emids.springbatch.service.kafka;

import com.emids.springbatch.entity.kafka.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaEmployeeProducer {
	
	private static final String topic="employeedata";
	
	@Autowired
	KafkaTemplate<String, Employee> kafkaTemplate;
	
	public void publishEmployee(Employee employee) {
		kafkaTemplate.send(topic, employee);
	}

}
