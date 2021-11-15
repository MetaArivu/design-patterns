package com.creational.singleton;

public class Lazy {

	private static Lazy lazyInstance;

	private Lazy() {

	}

	public Lazy getInstance() {

		if (lazyInstance == null) {
			lazyInstance = new Lazy();
		}

		return lazyInstance;
	}

}
