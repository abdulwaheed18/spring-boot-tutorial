package com.waheedtechblog.springdatajpa.dao;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.waheedtechblog.springdatajpa.domain.Users;

//@Repository  makes the unchecked exceptions (thrown from DAO methods) eligible for translation into Spring DataAccessException.
@Repository
public interface UsersDaoRepository extends JpaRepository<Users, String> {

	// save, delete, find by Id is already provided by JPA

	// JPA will generates queries from the method name.
	Users findByFirstName(String firstName);

	Users findByFirstNameIgnoreCase(String firstName);

	// Fetch user whose firstName AND lastName should match with passed argument
	Users findByFirstNameAndLastName(String fname, String lastName);

	// will fetch list of users having lastname
	List<Users> findByLastName(String lastname);

	Users findByEmail(String email);

	// We can also pass customize queries
	@Query("select u from Users u where u.email = ?1")
	Users findByEmailAddress(String email);

	@Query(value = "SELECT * FROM USERS WHERE LASTNAME = ?1", countQuery = "SELECT count(*) FROM USERS WHERE LASTNAME = ?1", nativeQuery = true)
	Page<Users> findByLastName(String lastname, Pageable pageable);

	@Query("select u from Users u where u.lastName like ?1%")
	List<Users> findByAndSort(String lastname, Sort sort);

	@Query("select u from Users u where u.firstName like %?1")
	List<Users> findByFirstnameStartingWith(String firstName);

	@Query("select u from Users u where u.email like %?1")
	List<Users> findByEmailEndingWith(String email);

}
