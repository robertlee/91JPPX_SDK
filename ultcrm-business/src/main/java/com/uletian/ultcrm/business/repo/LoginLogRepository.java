package com.uletian.ultcrm.business.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.uletian.ultcrm.business.entity.LoginLog;

@RepositoryRestResource(collectionResourceRel = "loginLog", path = "loginLog")
public interface LoginLogRepository extends PagingAndSortingRepository<LoginLog, Long>{
	

	
    
}
