package com.emids.springbatch.repository;


import com.emids.springbatch.entity.CompanyShare;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ShareRepository extends CrudRepository<CompanyShare, UUID> {

    Optional<CompanyShare> findByShareName(String shareName);

}
