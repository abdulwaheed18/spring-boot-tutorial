package com.waheedtechblog.springdatajpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waheedtechblog.springdatajpa.dao.UsersDaoRepository;
import com.waheedtechblog.springdatajpa.domain.Users;

/**
 * For Swagger tutorial, User operation is not importand so I am skipping this
 * part. Will cover it in JPA tutorial.
 * 
 * @author Abdul
 *
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UsersDaoRepository usersDaoRepository;

	@Override
	public Users getUser(String id) {
		return usersDaoRepository.getOne(id);
	}

	@Override
	public List<Users> getUsers() {
		List<Users> users = usersDaoRepository.findAll();
		return users;
	}

	@Override
	public void addUser(Users user) {
		usersDaoRepository.save(user);
	}

	@Override
	public void delete(String id) {
		usersDaoRepository.deleteById(id);
	}
}
