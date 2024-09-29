package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.repository.UsersRepository;

@SpringBootApplication
public class TriceliumNetworkApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TriceliumNetworkApplication.class, args);
	}

	@Autowired
	private UsersRepository repository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola");
	}
}
