package com.waheedtechblog.springehcache.service;

import java.util.List;

import com.waheedtechblog.springehcache.domain.Users;

public interface UserService {

	public Users getUser(String id);

	public List<Users> getUsers();

	public void addUser(Users user);

	public void updateUser(String id, Users user);

	public void delete(String id);

}
