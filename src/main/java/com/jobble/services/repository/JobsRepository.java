package com.jobble.services.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jobble.services.model.Jobs;

@RepositoryRestResource(collectionResourceRel = "jobs", path = "jobs")
public interface JobsRepository extends MongoRepository<Jobs, String> {

	List<Jobs> findByPoster(@Param("name") String name);

}