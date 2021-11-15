package com.creational.singleton;

public class Static {

	private static Static staticInstance;

	static {
		staticInstance = new Static();
	}

	private Static() {

	}

	public Static getInstance() {
		return staticInstance;
	}

}
