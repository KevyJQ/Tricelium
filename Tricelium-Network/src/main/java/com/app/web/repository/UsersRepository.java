package com.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.model.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Long> {

}
