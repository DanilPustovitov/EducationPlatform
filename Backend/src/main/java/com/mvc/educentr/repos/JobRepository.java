package com.mvc.educentr.repos;

import com.mvc.educentr.models.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Integer> {
}
