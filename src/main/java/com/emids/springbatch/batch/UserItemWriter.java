package com.emids.springbatch.batch;

import com.emids.springbatch.entity.AppUser;
import com.emids.springbatch.repository.AppUserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserItemWriter implements ItemWriter<AppUser>{

	@Autowired
	private AppUserRepository repository;
	
	@Override
	public void write(List<? extends AppUser> items) throws Exception {
		System.out.println("Saving all App Users..."+items);
		repository.saveAll(items);	
	}
}