package com.wave14.c2s1.H2GetPost.repository;

import com.wave14.c2s1.H2GetPost.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,String> {

}
