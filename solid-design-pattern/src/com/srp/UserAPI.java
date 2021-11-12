package com.srp;

import java.io.IOException;

public class UserAPI {

	private UserPersistenceService persistenceService = new UserPersistenceService();

	// Create a new user
	public String createUser(User user) throws IOException {

		UserValidator validator = new UserValidator();
		boolean valid = validator.validateUser(user);

		if (!valid) {
			return "ERROR";
		}

		persistenceService.saveUser(user);

		return "SUCCESS";
	}

}