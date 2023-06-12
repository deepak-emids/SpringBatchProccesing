package com.emids.springbatch.service.kafka;


import com.emids.springbatch.entity.kafka.Employee;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaEmployeeConsumer {

	@KafkaListener(topics = "employeedata",groupId = "myemployeegroup")
	public void consumeEmployee(Employee employee) {
		System.out.println("Employee data consumed:"+employee);
		// Persist this object
		// call repository.save method
	}
	
}
