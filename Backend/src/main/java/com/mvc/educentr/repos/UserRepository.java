package com.mvc.educentr.repos;

import com.mvc.educentr.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
