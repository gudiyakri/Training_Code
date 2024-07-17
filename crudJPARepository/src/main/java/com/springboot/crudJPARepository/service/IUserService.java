package com.springboot.crudJPARepository.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.springboot.crudJPARepository.dao.UserEntity;

@Service
public interface IUserService {
void insertUser(UserEntity user);
UserEntity getUserById(int id);
List<UserEntity> getAllUsers();
UserEntity updateUserById(UserEntity user,int id);

void deleteUserById(int id);

//Sorting with the help of JPAa.
public List<UserEntity> getAllUserSorted(String sortedBy);
Page<UserEntity> getUsers(Pageable pageable);
}
