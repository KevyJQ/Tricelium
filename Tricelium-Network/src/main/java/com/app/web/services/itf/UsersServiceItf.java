package com.app.web.services.itf;

import java.util.List;

import com.app.web.model.User;

public interface UsersServiceItf {

	public List<User> ListaDeUsuarios();

	public User saveUser(User user);

}
