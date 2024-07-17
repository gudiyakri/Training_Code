package com.springboot.crud.serviceImpl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud.dao.UserEntity;
import com.springboot.crud.repository.UserRepository;
import com.springboot.crud.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserRepository userRepos;

	@Override
	public UserEntity saveUser(UserEntity user) {
		return userRepos.save(user);
	}

	@Override
	public List<UserEntity> fetchUserList() {
		return (List<UserEntity>) userRepos.findAll();
	}

	@Override
	public UserEntity updateUser(UserEntity user, Integer id) {
		UserEntity userUpdate = userRepos.findById(id).get();
		if (Objects.nonNull(user.getUsername()) && !"".equalsIgnoreCase(user.getUsername())) {
			userUpdate.setUsername(user.getUsername());
		}

		if (Objects.nonNull(user.getPassword()) && !"".equalsIgnoreCase(user.getPassword())) {
			userUpdate.setPassword(user.getPassword());
		}

		return userRepos.save(userUpdate);
	}

	@Override
	public void deleteUserById(Integer id) {
		userRepos.deleteById(id);
	}

}
