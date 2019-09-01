package com.waheedtechblog.springswagger2.service;

import java.util.List;

import com.waheedtechblog.springswagger2.domain.Users;

public interface UserService {

	public Users getUser(String id);

	public List<Users> getUsers();

	public void addUser(Users user);

	public void delete(String id);

}
