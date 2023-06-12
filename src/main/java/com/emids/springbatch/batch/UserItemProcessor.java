package com.emids.springbatch.batch;

import com.emids.springbatch.entity.batch.AppUser;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class UserItemProcessor implements ItemProcessor<AppUser, AppUser>{

	@Override
	public AppUser process(AppUser item) throws Exception {
		// some processing, according to business requirement
		
		item.setDepartment(item.getDepartment().toUpperCase());
		item.setSalary((int) (item.getSalary()*1.1));
		return item;
	}	
}
