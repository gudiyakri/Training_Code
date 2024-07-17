package com.springboot.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.crud.dao.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer>{

}
