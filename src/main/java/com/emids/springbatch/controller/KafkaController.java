package com.emids.springbatch.controller;

import com.emids.springbatch.entity.kafka.Employee;
import com.emids.springbatch.service.kafka.KafkaEmployeeProducer;
import com.emids.springbatch.service.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

	@Autowired
	private KafkaProducer producer;
	
	@Autowired
	private KafkaEmployeeProducer employeeProducer;
	
	@GetMapping("/publish/{message}")
	public String sendMessage( @PathVariable("message") String message) {
		producer.publishToTopic(message);
		return "'"+message+ "' is published";
	}
	
	@GetMapping("/employee")
	public String publishEmployee(@RequestBody Employee employee) {
		employeeProducer.publishEmployee(employee);
		return "Employee published with employeeId"+employee.getEmployeeId();
	}
}
