package com.tricelium.main;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	static final String URL = "jdbc:postgresql://localhost:0000/name-database";
	static final String USER = "user";
	static final String PASS = "password";

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			if (conn != null) {
				System.out.println("Conexion establecida...");
			}
		} catch (Exception e) {
			System.out.println("Ocurrio un error: " + e.getMessage());
		}
	}
}
