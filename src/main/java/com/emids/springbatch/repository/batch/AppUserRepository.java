package com.emids.springbatch.repository.batch;

import com.emids.springbatch.entity.batch.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Integer>{

}
