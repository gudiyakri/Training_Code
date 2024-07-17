package com.springboot.crudJPARepository.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.crudJPARepository.dao.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Integer> { // Declares the UserRepository interface which extends JpaRepository for UserEntity with the primary key type Integer.

} // End of the UserRepository interface.

