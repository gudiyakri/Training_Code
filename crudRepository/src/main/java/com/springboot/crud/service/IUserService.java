package com.springboot.crud.service;

import java.util.List;

import com.springboot.crud.dao.UserEntity;

public interface IUserService {
//save operation
	UserEntity saveUser(UserEntity user);
//read operation
List<UserEntity> fetchUserList();	
//update operation
UserEntity updateUser(UserEntity user,Integer id);
//delete operation
void deleteUserById(Integer id);
}
