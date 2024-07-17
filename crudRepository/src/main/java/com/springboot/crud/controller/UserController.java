package com.springboot.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crud.dao.UserEntity;
import com.springboot.crud.service.IUserService;


@RestController
public class UserController {
	@Autowired
	private IUserService iUserService;

	@PostMapping("/users")
	public UserEntity saveUser(@RequestBody UserEntity user) {
		return iUserService.saveUser(user);
	}

	
//	@PostMapping(path="/add") // Map ONLY POST Requests
//	  public @ResponseBody String saveUser (@RequestParam String username
//	      , @RequestParam String password) {
//	    UserEntity addV = new UserEntity();
//	    addV.setUsername(username);
//	    addV.setPassword(password);
//	    iUserService.saveUser(addV);
//	    return "Saved";
//	}
	
	@GetMapping("/users")
	public List<UserEntity> fetchUserList() {
		return iUserService.fetchUserList();
	}

	@PutMapping("/users/{id}")
	public UserEntity updateUser(@RequestBody UserEntity user, @PathVariable("id") Integer id) {
		return iUserService.updateUser(user, id);
	}

	@DeleteMapping("/users/{id}")
	public String deleteUserById(@PathVariable("id") Integer id) {
		iUserService.deleteUserById(id);
		return "Deleted Successfully";
	}
}
