package com.srp;

import java.io.IOException;

//Main class to test
public class Main {

	public static void main(String[] args) throws IOException {
		UserAPI controller = new UserAPI();

		String response = controller.createUser(new User("Randy", "randy@email.com", "110 Sugar lane"));

		System.out.println(response);

		response = controller.createUser(new User("Randy", "randy@", "110 Sugar lane"));

		System.out.println(response);

	}

}
