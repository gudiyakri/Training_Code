package com.springboot.crudJPARepository.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crudJPARepository.dao.UserEntity;
import com.springboot.crudJPARepository.service.IUserService;

@RestController
@RequestMapping("/userApi")
public class UserController {
	@Autowired
	private IUserService iUserService;

	@PostMapping("/insert")
	public void insertUser(@RequestBody UserEntity user) {
		iUserService.insertUser(user);
	}

	@GetMapping("/get/{id}")
	public UserEntity getUserById(@PathVariable int id) {
		return iUserService.getUserById(id);
	}

	@GetMapping("/findAll")
	public List<UserEntity> findAllUser() {
		return iUserService.getAllUsers();
	}

	@PutMapping("/update/{id}")
	public UserEntity updateUser(@RequestBody UserEntity user, @PathVariable int id) {
		return iUserService.updateUserById(user, id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteUserById(@PathVariable int id) {
		iUserService.deleteUserById(id);
	}
	
	@GetMapping("/sort")
	public List<UserEntity> getAllUserSorted(@RequestParam String sortedBy){
		return iUserService.getAllUserSorted(sortedBy);
	}
	 @GetMapping("/paged")
	    public Page<UserEntity> getUsers(@RequestParam int page, @RequestParam int size) {
	        return iUserService.getUsers(PageRequest.of(page, size));
	    }
}
