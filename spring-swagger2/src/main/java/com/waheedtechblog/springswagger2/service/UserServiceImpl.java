package com.waheedtechblog.springswagger2.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.waheedtechblog.springswagger2.domain.Users;

/**
 * For Swagger tutorial, User operation is not importand so I am skipping this
 * part. Will cover it in JPA tutorial.
 * 
 * @author Abdul
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Override
	public Users getUser(String id) {
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
	public void delete(String id) {
		// Delete user

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
