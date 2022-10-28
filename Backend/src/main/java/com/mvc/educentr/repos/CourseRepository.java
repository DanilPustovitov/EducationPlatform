package com.mvc.educentr.repos;

import com.mvc.educentr.models.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
}
