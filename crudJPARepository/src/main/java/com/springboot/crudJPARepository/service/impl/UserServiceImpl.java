package com.springboot.crudJPARepository.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.springboot.crudJPARepository.dao.UserEntity;
import com.springboot.crudJPARepository.repository.UserRepository;
import com.springboot.crudJPARepository.service.IUserService;

@Component
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserRepository userRepo;

	@Override
	public void insertUser(UserEntity user) {
		userRepo.save(user);
	}

	@Override
	public UserEntity getUserById(int id) {
		return userRepo.findById(id).orElseThrow();
	}

	@Override
	public List<UserEntity> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public UserEntity updateUserById(UserEntity user, int id) {
		UserEntity userFromDb = userRepo.findById(id).get();
		userFromDb.setUsername(user.getUsername());
		userFromDb.setPassword(user.getPassword());
		return userRepo.save(userFromDb);
	}

	@Override
	public void deleteUserById(int id) {
		userRepo.deleteById(id);
	}

	@Override
	public List<UserEntity> getAllUserSorted(String SortedBy) {
		return userRepo.findAll(Sort.by(SortedBy));
	}
	@Override
    public Page<UserEntity> getUsers(Pageable pageable) {
        return userRepo.findAll(pageable);
    }

}
