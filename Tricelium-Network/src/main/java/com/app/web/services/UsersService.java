package com.app.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.model.User;
import com.app.web.repository.UsersRepository;
import com.app.web.services.itf.UsersServiceItf;

@Service
public class UsersService implements UsersServiceItf {

	// Injectamos el repositorio que contiene los servicios CRUD
	@Autowired
	private UsersRepository repository;

	@Override
	public List<User> ListaDeUsuarios() {
		return repository.findAll();
	}

	@Override
	public User saveUser(User user) {
		return repository.save(user);
	}

}
