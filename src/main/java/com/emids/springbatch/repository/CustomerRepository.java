package com.emids.springbatch.repository;

import com.emids.springbatch.entity.batch.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
