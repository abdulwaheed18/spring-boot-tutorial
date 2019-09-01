package com.waheedtechblog.springehcache.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.waheedtechblog.springehcache.domain.Users;

/**
 * For Swagger tutorial, User operation is not importand so I am skipping this
 * part. Will cover it in JPA tutorial.
 * 
 * @author Abdul
 *
 */
@Service
// Enable every method annotated with the spring framework caching annotations
// with the specified cache.
// @CacheConfig(cacheNames = "userCahce")
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	@Cacheable(key = "#id", cacheNames = "userCahce")
	// @Cacheable(condition = "#user.id.equals('2')") // based on conditions
	public Users getUser(String id) {
		logger.info("Get user: {}", id);
		return getUser();
	}

	@Override
	public List<Users> getUsers() {
		List<Users> users = new ArrayList<>();
		users.add(getUser());
		return users;
	}

	@Override
	public void addUser(Users user) {
		// Add user to Map
	}

	@Override
	@CachePut(cacheNames = "userCache", key = "#id")
	public void updateUser(String id, Users user) {
		logger.info("Update user: {}", id);

	}

	@Override
	@CacheEvict(key = "#id", cacheNames = "userCahce")
	public void delete(String id) {
		logger.info("Delete user: {}", id);
	}

	private Users getUser() {
		Users user = new Users();
		user.setId("1");
		user.setEmail("abdulwaheed18@gmail.com");
		user.setFisrtName("Abdul");
		user.setLastName("Waheed");

		String dateTime = "1988-01-04";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate formatDate = LocalDate.parse(dateTime, formatter);
		user.setDob(formatDate);

		return user;
	}

}
