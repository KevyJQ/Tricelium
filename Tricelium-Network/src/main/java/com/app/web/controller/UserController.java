package com.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.model.User;
import com.app.web.services.itf.UsersServiceItf;

@Controller
public class UserController {

	// Injectamos el repositorio
	@Autowired
	private UsersServiceItf servicio;

	// Generamos nuestras peticiones
	@GetMapping({ "/users", "/" })
	public String UsersList(Model model) {
		model.addAttribute("users", servicio.ListaDeUsuarios());
		return "users"; // Nos retorna al archivo de Usuarios
	}

	@PostMapping("/users")
	public String saveUser(@ModelAttribute("User") User user) {
		servicio.saveUser(user);
		return "redirect:/users";
	}
}
