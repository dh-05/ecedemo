package com.dp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dp.demo.domain.User;

@Repository
public interface Loginrepo extends JpaRepository<User, String> {
User findByUsernameAndPassword(String username , String password);
}
