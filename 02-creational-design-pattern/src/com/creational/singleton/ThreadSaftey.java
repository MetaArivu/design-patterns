package com.creational.singleton;

public class ThreadSaftey {

	private static ThreadSaftey instance;

	private ThreadSaftey() {

	}

	public synchronized ThreadSaftey getInstance() {

		if (instance == null) {
			instance = new ThreadSaftey();
		}

		return instance;
	}

}
