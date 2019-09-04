package com.waheedtechblog.springdatajpa.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.waheedtechblog.springdatajpa.domain.Users;
import com.waheedtechblog.springdatajpa.service.UserService;

/**
 * 
 * @author AbdulWaheed18@gmail.com
 *
 */
@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UserService userService;

	@GetMapping("/{id}")
	public ResponseEntity<Users> getUser(@PathVariable String id) {
		return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
	}

	@GetMapping()

	public ResponseEntity<List<Users>> getUsers() {
		return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Object> addUsers(@RequestBody Users user) {
		userService.addUser(user);
		// location to access newly created user, Passing hard coded value for this
		// example. Check location tag under response headers
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand("100").toUri();
		return ResponseEntity.created(location).build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteUser(@PathVariable String id) {
		userService.delete(id);
		return ResponseEntity.noContent().build();
	}

}
